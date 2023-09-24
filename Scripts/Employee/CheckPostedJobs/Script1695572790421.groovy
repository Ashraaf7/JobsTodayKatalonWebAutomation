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
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

String jobTitle = 'Post Job one'
WebUI.callTestCase(findTestCase('Employee/EmployeeLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)
def driver = DriverFactory.getWebDriver()
WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_Jobstoday/span_My Jobs'))

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_Jobstoday/span_Post Job'))

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_Jobstoday/span_Select'))

WebUI.setText(findTestObject('Object Repository/CheckPostedJobs/Page_/textarea_Describe in few words the most imp_0f1197'), 
    'Company description Company description Company description Company description v Company description Company description Company test')

WebUI.setText(findTestObject('Object Repository/CheckPostedJobs/Page_/input_Job title_job_title'), jobTitle) 

WebUI.setText(findTestObject('Object Repository/CheckPostedJobs/Page_/textarea_Enter a short Job description, it _305c38'), 
    'Company description Company description Company description Company description v Company description Company description Company test')

TestObject jobDescription = findTestObject('Object Repository/CheckPostedJobs/Page_/p_Compose your Job position with as many de_a6a97c')

WebElement frame = driver.findElement(By.id("job_description_ifr"));
driver.switchTo().frame(frame)
WebUI.sendKeys(jobDescription,'The role of a software tester involves designing and executing test plans, creating test cases, and analyzing the results to identify any issues or bugs. They are also responsible for documenting their findings and communicating them to the development team for resolution.Software testers may use a variety of testing techniques, including manual testing, automated testing, regression testing, performance testing, and security testing. They may also work on multiple projects simultaneously and collaborate with other members of the development team to ensure that software releases are of high quality and meet user expectations.')
driver.switchTo().parentFrame()

By G = By.xpath('//*[@id="select_industry"]')
WebElement Industry= driver.findElement(G)
Select dropDown = new Select(Industry)
dropDown.selectByVisibleText("Accounting")

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_/span_Select employment type'))

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_/type'))

WebUI.setText(findTestObject('Object Repository/CheckPostedJobs/Page_/input_City  Country_location'), 'Cairo, Egypt')

WebUI.setText(findTestObject('Object Repository/CheckPostedJobs/Page_/input_Reference_Reference'), 'Company description Company description Company description Company description v Company description')

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_/label_No'))

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_/a_Next'))

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_/input_RA-AT-2022-09-0014_privacy'))

WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_/button_Publish Now'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CheckPostedJobs/Page_/h3_You have successfully posted your Job'))

//WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

//WebUI.click(findTestObject('Object Repository/CheckPostedJobs/Page_Jobstoday/span_My Jobs'))

//TestObject jobName = findTestObject('Object Repository/CheckPostedJobs/Page_/a_View Job')

//String jobNameTxt = WebUI.getText(jobName)
//WebUI.verifyMatch(jobTitle, jobNameTxt, false)
