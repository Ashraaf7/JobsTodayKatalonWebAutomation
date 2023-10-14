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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Production)
WebUI.maximizeWindow()

//WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/Pricing'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_For employers'))

String SinglePack = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/a_Single Job'))

String PackageName = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/PackageName'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/a_Select'))

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Email address_input_email'), GlobalVariable.EmailToRegister)

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Password_input_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Salutation'))
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/Salutation'))

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_First name_input_firstname'), 'New')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Last name_input_lastname'), 'Name ')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Company name_input_company_name'), 'Company Name')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Address_input_address'), 'Address')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_City  Country_input_city_country'), 
    'Cairo, Egypt')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Postal code_input_postalcode'), '123456')

WebUI.setText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/input_Phone number_input_phone_number'), '0123456789')

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select profile type'))
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/type'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select industry'))
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/industry'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select number'))
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/number'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/span_Select communication language'))
WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/language'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/button_PLACE YOUR ORDER'))

String sucessMsg = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/h5_Your purchase was successful'))

WebUI.verifyMatch(sucessMsg, 'Your purchase was successful', false)

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_/img'))

WebUI.click(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobstoday/span_My Packages'))

String PackageName2 = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobstoday/h3_Starter'))
WebUI.verifyMatch(PackageName2, PackageName, false)

String SinglePack2 = WebUI.getText(findTestObject('Object Repository/BuySingleJobAndRegister/Page_Jobstoday/p_Single Job'))
WebUI.verifyMatch(SinglePack2, SinglePack, false)
