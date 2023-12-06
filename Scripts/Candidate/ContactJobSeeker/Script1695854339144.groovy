import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.List
import javax.mail.Authenticator
import javax.mail.PasswordAuthentication

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory

import java.util.Properties
import javax.activation.DataHandler
import javax.activation.FileDataSource
import javax.mail.*
import javax.mail.internet.*


WebUI.callTestCase(findTestCase('Test Cases/Candidate/LoginCandidateTCs/CandidatLoginTC'), [:])

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/img_1'))
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/MailBox'))
String JobSeekerEmail = WebUI.getText(findTestObject('Object Repository/ContactJobSeeker/JobSeekerEmail'))

// Specify the email address and password for your Outlook account
String username = GlobalVariable.outlookEmail
String password = GlobalVariable.outlookPassword // Replace with your Outlook account password

// Specify the recipient email address
String recipient = JobSeekerEmail

// Set up the mail server properties
Properties props = new Properties()
props.put("mail.smtp.auth", "true")
props.put("mail.smtp.starttls.enable", "true")
props.put("mail.smtp.host", "smtp.office365.com")
props.put("mail.smtp.port", "587")

// Create a new session with the mail server
Session session = Session.getInstance(props, new Authenticator() {
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password)
	}
})

String expectedSubject = "Test email"
int maxRetries = 3
int retryCount = 0

while (retryCount < maxRetries) {
	try {
		// Create a new message
		MimeMessage message = new MimeMessage(session)
		message.setFrom(new InternetAddress(username))
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient))
		message.setSubject(expectedSubject)

		// Create a multipart message body
		MimeMultipart multipart = new MimeMultipart()

		// Create a text/plain message body part
		MimeBodyPart messageBodyPart = new MimeBodyPart()
		messageBodyPart.setText("This is a test email.")
		multipart.addBodyPart(messageBodyPart)

		// Set the multipart message body as the message content
		message.setContent(multipart)

		// Send the message
		Transport.send(message)

		// Print a success message
		println("Email sent successfully!")
		break // exit the loop if email is sent successfully
	} catch (AuthenticationFailedException ex) {
		// Print an authentication failure message
		println("Authentication failed. Retrying...")

		// Increment the retry count
		retryCount++
		
		// You might want to add a delay here before retrying (e.g., Thread.sleep(1000))

	} catch (Exception ex) {
		// Print an error message
		println("Error sending email: " + ex.getMessage())
		break // exit the loop if an unexpected error occurs
	}
}

if (retryCount == maxRetries) {
	println("Max retries reached. Could not send email.")
}

Thread.sleep(5000)

WebUI.refresh() 
String actualSubject = WebUI.getText(findTestObject('Object Repository/ContactJobSeeker/SubjectOfFirstEmail'))
WebUI.verifyMatch(actualSubject, excpectedSubject, false)

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/checkBoxForAllMailBox'))
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/deleteAllMailBoxes'))

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/yesForDeletion'))

