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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.Clipboard as Clipboard
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Candidate/RegisterCandidateTCs/registerAsCandidateUsingEmailFromRegisterPageTC'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CreateResume/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Upload Resume'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/button_Create'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/input_Create Resume_title'))

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input_Create Resume_title'), 'Testing')

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/button_Create Resume'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/button_Edit'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/div_Salutation_jq-selectbox__trigger-arrow'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/li_Mr'))

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input_First name_firstname'), 'Ahmed')

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/input_First name_firstname'))

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input_Last name_lastname'), 'Ashraf')

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/div_Select month of birth_jq-selectbox__tri_31cf56'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/january'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/year'))

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/2001'))

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input_Address_address'), 'Egypt')

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/input_Postal code_zipcode'))

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input_Postal code_zipcode'), '13211')

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input_City  Country_location'), 'Cairo')

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input__email'), 'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/input_Enter your professional designation. _81882b'), 
    'Test Test')

WebUI.setText(findTestObject('Object Repository/CreateResume/Page_/textarea_Enter a short summary about your s_0e8bac'), 
    'Software Test Engineer')

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/button_Save'))

//New  /////////////////////////////////////////////////////////
def driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/Addtional_button_Edit'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Select the nationality that you hold._10d139'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Poland'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Select the work permit that you hold._9bc0c9'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Polish Citizen'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Select the driving permit that you ho_f5bc64'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_EU Motorcycle Type A'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Add languages'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select language'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_English'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select proficiency'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_Good'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Save_1'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Add sector  industry experience'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input__area_experience'), '2 year in QA')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Save2'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/span_EDUCATION'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Add hardware  software skills'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input__area_skills'), 'Teamworker')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Save3'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Add education'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_UniversitySchoolInstitute_name'), 'MIT')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select the year of completion_jq-select_40f40b'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_2022'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Name of degree_name_of_degree'), 'A plus')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select the year of completion_jq-select_40f40b'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_University Degree'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/eduarrow'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/bachelors'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Save_1_2'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Add professional experience'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Job title_title'), 'QA Engineer')

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Company_company_name'), 'Upwork')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select industry_jq-selectbox__trigger-arrow'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_Administration'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Location_location'), 'Cairo')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select position_jq-selectbox__trigger'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_Senior employee'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/employment'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_contract'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select month_jq-selectbox__trigger'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_January'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select yearfrom_jq-selectbox__trigger'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_2020'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select monthTo_jq-selectbox__trigger'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_January_1'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Select yearTo_jq-selectbox__trigger'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/li_2023'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Select year_currently'))

//WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/label_Enter a brief summary of your tasks  _5b6836'))
Thread.sleep(2000)

WebElement frame = driver.findElement(By.id('short_description_ifr'))

driver.switchTo().frame(frame)

WebUI.sendKeys(findTestObject('Object Repository/CreateResume/NewResume/Page_/brief'), 'The role of a software tester involves designing and executing test plans, creating test cases, and analyzing the results to identify any issues or bugs. They are also responsible for documenting their findings and communicating them to the development team for resolution.Software testers may use a variety of testing techniques, including manual testing, automated testing, regression testing, performance testing, and security testing. They may also work on multiple projects simultaneously and collaborate with other members of the development team to ensure that software releases are of high quality and meet user expectations.')

driver.switchTo().parentFrame()

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_SaveLast-1'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Add attachments'))

String projectDirectory = RunConfiguration.getProjectDir().replaceAll('/', '\\\\')

String path = (projectDirectory + '\\') + 'Attachments\\CV.png'

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Upload'))

Robot robot = new Robot()

StringSelection selection = new StringSelection(path)

Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()

clipboard.setContents(selection, null)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

robot.delay(2000)

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.delay(2000)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_Edit'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_text'), 'Tester')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Accounting'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/administaration'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Specify your ideal employment type. Y_73564a'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Contract'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_Specify your ideal position. You can _9ad608'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div_Employee'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/div__set-preferences-job-location'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_text_1'), 'Cairo')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/input__ms-input-readonly'))

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/polandprefrerence'))

WebUI.setText(findTestObject('Object Repository/CreateResume/NewResume/Page_/input_text_1_2'), 'Testing')

WebUI.click(findTestObject('Object Repository/CreateResume/NewResume/Page_/button_SaveLast'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/CreateResume/Page_/a_My Resume'))
Thread.sleep(3000)

driver.switchTo().alert().accept()
Thread.sleep(3000)

WebUI.verifyElementVisible(findTestObject('Object Repository/CreateResume/Page_/a_Testing'))

