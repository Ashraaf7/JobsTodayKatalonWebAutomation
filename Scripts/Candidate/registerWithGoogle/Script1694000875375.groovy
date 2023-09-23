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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.edge.EdgeOptions

// Create EdgeOptions object
EdgeOptions edgeOptions = new  EdgeOptions()

// Use the default user profile
edgeOptions.addArguments("user-data-dir=C:\\Users\\<YourUsername>\\AppData\\Local\\Microsoft\\Edge\\User Data")


// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Open a URL in Microsoft Edge
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobstoday.world/en/registration/candidate/')

WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/loginElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.switchToFrame(findTestObject('Object Repository/registerWithGoogleElements/frame'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/registerWithGoogleElements/Page_Jobseeker Registration Jobstoday.world_142f00/span_Sign in with Google'))
WebUI.switchToWindowTitle('Sign in - Google Acounts - Profile 1 - Microsoft Edge', FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/registerWithGoogleElements/Page_Sign in - Google Accounts/input_Use your Google Account_identifier'), 
    'acoounttest009@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/registerWithGoogleElements/Page_Sign in - Google Accounts/input_Use your Google Account_identifier'), 
    Keys.chord(Keys.ENTER))

//WebUI.setText(findTestObject('Object Repository/registerWithGoogleElements/Page_Sign in - Google Accounts/input_Forgot email_ca'),  'peractra')

//WebUI.sendKeys(findTestObject('Object Repository/registerWithGoogleElements/Page_Sign in - Google Accounts/input_Forgot email_ca'),     Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/registerWithGoogleElements/Page_Sign in - Google Accounts/input_Too many failed attempts_Passwd'), 
    'UfcKEO1Tn/CQrnNtdKXm5Q==')

WebUI.sendKeys(findTestObject('Object Repository/registerWithGoogleElements/Page_Sign in - Google Accounts/input_Too many failed attempts_Passwd'), 
    Keys.chord(Keys.ENTER))

WebUI.switchToWindowTitle('Jobs Search, Search for a Job - Jobstoday.world')

WebUI.click(findTestObject('Object Repository/registerWithGoogleElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/registerWithGoogleElements/Page_/h2_Hello, Test'))

WebUI.closeBrowser()

