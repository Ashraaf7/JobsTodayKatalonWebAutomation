import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.chrome.ChromeOptions as Keys

String edgeProcessName = "msedge.exe";
String chromeProcessName = "chrome.exe";

try {
	Runtime.getRuntime().exec("taskkill /F /IM " + edgeProcessName);
	Runtime.getRuntime().exec("taskkill /F /IM " + chromeProcessName);
	
} catch (IOException | InterruptedException e) {
	e.printStackTrace();
}
localPath = "C:\\Users\\asmaa.fawzy\\AppData\\Local\\Google\\Chrome\\User Data"
localProfile= "Profile 67"
serverPath = "C:\\Users\\paperspace\\AppData\\Local\\Google\\Chrome\\User Data"
serverProfile="Default"

RunConfiguration.setWebDriverPreferencesProperty('args',  [
	'user-data-dir='+serverPath,
	'profile-directory='+serverProfile
		]
	)
WebUI.openBrowser('')
	
Thread.sleep(3000)