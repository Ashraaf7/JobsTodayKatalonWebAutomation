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
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobstoday.world/en/')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/loginElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/loginElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Login'))

WebUI.setText(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Email address_input_email'), 
    'ahmedashraaf90@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Password_input_password'), 
    '81Y8EVciWt71xSjgJkZhKg==')


// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

// Call the sendKeys() method on the Actions instance to simulate keyboard input
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();

// a.MoveToElement(_driver.FindElement(By.XPath("//button[@id='btn-card-verify']"))).Build().Perform();
Thread.sleep(2000);
char a1 = '\u0030';
char a2 = '\u0037';
char a3 = '\u0038';
char a4 = '\u0039';

a.sendKeys(   String.valueOf(a1),
		String.valueOf(a2),
		String.valueOf(a3),
		String.valueOf(a4)).build().perform();

WebUI.sendKeys(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/button_Login'),String.valueOf(a1 + a2 + a3 + a4))

WebUI.click(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/button_Login'))
Thread.sleep(2000);
WebUI.verifyMatch(WebUI.getUrl(), "https://www.jobstoday.world/en/", false)
//WebUI.closeBrowser()