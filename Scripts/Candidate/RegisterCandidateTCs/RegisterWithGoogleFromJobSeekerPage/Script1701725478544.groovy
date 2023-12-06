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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

String edgeProcessName = "msedge.exe";
String chromeProcessName = "chrome.exe";

try {
	Runtime.getRuntime().exec("taskkill /F /IM " + edgeProcessName);
	Runtime.getRuntime().exec("taskkill /F /IM " + chromeProcessName);
	
} catch (IOException | InterruptedException e) {
	e.printStackTrace();
}

WebUI.openBrowser('')
WebUI.navigateToUrl("https://jobstoday.world/en/registration/premium/s")


WebUI.maximizeWindow()

System.out.print(WebUI.getUrl())

// Get the driver instance
driver = DriverFactory.getWebDriver()

// Create an instance of the Actions class
def a = new Actions(driver)

// Call the sendKeys() method on the Actions instance to simulate keyboard input


Thread.sleep(3000)

for(int i= 0; i < 10 ;i++){
	a.sendKeys(Keys.TAB).build().perform()
	
}
Thread.sleep(3000)

a.sendKeys(Keys.ENTER).build().perform()
Thread.sleep(3000)

WebUI.switchToWindowIndex(1)
Thread.sleep(3000)

a.sendKeys(Keys.TAB).build().perform()
a.sendKeys(Keys.ENTER).build().perform()

Thread.sleep(3000)
Boolean flag = false;
try {
	WebUI.getUrl();
} catch (Exception e) {
	flag = true;
	System.out.println("Aman ya 8aly");
}

if(!flag)
{
	a.sendKeys(Keys.TAB).build().perform()
	a.sendKeys(Keys.ENTER).build().perform()
}

WebUI.switchToWindowIndex(0)
Thread.sleep(3000)
WebUI.navigateToUrl("https://www.jobstoday.world/en/new-dashboard/overview/")

WebUI.verifyMatch(WebUI.getUrl(), "https://www.jobstoday.world/en/new-dashboard/overview/", false)

driver.quit()