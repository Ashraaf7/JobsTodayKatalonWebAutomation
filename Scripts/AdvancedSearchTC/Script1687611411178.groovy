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
WebUI.navigateToUrl('https://www.jobstoday.world/en/')
WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

Thread.sleep(3000);

WebUI.click(findTestObject('Object Repository/AdvancedSearchElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))
Thread.sleep(3000);

WebUI.click(findTestObject('Object Repository/AdvancedSearchElements/Page_/img'))

WebUI.click(findTestObject('Object Repository/AdvancedSearchElements/Page_/span_Filter_select2-selection select2-selec_809b49'))
def driver = DriverFactory.getWebDriver()
By G= By.id("country")
WebElement CountryDrop= driver.findElement(G)
Select dropDown = new Select(CountryDrop)
dropDown.selectByVisibleText("Germany")

WebUI.click(findTestObject('Object Repository/AdvancedSearchElements/Page_/button_Clear'))

WebUI.click(findTestObject('Object Repository/AdvancedSearchElements/Page_/span_Search'))
Thread.sleep(3000);

WebUI.verifyElementVisible(findTestObject('Object Repository/AdvancedSearchElements/Page_/p_4977362 jobs found'))

WebUI.closeBrowser()

