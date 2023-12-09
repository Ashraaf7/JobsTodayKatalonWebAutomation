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

WebUI.callTestCase(findTestCase('General/registerWithOutlookEmailForSpecialCase'), [:], FailureHandling.STOP_ON_FAILURE)
//logout steps
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/DashboardButton'))
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/forHover'))

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_Jobstoday/span_Logout'))

//forget password
WebUI.click(findTestObject('Object Repository/forgetPassword/forgetPassword'))

WebUI.sendKeys(findTestObject('Object Repository/forgetPassword/emailForForget'), GlobalVariable.outlookEmail)

WebUI.click(findTestObject('Object Repository/forgetPassword/resetPasswordButton'))

WebUI.callTestCase(findTestCase('Test Cases/General/GetURLForResetPassword'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl(GlobalVariable.urlForReset)

WebUI.sendKeys(findTestObject('Object Repository/forgetPassword/newPassword'), GlobalVariable.newPassword)

WebUI.sendKeys(findTestObject('Object Repository/forgetPassword/confirmPassword'), GlobalVariable.newPassword)


WebUI.click(findTestObject('Object Repository/forgetPassword/saveButton'))


WebUI.click(findTestObject('Object Repository/forgetPassword/goToLoginButton'))

//login with new password 

WebUI.setText(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Email address_input_email'),
	 GlobalVariable.outlookEmail)

WebUI.setText(findTestObject('Object Repository/loginElements/Page_Login to Jobstoday.world - Create Resu_ef8a51/input_Password_input_password'),
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

// a.MoveToElement(_driver.FindElement(By.XPath("//button[@id='btn-card-verify']"))).Build().Perform();
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

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.Staging, false)


//delete account
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/DashboardButton'))
WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/Setting'))

WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/DeleteButton'))
WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/ConfirmDeleteButton'))
Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/YesForDelete'))
Thread.sleep(2000)

WebUI.sendKeys(findTestObject('Object Repository/DeleteEmployerAccount/EnterPasswordForDelete'), GlobalVariable.Password)
Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/LastDeleteButton'))





