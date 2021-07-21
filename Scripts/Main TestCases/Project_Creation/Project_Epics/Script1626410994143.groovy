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

WebUI.navigateToUrl('https://vabro-dev.azurewebsites.net/')

WebUI.setText(findTestObject('null'), 
    'testadm21@aol.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'ZaJEugbsRAzrN/6XQFXNeQ==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.mouseOver(findTestObject('Create_Project/Project_Epics/Page_Project Epics - VABROClient/product Owner1'))

WebUI.delay(1)

WebUI.click(findTestObject('Create_Project/Project_Epics/Page_Project Epics - VABROClient/product Owner1'))

WebUI.click(findTestObject('null'))

WebUI.mouseOver(findTestObject('Create_Project/Project_Epics/Page_Project Epics - VABROClient/Additional product owner'))

WebUI.delay(1)

WebUI.click(findTestObject('Create_Project/Project_Epics/Page_Project Epics - VABROClient/Additional product owner'))

WebUI.click(findTestObject('Create_Project/Project_Epics/Page_Project Epics - VABROClient/Page_Project Epics - VABROClient/success btn'))

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

