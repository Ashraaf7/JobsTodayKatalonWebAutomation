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

WebUI.openBrowser('')
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.jobstoday.world/en/')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/ResetPasswordElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Login'))
WebUI.scrollToPosition(693,  700)
WebUI.click(findTestObject('Object Repository/ResetPasswordElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/a_Forgotten password'))

WebUI.setText(findTestObject('Object Repository/ResetPasswordElements/Page_/input_Email address_email'), 'ahmedashraaf09@gmail.com')

WebUI.click(findTestObject('Object Repository/ResetPasswordElements/Page_/button_Reset Now'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ResetPasswordElements/Page_/h3_Link has been sent to your email address'))

WebUI.closeBrowser()

