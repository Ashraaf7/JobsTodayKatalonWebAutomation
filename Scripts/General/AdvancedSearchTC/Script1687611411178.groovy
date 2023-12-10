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
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.By.ById
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.Select as Keys
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.Staging)
	
if (WebUI.verifyElementVisible(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

Thread.sleep(3000);
WebUI.click(findTestObject('Object Repository/AdvancedSearchElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/findJobsButton'))

WebUI.clearText(findTestObject('Object Repository/AdvancedSearchElements/Page_/locationInputWhenSearching'))

WebUI.click(findTestObject('Object Repository/AdvancedSearchElements/Page_/advancedButton'))

def country = "Germany"


WebUI.selectOptionByLabel(findTestObject('Object Repository/AdvancedSearchElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/countryDropDown'), country, false)
WebUI.click((findTestObject('Object Repository/AdvancedSearchElements/Page_/applyFilterButton')))
Thread.sleep(3000);
def ActualCountry = WebUI.getText(findTestObject('Object Repository/SearchForJobUsingKeywordAndLocation/Page_/locationElement'))
ActualCountryStatus = ActualCountry.contains(country)
WebUI.verifyEqual(ActualCountryStatus,true)

WebUI.closeBrowser()

