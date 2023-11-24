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

String allJobs = "https://www.jobstoday.world/en/find-a-job/?posted_date=all_jobs"
WebUI.callTestCase(findTestCase('Employer/PackagesTCs/PostTextSingleJob'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/Setting'))

WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/DeleteButton'))
WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/ConfirmDeleteButton'))
WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/YesForDelete'))
WebUI.sendKeys(findTestObject('Object Repository/DeleteEmployerAccount/EnterPasswordForDelete'), GlobalVariable.Password)
WebUI.click(findTestObject('Object Repository/DeleteEmployerAccount/LastDeleteButton'))

Thread.sleep(3000)

WebUI.navigateToUrl(GlobalVariable.jobURL)

String nvaigatedURL = WebUI.getUrl()

WebUI.verifyMatch(nvaigatedURL, allJobs , false)

