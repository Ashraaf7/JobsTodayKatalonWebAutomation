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
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.jobstoday.world/en/')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Registration'))

WebUI.click(findTestObject('Object Repository/regCandElements/Page_Register for free in minutes on Jobsto_7b10ce/div_Im a Candidate'))

WebUI.setText(findTestObject('Object Repository/regCandElements/Page_Jobseeker Registration Jobstoday.world_142f00/input_Email address_input_email'), 
    'Automationuser1@mailinator.com')

WebUI.setText(findTestObject('Object Repository/regCandElements/Page_Jobseeker Registration Jobstoday.world_142f00/input_Password_input_password'), 
    'Pass@123')

//WebUI.switchToFrame(findTestObject('Object Repository/regCandElements/Page_Register for free in minutes on Jobsto_7b10ce/frame'), 30)


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

WebUI.sendKeys(findTestObject('Object Repository/regCandElements/Page_Jobseeker Registration Jobstoday.world_142f00/button_Register Now'),String.valueOf(a1 + a2 + a3 + a4))
WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobseeker Registration Jobstoday.world_142f00/IAgreeCheckbox'))

WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobseeker Registration Jobstoday.world_142f00/button_Register Now'))
Thread.sleep(2000);
WebUI.verifyMatch(WebUI.getUrl(), "https://www.jobstoday.world/en/registration/success/candidate/", false)
WebUI.closeBrowser()

