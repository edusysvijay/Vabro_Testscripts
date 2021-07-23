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

WebUI.navigateToUrl('https://www.mailinator.com/v4/public/inboxes.jsp')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Registration_page/Accountset_mailinator/input_inbox_field'), findTestData('Vabro_Testdata/Registration_testdata').getValue(
        'Email Address Register', 1))

WebUI.click(findTestObject('Registration_page/Accountset_mailinator/button_GO'))

WebUI.delay(1)

WebUI.click(findTestObject('Registration_page/Accountset_mailinator/Vabro-Teammailtable'))

WebUI.delay(2)

//BY switching frame
//WebUI.switchToFrame(findTestObject('Registration_page/Accountset_mailinator/iframe EMAIL BODY'), 0)
WebUI.click(findTestObject('Registration_page/Accountset_mailinator/span_Verify Email Address'))

WebUI.delay(3)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Registration_page/Accountset_mailinator/input_First Name'))

WebUI.setText(findTestObject('Object Repository/Registration_page/Accountset_mailinator/input_First Name'), findTestData(
        'Vabro_Testdata/Registration_testdata').getValue('First Name', 1))

WebUI.click(findTestObject('Registration_page/Accountset_mailinator/input_Last Name'))

WebUI.setText(findTestObject('Registration_page/Accountset_mailinator/input_Last Name'), findTestData('Vabro_Testdata/Registration_testdata').getValue(
        'Last Name', 1))

WebUI.click(findTestObject('Registration_page/Accountset_mailinator/input_Password'))

WebUI.setText(findTestObject('Registration_page/Accountset_mailinator/input_Password'), findTestData('Vabro_Testdata/Registration_testdata').getValue(
        'Password', 1))

WebUI.click(findTestObject('Registration_page/Accountset_mailinator/input ConfirmPassword'))

WebUI.setText(findTestObject('Registration_page/Accountset_mailinator/input ConfirmPassword'), findTestData('Vabro_Testdata/Registration_testdata').getValue(
        'Confirm password', 1))

WebUI.click(findTestObject('Registration_page/Accountset_mailinator/button_Submit'))

