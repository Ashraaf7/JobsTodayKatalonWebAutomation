import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.Clipboard as Clipboard
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
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
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

String companyDesc = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s"
WebUI.callTestCase(findTestCase('Employer/LoginTCs/EmployerLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/DashboardButton'))

String projectDirectory = RunConfiguration.getProjectDir().replaceAll('/', '\\\\')

String path = (projectDirectory + '\\') + 'Attachments\\image.jpg'

TestObject data_URL = findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/data URL')

if (!WebUI.getAttribute(data_URL, 'data-url').equals('0')) {
	WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Change profile picture_09d0cb'))
	WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/change profile'))}
else
WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Change profile picture_09d0cb'))

WebUI.sendKeys(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/span_Select File_cropper-face cropper-move'), path)

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/button_Save'))

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Edit profile'))

WebUI.clearText(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/company Description'))

WebUI.sendKeys(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/company Description'), companyDesc)

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/save btn description'))

String CompanyDescriptionTxt = WebUI.getText(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/companyDescriptionVerify'))

WebUI.verifyMatch(companyDesc, CompanyDescriptionTxt, false)

WebUI.closeBrowser()