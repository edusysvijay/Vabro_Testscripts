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

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/')

WebUI.setText(findTestObject('Vabro_Home Page/input_Email address_Email'), 'testadm21@aol.com')

WebUI.setEncryptedText(findTestObject('Vabro_Home Page/input_Password_Password'), 'ZaJEugbsRAzrN/6XQFXNeQ==')

WebUI.click(findTestObject('Vabro_Home Page/span_Show'))

WebUI.click(findTestObject('Vabro_Home Page/span_Hide'))

WebUI.click(findTestObject('Vabro_Home Page/button_Login'))

WebUI.click(findTestObject('Create_Project/Project_Overview/i_Team AOL'))

WebUI.click(findTestObject('Create_Project/Edit_this_Project/a_Edit this Project'))

WebUI.click(findTestObject('Create_Project/Project_Overview/input__ProjectName'))

WebUI.selectOptionByValue(findTestObject('Create_Project/Project_Overview/select_1                                   _7fb073'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Create_Project/Project_Overview/select_members'), '2', true)

WebUI.selectOptionByValue(findTestObject('Create_Project/Project_Overview/select_members'), '2', true)

WebUI.click(findTestObject('Create_Project/Project_Overview/button_Save and Continue'))

CustomKeywords.'customPackage.Logout_p.VabroLogoutpage'()

