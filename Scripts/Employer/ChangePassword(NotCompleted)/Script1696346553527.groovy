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

String newPassword = 'Pass@12345'

WebUI.callTestCase(findTestCase('Employer/EmployerLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/span_Settings'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/button_Change password'))

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/input_Change password_current_password'), 
    GlobalVariable.newPassword)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/input_Enter valid password_new_password'), 
    newPassword)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/input_Enter valid password_confirm_password'), 
    newPassword)

GlobalVariable.newPassword = newPassword

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/h2_Login now to Jobstoday.world'))

WebUI.callTestCase(findTestCase('Employer/EmployerLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

// Login with the new password 
/* WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Email address_input_email'), 
    GlobalVariable.EmployerEmail)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Password_input_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/div_reCAPTCHA_recaptcha-checkbox-border (1)'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/button_Login'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/h1_Jobs for everyone everywhere'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/h1_Jobs for everyone everywhere'))

*/