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

WebUI.navigateToUrl('https://www.jobstoday.world/en/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Registration'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Register for free in minutes on Jobsto_7b10ce/div_Im an Employer'))

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Email Address_input_email'), 
    'ahmedashraaf09@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Password_input_password'), 
    '81Y8EVciWt71xSjgJkZhKg==')

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/img_Password_hide-icon password_hidden'))

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Company name_input_company_name'), 
    'Ashroof')

WebUI.scrollToElement(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/span_Select profile type'), 
    5)

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/span_Select profile type'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/span_Select industry'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/span_Salutation'))

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_First name_input_firstname'), 
    'Ahmed')

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Last name_input_lastname'), 
    'Ashraf')

WebUI.scrollToElement(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Address_input_address'), 
    5)

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Address_input_address'), 
    'Egypt')

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_City  Country_input_city_country'), 
    'Cairo')

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Postal code_input_postalcode'))

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Postal code_input_postalcode'), 
    '13211')

WebUI.setText(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Phone number_input_phone_number'), 
    '+201146196154')

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/span_Select communication language'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/span_Select number'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Number of employees_privacy'))

WebUI.scrollToElement(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/button_Register Now'), 
    5)

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/button_Register Now'))

WebUI.click(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/a_Got it'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobstoday.world/en/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Registration'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Register for free in minutes on Jobsto_7b10ce/div_Im an Employer'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Email Address_input_email'), 
    'ahmedashraaf09@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Password_input_password'), 
    '81Y8EVciWt71xSjgJkZhKg==')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/img_Password_hide-icon password_hidden'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Company name_input_company_name'), 
    'Ashroof')

//WebUI.scrollToElement(findTestObject('Object Repository/registerAsEmployerObjects/Page_Employer Registration Jobstoday.world _5e6765/input_Company name_input_company_name'), 5)
WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select profile type'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/li_Employer'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select industry'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Salutation'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_First name_input_firstname'), 
    'Ahmed')

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Last name_input_lastname'), 
    'Ashraf')

WebUI.scrollToElement(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Address_input_address'), 
    5)

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Address_input_address'), 
    'Egypt')

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_City  Country_input_city_country'), 
    'Cairo')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Postal code_input_postalcode'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Postal code_input_postalcode'), 
    '13211')

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Phone number_input_phone_number'), 
    '+201146196154')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select communication language'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select number'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Number of employees_privacy'))

WebUI.scrollToElement(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/button_Register Now'), 
    5)

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/button_Register Now'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/a_Got it'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobstoday.world/en/')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Registration'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Register for free in minutes on Jobsto_7b10ce/div_Im an Employer'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select profile type_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select industry_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Salutation_1'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select communication language_select2-_9515e7'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select number_1'))

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobstoday.world/en/')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Registration'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Register for free in minutes on Jobsto_7b10ce/div_Im an Employer'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Email Address_input_email'), 
    'ahmedashraaf09@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Password_input_password'), 
    '81Y8EVciWt6yH4eK3/wEkw==')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/img_Password_hide-icon password_hidden'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Password_input_password_1'), 
    'Ashraf12345@')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobstoday.world/en/')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Registration'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Email Address_input_email'), 
    'ahmedashraaf09@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Password_input_password'), 
    '81Y8EVciWt71xSjgJkZhKg==')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/img_Password_hide-icon password_hidden'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Company name_input_company_name'), 
    'Ashroof')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select profile type_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select industry_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Salutation_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_First name_input_firstname'), 
    'Ahmed')

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Last name_input_lastname'), 
    'Ashraf')

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Address_input_address'), 
    'Egypt')

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_City  Country_input_city_country'), 
    'Cairo')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Postal code_input_postalcode'))

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Postal code_input_postalcode'), 
    '13211')

WebUI.setText(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Phone number_input_phone_number'), 
    '+201146196154')

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select communication language_select2-_9515e7'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/span_Select number_select2-selection__arrow'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/input_Number of employees_privacy'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/button_Register Now'))

WebUI.click(findTestObject('Object Repository/RegEmployerElements/Page_Employer Registration Jobstoday.world _5e6765/a_Got it'))

