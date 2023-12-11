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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions

WebUI.callTestCase(findTestCase('Test Cases/Candidate/LoginCandidateTCs/CandidatLoginTC'),  [:])

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/DashboardButton'))
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/MailBox'))
String JobSeekerOneEmail = WebUI.getText(findTestObject('Object Repository/ContactJobSeeker/JobSeekerEmail'))
WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Test Cases/Candidate/RegisterCandidateTCs/registerAsCandidateUsingEmailFromRegisterPageTC'),  [:])
WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/MailBox'))
String JobSeekerTwoEmail = WebUI.getText(findTestObject('Object Repository/ContactJobSeeker/JobSeekerEmail'))

WebUI.verifyNotEqual(JobSeekerOneEmail, JobSeekerTwoEmail)

WebUI.closeBrowser()
