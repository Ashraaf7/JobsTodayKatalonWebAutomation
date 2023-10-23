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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.Clipboard as Clipboard
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Test Cases/Candidate/LoginCandidateTCs/CandidatLoginTC'), [:])

WebUI.navigateToUrl('https://www.jobstoday.world/en/job/accounting/test--cairo/c35fad609924fa5a0b6a370392b979d0/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/a_Apply'))

WebUI.setText(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/input_First name_input_first_name'), 
    'Ahmed')

WebUI.setText(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/input_Last name_input_last_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/input_Phone number_input_phone_number'), 
    '+201140560426')

WebUI.setText(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/input_Email address_input_email'), 
    'testaaawy@yahoo.com')

WebUI.setText(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/textarea_Cover letter  Brief description ab_6b68b0'), 
    'Test')

WebUI.click(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/input_No_privacy'))

String path = 'E:\\Projects\\JobsTodayKatalonWebAutomation\\Attachments\\CV.png'

WebUI.click(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/div_Attachments_upload-photos-box'))

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

// Get the driver instance
def driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

// Call the sendKeys() method on the Actions instance to simulate keyboard input
a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

a.sendKeys(Keys.TAB).build().perform()

char a1 = '0'

char a2 = '7'

char a3 = '8'

char a4 = '9'

a.sendKeys(String.valueOf(a1), String.valueOf(a2), String.valueOf(a3), String.valueOf(a4)).build().perform()

WebUI.sendKeys(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/button_Send Application'), 
    String.valueOf(((a1 + a2) + a3) + a4))

WebUI.click(findTestObject('Object Repository/ApplyWithoutLogin/Page_HR Manager - Jobstoday World/button_Send Application'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ApplyWithoutLogin/Page_/img'))

WebUI.closeBrowser()

