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
WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/checkLanguageElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Find Jobs')), 'Find Jobs', false)

WebUI.click(findTestObject('Object Repository/checkLanguageElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/span_EN'))

WebUI.click(findTestObject('Object Repository/checkLanguageElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/span_DE'))

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/checkLanguageElements/Page_Jobbrse, Jobangebote - Jobstoday.world/a_Jobs finden')), 'Jobs finden', false)


WebUI.click(findTestObject('Object Repository/checkLanguageElements/Page_/span_DE'))

WebUI.click(findTestObject('Object Repository/checkLanguageElements/Page_/span_ES'))

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/checkLanguageElements/Page_/a_Encontrar Empleos')), 'Encontrar Empleos', false)

WebUI.click(findTestObject('Object Repository/checkLanguageElements/Page_/span_ES_1'))

WebUI.click(findTestObject('Object Repository/checkLanguageElements/Page_/span_PL'))

WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/checkLanguageElements/Page_/a_Znajd prac')), 'Znajdź pracę', false)


WebUI.closeBrowser()

