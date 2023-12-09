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

WebUI.callTestCase(findTestCase('Test Cases/Employer/RegisterTCs/registerAsEmployeeUsingEmailTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/DashboardButton'))

WebUI.click(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_Jobstoday/span_Order Packages'))

String SinglePack = WebUI.getText(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_Jobstoday/SingleJob'))

String PackageName = WebUI.getText(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_Jobstoday/PackageName'))

WebUI.click(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_Post Jobs For Free - Jobstoday.world/a_Select'))

// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

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


WebUI.click(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_/button_PLACE YOUR ORDER'))

String sucessMsg = WebUI.getText(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_/h5_Your purchase was successful'))
WebUI.verifyMatch(sucessMsg, 'Your purchase was successful', false)

WebUI.click(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_/a_Go to Administration Panel'))

WebUI.click(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_Jobstoday/span_My Packages'))

String PackageName2 = WebUI.getText(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_Jobstoday/h3_Enterprise'))
WebUI.verifyMatch(PackageName2, PackageName, false)

String SinglePack2 = WebUI.getText(findTestObject('Object Repository/UserOrderNewSinglePackage/Page_Jobstoday/p_Single Job'))
WebUI.verifyMatch(SinglePack2, SinglePack, false)


