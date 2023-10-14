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


WebUI.callTestCase(findTestCase('Employer/EmployerLoginTC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/img'))

String path = 'E:\\Projects\\JobsTodayKatalonWebAutomation\\Attachments\\image.jpg'

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Change profile picture                 _09d0cb'))

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

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/span_Select File_cropper-face cropper-move'))

//WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Select File_cropper-drag-box cropper-mo_f6b185'))

//WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/span_Select File_cropper-face cropper-move'))

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/button_Save'))

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Change profile picture                 _09d0cb'))

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Edit profile'))

WebUI.click(findTestObject('Object Repository/CompleteProfileAdminPanel/Page_Jobstoday/div_Edit profile'))

WebUI.closeBrowser()

