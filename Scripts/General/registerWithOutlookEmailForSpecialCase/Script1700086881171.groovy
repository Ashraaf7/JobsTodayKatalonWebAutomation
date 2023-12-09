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


WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.Staging)
WebUI.maximizeWindow()

if (WebUI.verifyElementVisible(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'), FailureHandling.OPTIONAL))
WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/DashboardButton'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Registration'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Register for free in minutes on Jobsto_7b10ce/div_Im an Employer'))



WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Email Address_input_email'),
	GlobalVariable.outlookEmail)

WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Password_input_password'),
	GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/img_Password_hide-icon password_hidden'))

WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Company name_input_company_name'),
	'Ashroof')

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select profile type_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Register for free in minutes on Jobsto_7b10ce/Employee'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select industry_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Register for free in minutes on Jobsto_7b10ce/industrySelection'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/span_Salutation_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Register for free in minutes on Jobsto_7b10ce/MR'))


WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_First name_input_firstname'),
	'Ahmed')

WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Last name_input_lastname'),
	'Ashraf')

WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Address_input_address'),
	'Egypt')

WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_City  Country_input_city_country'),
	'Cairo')

WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Postal code_input_postalcode'),
	'13211')

WebUI.setText(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Phone number_input_phone_number'),
	'+201146196154')

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select communication language_select2-_9515e7'))
WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/En'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select number_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/div_id(katalon-rec_elementInfoDiv)'))


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

 Thread.sleep(2000);
char a1 = '\u0030';
char a2 = '\u0037';
char a3 = '\u0038';
char a4 = '\u0039';

a.sendKeys(  String.valueOf(a1),
		String.valueOf(a2),
		String.valueOf(a3),
		String.valueOf(a4)).build().perform();

WebUI.sendKeys(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/button_Register Now'),String.valueOf(a1 + a2 + a3 + a4))

WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/input_Number of employees_privacy'))


WebUI.click(findTestObject('Object Repository/regEmpElements/Page_Employer Registration Jobstoday.world _5e6765/button_Register Now'))

Thread.sleep(2000);
