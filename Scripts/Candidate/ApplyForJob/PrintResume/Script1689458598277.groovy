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
import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.Clipboard as Clipboard
import java.awt.datatransfer.StringSelection as StringSelection
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.apache.commons.lang3.RandomStringUtils

WebUI.callTestCase(findTestCase('Candidate/ApplyForJob/CanCreateResume'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/CreateResume/EmployeeViewButton'))

WebUI.switchToWindowIndex(1)

String projectDirectory = RunConfiguration.getProjectDir().replaceAll('/', '\\\\')
def cvName = "test CV" + RandomStringUtils.randomAlphanumeric(2)+'.png'
cvName = cvName.replaceAll("\\s", "")

String path = (projectDirectory + '\\') + 'Attachments\\' + cvName


// Define an array of Test Object names
def testObjectNames = ["Object Repository/PrintResume/Header1", "Object Repository/PrintResume/Footer"]

// Create a list to store Test Objects
List<TestObject> ignoredTestObjectList = []

// Initialize Test Objects and add them to the list
for (String objectName : testObjectNames) {
    TestObject testObject = findTestObject(objectName)
    ignoredTestObjectList.add(testObject)
}

WebUI.takeFullPageScreenshot(path,ignoredTestObjectList)


WebUI.closeBrowser()

