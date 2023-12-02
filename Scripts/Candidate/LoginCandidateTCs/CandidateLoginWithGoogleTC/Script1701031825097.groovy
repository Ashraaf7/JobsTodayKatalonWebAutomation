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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.edge.EdgeDriver as EdgeDriver
import org.openqa.selenium.edge.EdgeOptions as EdgeOptions
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
/*
String pathToChromeDriver = 'C:\\Users\\asmaa.fawzy\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe'

System.setProperty('webdriver.chrome.driver', pathToChromeDriver)

// It is important that this chromeProfilePath ends with User Data and not with the profile folder (Profile 2)
String chromeProfilePath = 'C:\\Users\\asmaa.fawzy\\AppData\\Local\\Google\\Chrome\\User Data'

ChromeOptions chrome = new ChromeOptions()

chrome.addArguments('user-data-dir=' + chromeProfilePath)

// Here you specify the actual profile folder (Profile 2)
chrome.addArguments('profile-directory= Profile 67')

chrome.addArguments('--disable-gpu') // applicable to windows os only

chrome.addArguments('--disable-dev-shm-usage') // overcome limited resource problems

chrome.addArguments('--no-sandbox') // Bypass OS security model

chrome.addArguments('--headless') // Bypass OS security model

WebDriver driver = new ChromeDriver(chrome)

//driver.get("https://gmail.com/");
DriverFactory.changeWebDriver(driver)
*/
// Here you can continue your test case
WebUI.openBrowser('')
WebUI.navigateToUrl("https://www.jobstoday.world/en/login/")

WebUI.maximizeWindow()

System.out.print(WebUI.getUrl())

if (WebUI.verifyElementVisible(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'), 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/regCandElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/button_Accept All Cookies'))
}

//WebUI.click(findTestObject('Object Repository/loginElements/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Login'))

//WebUI.click(findTestObject('Object Repository/LoginWithGoogle/Page_Login to Jobstoday.world - Create Resu_ef8a51/span_Sign in with Google'))

// Get the driver instance
driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

// Call the sendKeys() method on the Actions instance to simulate keyboard input


Thread.sleep(5000)

for(int i= 0; i < 16 ;i++){
	a.sendKeys(Keys.TAB).build().perform()
	
}
Thread.sleep(5000)

a.sendKeys(Keys.ENTER).build().perform()
Thread.sleep(5000)
System.out.print(WebUI.getUrl())
WebUI.switchToWindowTitle('Sign in - Google Accounts')

a.sendKeys(Keys.TAB).build().perform()
a.sendKeys(Keys.ENTER).build().perform()

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl("https://www.jobstoday.world/en/new-dashboard/overview/")

WebUI.verifyMatch(WebUI.getUrl(), "https://www.jobstoday.world/en/new-dashboard/overview/", false)