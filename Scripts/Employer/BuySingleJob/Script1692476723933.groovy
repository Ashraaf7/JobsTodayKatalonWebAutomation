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
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory


// Nooooooooooooot Woooooooooooooooorking 

 
WebUI.callTestCase(findTestCase('Employer/EmployerLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/BuySingleJob/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_For employers  Pricing'))

WebUI.click(findTestObject('Object Repository/BuySingleJob/Page_Post Jobs For Free - Jobstoday.world/a_Select'))


WebUI.click(findTestObject('Object Repository/BuySingleJob/Page_/input_Choose your payment method_input_payment'))

/*
// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)
driver.switchTo().frame(driver.findElement(By.xpath('//*[@id="c-jobstoday-stripe-card-number"]/div/iframe')))

WebUI.setText(findTestObject('Object Repository/BuySingleJob/Page_/input_cardnumber'), '4111 1111 1111 1111')
driver.switchTo().parentFrame()
*/

WebUI.setText(findTestObject('Object Repository/BuySingleJob/Page_/input_Cardholder name_input_card_holder'), 'Ashraf')


WebUI.setText(findTestObject('Object Repository/BuySingleJob/Page_/input_exp-date'), '01 / 26')

WebUI.setText(findTestObject('Object Repository/BuySingleJob/Page_/input_cvc'), '123')

WebUI.click(findTestObject('Object Repository/BuySingleJob/Page_/input_Please enter cvc_privacy'))

WebUI.click(findTestObject('Object Repository/BuySingleJob/Page_/button_PLACE YOUR ORDER'))

WebUI.closeBrowser()

