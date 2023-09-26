import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.List

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

WebUI.callTestCase(findTestCase('Test Cases/Employee/EmployeeLoginTC'), [:])


WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_Jobs Search, Search for a Job - Jobsto_ce5d69/a_Find Jobseekers'))

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/input_PL_keywords'), 'sw tester')


WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/button_Search'))


// Get the driver instance
def driver = DriverFactory.getWebDriver()
String current = driver.getWindowHandle();

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/a_VIEW PROFILE'))
ArrayList<String> handels=  new ArrayList<String>(driver.getWindowHandles());
for(String s : handels)
{
	    if (!s.equals(current)) {
        driver.switchTo().window(s);
    }
}


WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/button_Message'))

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/textarea_Contact inquiry_input_inquiry'), 'test')

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/input_First name_input_firstname'), 'ahmed')

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/input_Last name_input_lastname'), 'test')

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/input_Phone number_input_phone'), '+201146196154')

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/input_Email address_input_email'), 'employee@gmail.com')

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/input_Company_input_company'), 'testawy')

WebUI.setText(findTestObject('Object Repository/ContactJobSeeker/Page_/input_Website_input_website'), '')


WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/input_Website_privacy'))



// Create an instance of the Actions class
def a = new Actions(driver)

// Call the sendKeys() method on the Actions instance to simulate keyboard input
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();
a.sendKeys(Keys.TAB).build().perform();

// a.MoveToElement(_driver.FindElement(By.XPath("//button[@id='btn-card-verify']"))).Build().Perform();
Thread.sleep(2000);
char a1 = '\u0030';
char a2 = '\u0037';
char a3 = '\u0038';
char a4 = '\u0039';

a.sendKeys(   String.valueOf(a1),
		String.valueOf(a2),
		String.valueOf(a3),
		String.valueOf(a4)).build().perform();

WebUI.sendKeys(findTestObject('Object Repository/ContactJobSeeker/Page_/button_Send'),String.valueOf(a1 + a2 + a3 + a4))


WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/button_Send'))

WebUI.verifyElementVisible(findTestObject('Object Repository/ContactJobSeeker/Page_/div_You have successfully sent  a message'))

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/a_Close'))
Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_/img_1'))
WebUI.click(findTestObject('Object Repository/ContactJobSeeker/forHover'))

WebUI.click(findTestObject('Object Repository/ContactJobSeeker/Page_Jobstoday/span_Logout'))

WebUI.closeBrowser()
