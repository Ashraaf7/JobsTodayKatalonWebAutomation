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

WebUI.callTestCase(findTestCase('Candidate/RegisterCandidateTCs/registerAsCandidateUsingEmailFromRegisterPageTC'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_/button_Post Job Request'))

WebUI.setText(findTestObject('Object Repository/DeleteJobRequest/Page_/input_First name_input_firstname'), 'Test')

WebUI.setText(findTestObject('Object Repository/DeleteJobRequest/Page_/input_Last name_input_lastname'), 'Tester')

WebUI.setText(findTestObject('Object Repository/DeleteJobRequest/Page_/input_Ex SEO Marketing, Social Media Expert_7f15ab'), 
    'Job Title Tester')

WebUI.setText(findTestObject('Object Repository/DeleteJobRequest/Page_/textarea_I am looking for a job_input_job'), 'test I am looking for a job')

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_/button_Create Job Request'))

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_/button_Publish'))

WebUI.verifyElementVisible(findTestObject('Object Repository/DeleteJobRequest/Page_/h5_Your purchase was successful'))

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_/img'))

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_/span_MY JOB REQUESTS'))

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_/img_1'))

WebUI.click(findTestObject('Object Repository/DeleteJobRequest/Page_/a_Delete'))

WebUI.verifyElementVisible(findTestObject('Object Repository/DeleteJobRequest/Page_/span_Post a Job Request'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/img'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/Page_/a_SETTINGS'))

WebUI.scrollToPosition(600, 1268)

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/deletecandidateaccountButton'))

WebUI.click(findTestObject('Object Repository/ChangePasswordElements/DeleteButton'))

