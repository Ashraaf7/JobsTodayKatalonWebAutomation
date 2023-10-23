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
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select


WebUI.callTestCase(findTestCase('Test Cases/Candidate/LoginCandidateTCs/CandidatLoginTC'),  [:])

WebUI.scrollToPosition(0, 0)
WebUI.setText(findTestObject('Object Repository/SubscibeToEmail/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/input_New Vacancies in Your Inbox_input_email'), 
    GlobalVariable.JobSeekerProductonEmail)

WebUI.click(findTestObject('Object Repository/SubscibeToEmail/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Subscribe'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SubscibeToEmail/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/h5_You have successfully subscribed'))


WebUI.closeBrowser()

