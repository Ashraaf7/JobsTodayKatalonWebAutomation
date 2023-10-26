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
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select

WebUI.callTestCase(findTestCase('Candidate/RegisterCandidateTCs/registerAsCandidateUsingEmailFromRegisterPageTC'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/img'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/a_SETTINGS'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/button_Edit'))

WebUI.setText(findTestObject('Object Repository/ChangePasswordElements/Page_/input_Current password_input_current_password'), 
    'Pass@123')

WebUI.setText(findTestObject('Object Repository/ChangePasswordElements/Page_/input_New password_input_new_password'), 'Pass@123')

WebUI.setText(findTestObject('Object Repository/ChangePasswordElements/Page_/input_Repeat new password_input_confirm_password'), 
    'Pass@123')

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/button_Save'))

r

WebUI.closeBrowser()

