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


WebUI.callTestCase(findTestCase('Employer/PackagesTCs/PostTextSingleJob'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.Production)


WebUI.setText(findTestObject('Object Repository/searchElements/Page_Jobs Search, Search for a Job - Jobstoday.world/input_Find employees from around the world_keywords'), 
   GlobalVariable.jobTitle)

WebUI.click(findTestObject('Object Repository/searchElements/Page_Jobs Search, Search for a Job - Jobstoday.world/button_Search'))

Thread.sleep(2000)

def ActualJob = WebUI.getText(findTestObject('Object Repository/searchElements/Page_Jobs Search, Search for a Job - Jobstoday.world/a_Manager, Data Integration, Research IT Data Engineering'))

WebUI.verifyEqual(ActualJob,  GlobalVariable.jobTitle)


WebUI.closeBrowser()

