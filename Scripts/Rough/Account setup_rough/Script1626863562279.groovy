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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://yopmail.com/en/wm')

WebUI.setText(findTestObject('Registration_page/Account setup/Email name login'), 'automationtester-new')

WebUI.sendKeys(findTestObject('Registration_page/Account setup/Email name login'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.switchToWindowUrl('https://yopmail.com/en/wm')


WebUI.delay(2)


WebUI.mouseOver(findTestObject('Registration_page/Account setup/Thanks Verify Email Address'))


WebUI.click(findTestObject('Registration_page/Account setup/Thanks Verify Email Address'))

WebUI.delay(2)

WebUI.setText(findTestObject('Registration_page/Account setup/First Name'), 'automation')

WebUI.setText(findTestObject('Registration_page/Account setup/Last Name'), 'Tester')

WebUI.setEncryptedText(findTestObject('Registration_page/Account setup/input_Password'), 'ZaJEugbsRAySLgEY4PX/Hw==')

WebUI.setEncryptedText(findTestObject('Registration_page/Account setup/Confirm Password'), 'ZaJEugbsRAySLgEY4PX/Hw==')

WebUI.click(findTestObject('Registration_page/Account setup/button_Submit'))

