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

WebUI.callTestCase(findTestCase('Employer/LoginTCs/EmployerLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/SearchForJobUsingKeywordAndLocation/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Find Jobs'))

WebUI.setText(findTestObject('Object Repository/SearchForJobUsingKeywordAndLocation/Page_/input_PL_keywords'), 'tester')

WebUI.setText(findTestObject('Object Repository/SearchForJobUsingKeywordAndLocation/Page_/input_PL_location'), 'Amsterdam, Nederland')

WebUI.click(findTestObject('Object Repository/SearchForJobUsingKeywordAndLocation/Page_/img'))

String JobLabel = WebUI.getText(findTestObject('Object Repository/SearchForJobUsingKeywordAndLocation/Page_/a_Tester'))

String Location = WebUI.getText(findTestObject('Object Repository/SearchForJobUsingKeywordAndLocation/Page_/span_Amsterdam, Nederland'))

WebUI.verifyMatch(JobLabel, 'Tester', false)

WebUI.verifyMatch(Location, 'Amsterdam, Nederland', false)

WebUI.closeBrowser()