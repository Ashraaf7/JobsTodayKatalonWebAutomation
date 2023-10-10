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

WebUI.navigateToUrl(GlobalVariable.Production)
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/pricing'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_For employers'))

String MonthlyPack = WebUI.getText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/a_Monthly'))

String PackageName = WebUI.getText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/packageName'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Post Jobs For Free - Jobstoday.world/a_Select'))

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_Email address_input_email'), GlobalVariable.EmailToRegister)

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_Password_input_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/span_Salutation'))
WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/Salutation'))

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_First name_input_firstname'), 'New')

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_Last name_input_lastname'), 'Account')

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_Company name_input_company_name'), 
    'company name')

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_Address_input_address'), 'address')

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_City  Country_input_city_country'), 
    'Cairo, Egypt')

WebUI.setText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/input_Postal code_input_postalcode'), '12345')

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/span_Select profile type'))
WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/type'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/span_Select industry'))
WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/industry'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/span_Select number'))
WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/number'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/span_Select communication language'))
WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/language'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/button_PLACE YOUR ORDER'))

String sucessMsg = WebUI.getText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/purchaseSuccessful'))
WebUI.verifyMatch(sucessMsg, 'Your purchase was successful', false)

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_/img'))

WebUI.click(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Jobstoday/div_My Packages'))

String PackageName2 = WebUI.getText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Jobstoday/Enterprise'))
WebUI.verifyMatch(PackageName2, PackageName, false)

String MonthlyPack2 = WebUI.getText(findTestObject('Object Repository/BuyMonthlyJobAndRegister/Page_Jobstoday/MonthlyJob'))
WebUI.verifyMatch(MonthlyPack2, MonthlyPack, false)
