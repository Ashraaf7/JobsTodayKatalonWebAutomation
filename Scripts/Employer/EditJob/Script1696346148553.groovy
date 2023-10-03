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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions

String newTitle = 'Job title new after edit'

WebUI.callTestCase(findTestCase('Employer/CheckPostedJobs'), [:], FailureHandling.STOP_ON_FAILURE)
// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

TestObject settings = findTestObject('Object Repository/EditJob/Page_Jobstoday/SettingsLocator')
WebUI.click(settings)
for(int i in 1..17) {
         a.sendKeys(Keys.ARROW_RIGHT).build().perform();
      }

WebUI.click(findTestObject('Object Repository/EditJob/Page_Jobstoday/a_Online_b-btn-edit'))

WebUI.setText(findTestObject('Object Repository/EditJob/Page_/input_Job title_job_title'), newTitle)

WebUI.click(findTestObject('Object Repository/EditJob/Page_/a_Next'))

WebUI.click(findTestObject('Object Repository/EditJob/Page_/section_b-loader         position fixed    _921d21'))

WebUI.click(findTestObject('Object Repository/EditJob/Page_/input_RA-AT-2022-09-0014_privacy'))

WebUI.click(findTestObject('Object Repository/EditJob/Page_/button_Publish Now'))

WebUI.verifyElementVisible(findTestObject('Object Repository/EditJob/Page_/h3_You have successfully posted your Job'))

WebUI.click(findTestObject('Object Repository/EditJob/Page_/a_View Job'))

String JobTitle = WebUI.getText(findTestObject('Object Repository/EditJob/Page_Job title new test after edit - NAILS _02945b/h1_Job title new test after edit'))

WebUI.verifyMatch(newTitle, JobTitle, false)
