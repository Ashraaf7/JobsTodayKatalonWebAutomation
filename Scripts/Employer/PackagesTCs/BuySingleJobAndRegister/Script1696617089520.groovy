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
import org.apache.commons.lang3.RandomStringUtils
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')
WebUI.executeJavaScript("document.body.style.zoom='75%'", null)

WebUI.navigateToUrl(GlobalVariable.Staging + "post-a-job/")

WebUI.maximizeWindow()
WebUI.executeJavaScript("document.body.style.zoom='75%'", null)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

//WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/Pricing'))

String SinglePack = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/a_Single Job'))

String PackageName = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/PackageName'))

// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

(0..10).each { i ->
	// Send the TAB key globally
// Send the TAB key globally
a.sendKeys(Keys.TAB).build().perform()
}


// Send the TAB key globally
a.sendKeys(Keys.ENTER).build().perform()
// Generate a random email address
def randomEmail = "user" + RandomStringUtils.randomAlphanumeric(5) + "@example.com"
GlobalVariable.flagEmail = randomEmail

// Get the global variable
GlobalList.addToMyList(randomEmail)

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Email address_input_email'), randomEmail)

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Password_input_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Salutation'))
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/Salutation'))

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_First name_input_firstname'), 'New')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Last name_input_lastname'), 'Name ')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Company name_input_company_name'), 'Company Name')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Address_input_address'), 'Address')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_City  Country_input_city_country'), 
    GlobalVariable.location)

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Postal code_input_postalcode'), '123456')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Phone number_input_phone_number'), '0123456789')

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select profile type'))
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/type'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select industry'))
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/industry'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select number'))
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/number'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select communication language'))
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/language'))

//WebUI.scrollToElement(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/cardRadioButton'), 5)

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/cardRadioButton'))
a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(GlobalVariable.cardNumber).build().perform()

a.sendKeys(Keys.TAB).build().perform()
a.sendKeys(GlobalVariable.cardHolderName).build().perform()

a.sendKeys(Keys.TAB).build().perform()
a.sendKeys(GlobalVariable.expirationDate).build().perform()


a.sendKeys(Keys.TAB).build().perform()
a.sendKeys(GlobalVariable.cvv).build().perform()


WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/privacy'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/button_PLACE YOUR ORDER'))

String sucessMsg = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/h5_Your purchase was successful'))

WebUI.verifyMatch(sucessMsg, 'Your purchase was successful', false)

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/img'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobstoday/span_My Packages'))

String PackageName2 = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobstoday/h3_Starter'))
WebUI.verifyMatch(PackageName2, PackageName, false)

String SinglePack2 = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobstoday/p_Single Job'))
WebUI.verifyMatch(SinglePack2, SinglePack, false)
