import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.Properties
import javax.mail.*
import javax.mail.internet.*
import java.util.Properties
import javax.mail.*
import javax.mail.internet.*
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.kms.katalon.core.util.KeywordUtil

// Specify the email address and password for your Outlook account
String username = GlobalVariable.outlookEmail
String password = GlobalVariable.outlookPassword // Replace with your Outlook account password

// Set up the mail server properties for IMAP
Properties props = new Properties()
props.put("mail.store.protocol", "imaps") // Use IMAPS (secure IMAP)
props.put("mail.imap.host", "outlook.office365.com") // IMAP server hostname for Outlook
props.put("mail.imap.port", "993") // IMAP server port for Outlook

// Create a new session with the mail server
Session session = Session.getInstance(props)

int maxRetries = 3
int retryCount = 0

while (retryCount < maxRetries) {
	try {
		// Connect to the IMAP server
		Store store = session.getStore("imaps")
		store.connect("outlook.office365.com", username, password)

		// Open the Inbox folder
		Folder inbox = store.getFolder("INBOX")
		inbox.open(Folder.READ_ONLY) // Open the folder in read-only mode

		// Refresh the Inbox by reopening it
		inbox.close(false)
		inbox.open(Folder.READ_ONLY)
		
		// Retrieve the latest email
		Message[] messages = inbox.getMessages()
		int latestIndex = messages.length - 1
		Message latestMessage = messages[latestIndex]

		// Print information about the latest email
		println("Subject: " + latestMessage.getSubject())
		println("From: " + InternetAddress.toString(latestMessage.getFrom()))
		println("Received Date: " + latestMessage.getReceivedDate())
		// You can add more code to access the content of the latest message if needed

		// Get the content of the latest email
		Object content = latestMessage.getContent()
		if (content instanceof String) {
			String textContent = (String) content
			println("Email Body:\n" + textContent)
			// Define the regex pattern for extracting the URL
			Pattern pattern = Pattern.compile(GlobalVariable.Staging+"login/resetpassword/\\w+");
			
			// Create a Matcher object
			Matcher matcher = pattern.matcher(textContent);
			// Find and print the URL
			if (matcher.find()) {
				String url = matcher.group();
				System.out.println("URL: " + url);
				GlobalVariable.urlForChangeEmail = url;
			}
		}

		// Close the Inbox folder and the store when done
		inbox.close(false)
		store.close()

		// Break out of the loop if authentication and email retrieval are successful
		break;
	} catch (Exception ex) {
		// Print an error message
		println("Error authenticating or retrieving email: " + ex.getMessage())

		// Increment the retry count
		retryCount++

		if (retryCount < maxRetries) {
			// Print a retry message
			println("Retrying authentication...")
			Thread.sleep(2000)
		} else {
			// Max retries reached, print a failure message
			println("Max retries reached. Could not authenticate or retrieve email.")
		}
	}
}



