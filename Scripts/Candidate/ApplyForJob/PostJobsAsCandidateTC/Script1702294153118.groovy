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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Test Cases/Candidate/LoginCandidateTCs/CandidatLoginTC'),  [:])

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/DashboardButton'))

def driver = DriverFactory.getWebDriver()
def a = new Actions(driver)
WebUI.click(findTestObject('Object Repository/PostJobsTC/Page_/buttonJobPost'))

WebUI.setText(findTestObject('Object Repository/PostJobsTC/Page_/input_First name_input_firstname'), "Ahmed")

WebUI.setText(findTestObject('Object Repository/PostJobsTC/Page_/input_Last name_input_lastname'), "Tester")

WebUI.setText(findTestObject('Object Repository/PostJobsTC/Page_/input_Ex SEO Marketing, Social Media Expert_7f15ab'), 'Sw Tester ')

WebUI.setText(findTestObject('Object Repository/PostJobsTC/Page_/textarea_I am looking for a job_input_job'), 'Test ')

WebUI.click(findTestObject('Object Repository/PostJobsTC/Page_/button_Create Job Request'))
Thread.sleep(3000)

WebUI.scrollToPosition(573, 885)

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

WebUI.click(findTestObject('Object Repository/PostJobsTC/Page_/button_Publish'))

WebUI.verifyElementVisible(findTestObject('Object Repository/JobSeekerRegElements/Page_/h5_Your purchase was successful'))
