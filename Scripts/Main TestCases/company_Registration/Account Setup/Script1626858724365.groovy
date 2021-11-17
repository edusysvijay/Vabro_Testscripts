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

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('Account setup/input_Type the Email name of your choice_login'), 'testerkat17@yopmail.com')

WebUI.click(findTestObject('Registration_page/verify_Email/i_Enter'))

WebUI.delay(1)

WebUI.switchToWindowTitle('Inbox')

WebUI.delay(1)

//WebUI.mouseOver(findTestObject('Registration_page/Account setup/Thanks Verify Email Address'))
WebUI.click(findTestObject('Registration_page/Account setup/Thanks Verify Email Address'))

WebUI.delay(1)

WebUI.setText(findTestObject('Registration_page/Account setup/First Name'), 'Automation')

WebUI.setText(findTestObject('Registration_page/Account setup/Last Name'), 'Tester1')

WebUI.setText(findTestObject('Registration_page/Account setup/input_Password'), 'Tester@123')

WebUI.setText(findTestObject('Registration_page/Account setup/Confirm Password'), 'Tester@123')

WebUI.click(findTestObject('Registration_page/Account setup/button_Submit'))

