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
import com.kms.katalon.core.annotation.Keyword
import org.apache.commons.lang3.RandomStringUtils
WebUI.openBrowser('')
WebUI.executeJavaScript("document.body.style.zoom='75%'", null)
WebUI.navigateToUrl(GlobalVariable.Production)

WebUI.maximizeWindow()

if (WebUI.verifyElementVisible(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/JobSeekerRegElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Find Jobseekers'))

WebUI.scrollToPosition(595, 1490)

// Generate a random email address
def randomEmail = "user" + RandomStringUtils.randomAlphanumeric(5) + "@example.com"

WebUI.click(findTestObject('Object Repository/JobSeekerRegElements/Page_/button_Register Now'))

WebUI.setText(findTestObject('Object Repository/JobSeekerRegElements/Page_/input_Email address_input_email'), randomEmail)

WebUI.setText(findTestObject('Object Repository/JobSeekerRegElements/Page_/input_Password_input_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/JobSeekerRegElements/Page_/span_Password_hide-show-btn1'))

WebUI.setText(findTestObject('Object Repository/JobSeekerRegElements/Page_/input_First name_input_firstname'), 'Job')

WebUI.setText(findTestObject('Object Repository/JobSeekerRegElements/Page_/input_Last name_input_lastname'), 'Seeker')

WebUI.setText(findTestObject('Object Repository/JobSeekerRegElements/Page_/input_Ex SEO Marketing, Social Media Expert_7f15ab'), 
    'SW Tester')

WebUI.setText(findTestObject('Object Repository/JobSeekerRegElements/Page_/textarea_I am looking for a job_input_job'), 
    'Software Test Engineer')

WebUI.click(findTestObject('Object Repository/JobSeekerRegElements/Page_/input_I am looking for a job_privacy'))

// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

// Call the sendKeys() method on the Actions instance to simulate keyboard input
a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

// a.MoveToElement(_driver.FindElement(By.XPath("//button[@id='btn-card-verify']"))).Build().Perform();
Thread.sleep(2000)

char a1 = '0'

char a2 = '7'

char a3 = '8'

char a4 = '9'

a.sendKeys(String.valueOf(a1), String.valueOf(a2), String.valueOf(a3), String.valueOf(a4)).build().perform()

WebUI.sendKeys(findTestObject('Object Repository/JobSeekerRegElements/Page_/button_Create Account'), String.valueOf(((a1 + a2) + a3) + a4))

WebUI.click(findTestObject('Object Repository/JobSeekerRegElements/Page_/button_Create Account'))

Thread.sleep(3000)

WebUI.scrollToPosition(573, 885)

WebUI.click(findTestObject('Object Repository/JobSeekerRegElements/Page_/button_Publish'))

WebUI.verifyElementVisible(findTestObject('Object Repository/JobSeekerRegElements/Page_/h5_Your purchase was successful'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/img'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/a_SETTINGS'))

WebUI.scrollToPosition(600,1268)

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/deletecandidateaccountButton'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/DeleteButton'))

Thread.sleep(3000)

WebUI.verifyMatch(WebUI.getUrl(), 'https://www.jobstoday.world/en/login/', false)

WebUI.closeBrowser()
