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

WebUI.callTestCase(findTestCase('Employer/RegisterTCs/registerAsEmployeeUsingEmailTC'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/DeleteJob/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/span_Settings'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/button_Change password'))

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/input_Change password_current_password'), 
    GlobalVariable.Password)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/input_Enter valid password_new_password'), 
    GlobalVariable.newPassword)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/input_Enter valid password_confirm_password'), 
    GlobalVariable.newPassword)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Jobstoday/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/h2_Login now to Jobstoday.world'))

// Login with the new password 
WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Email address_input_email'), 
    GlobalVariable.flagEmail)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Password_input_password'), 
    GlobalVariable.newPassword)

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

Thread.sleep(2000)

char a1 = '0'

char a2 = '7'

char a3 = '8'

char a4 = '9'

a.sendKeys(String.valueOf(a1), String.valueOf(a2), String.valueOf(a3), String.valueOf(a4)).build().perform()

WebUI.sendKeys(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/button_Login'), 
    String.valueOf(((a1 + a2) + a3) + a4))

WebUI.click(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/button_Login'))

Thread.sleep(2000)

WebUI.verifyMatch(WebUI.getUrl(), 'https://www.jobstoday.world/en/', false)


