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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.JavascriptExecutor

WebUI.callTestCase(findTestCase('Employer/LoginTCs/EmployerCompanyLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

WebUI.click(findTestObject('Object Repository/DeleteJob/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/DeleteJob/Page_Jobstoday/span_My Jobs'))



TestObject settings = findTestObject('Object Repository/EditJob/Page_Jobstoday/SettingsLocator')
WebUI.click(settings)
for(int i in 1..17) {
		 a.sendKeys(Keys.ARROW_RIGHT).build().perform();
	  }

WebUI.click(findTestObject('Object Repository/DeleteJob/Page_Jobstoday/button_Online_b-btn-delete c-modal__bind'))

WebUI.refresh()
 settings = findTestObject('Object Repository/EditJob/Page_Jobstoday/SettingsLocator')
WebUI.click(settings)
for(int i in 1..17) {
		 a.sendKeys(Keys.ARROW_RIGHT).build().perform();
	  }
	  
WebUI.click(findTestObject('Object Repository/DeleteJob/Page_Jobstoday/button_Online_b-btn-delete c-modal__bind'))
	  
// cannot click on the button as the confirmation message didn't appear 
WebUI.click(findTestObject('Object Repository/DeleteJob/Page_Jobstoday/button_Delete'))

TestObject jobName = findTestObject('Object Repository/DeleteJob/Page_Jobstoday/a_Software Tester job')

WebUI.verifyElementNotVisible(jobName,FailureHandling.OPTIONAL)


