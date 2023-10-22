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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import org.apache.commons.lang3.RandomStringUtils
import org.apache.commons.lang3.RandomStringUtils
String jobURL = 'https://www.jobstoday.world/en/'
WebUI.callTestCase(findTestCase('Employer/PackagesTCs/BuySingleJobAndRegister'), [:], FailureHandling.STOP_ON_FAILURE)

def driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_Jobstoday/button_Select'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/li_URL Job Posting'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/a_Yes'))

WebUI.setText(findTestObject('Object Repository/PostURLSingleJob/Page_/input_Enter a valid URL that users will be _5ba390'), 
    jobURL)

// Generate a random email address
def jobTitle = "Test Job " + RandomStringUtils.randomAlphanumeric(2)

WebUI.setText(findTestObject('Object Repository/PostURLSingleJob/Page_/input_Job title_job_title'), jobTitle)

WebUI.setText(findTestObject('Object Repository/PostURLSingleJob/Page_/textarea_Enter a short Job description, it _305c38'), 
    'Company description Company description Company description')

By G = By.xpath('//*[@id="select_industry"]')
 
WebElement Industry = driver.findElement(G)
 
Select dropDown = new Select(Industry)
 
dropDown.selectByVisibleText('Accounting')
 
WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/span_Select employment type'))
WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/type'))

WebUI.setText(findTestObject('Object Repository/PostURLSingleJob/Page_/input_City  Country_location'), 'Cairo, Egypt')

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/label_No'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/a_Next'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/input_RA-AT-2023-10-0005_privacy'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/button_Publish Now'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_/img'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_Jobstoday/span_My Jobs'))

WebUI.click(findTestObject('Object Repository/PostURLSingleJob/Page_Jobstoday/a_Job url'))

WebUI.switchToWindowIndex(1)

String openedURL = WebUI.getUrl()

WebUI.verifyMatch(openedURL, jobURL, false)


