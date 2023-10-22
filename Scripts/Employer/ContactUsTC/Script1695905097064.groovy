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

WebUI.callTestCase(findTestCase('Employer/EmployerLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ContactUs/Page_Login to Jobstoday.world - Create Resu_ef8a51/a_Pricing'))

WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/input_Full name_input_name'), 
    'tester')


WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/input_Email address_input_email'), 
    'ahmed@gmail.com')

WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/input_Company name_input_company'), 
    'company')

WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/input_Phone number_input_phone'), 
    '+2011461')

WebUI.setText(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/textarea_Message box_input_message'), 
    'message')

// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();

Thread.sleep(2000);
char a1 = '\u0030';
char a2 = '\u0037';
char a3 = '\u0038';
char a4 = '\u0039';

a.sendKeys(String.valueOf(a1),
		String.valueOf(a2),
		String.valueOf(a3),
		String.valueOf(a4)).build().perform();

WebUI.sendKeys(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/button_Send'),String.valueOf(a1 + a2 + a3 + a4))


WebUI.click(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/button_Send'))

String ConfirmMessage = WebUI.getText(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/h5_Thanks for getting in contact'))

WebUI.verifyMatch(ConfirmMessage, 'Thanks for getting in contact', false)
WebUI.click(findTestObject('Object Repository/ContactUs/Page_Post Jobs For Free - Jobstoday.world/a_Got it'))

WebUI.closeBrowser()
