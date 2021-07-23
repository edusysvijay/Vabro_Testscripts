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
import org.testng.Assert as Assert
import org.testng.Assert as Keys

/*CustomKeywords.'customPackage.login.loginIntoApplication'('https://vabro-staging.azurewebsites.net/', 'tester1.11@yandex.com', 
    'Tester@123')

WebUI.click(findTestObject('Create_Project/Edit_this_Project/Edit Colon'))

WebUI.click(findTestObject('Create_Project/Edit_this_Project/Edit this Project'))

WebUI.click(findTestObject('Create_Project/Project_Overview/button_Save and Continue'))

WebUI.click(findTestObject('Create_Project/Project_Details/button_Save and Continue'))

WebUI.click(findTestObject('Create_Project/Project_Epics/Edit button'))*/

WebUI.click(findTestObject('Create_Project/Project_Epics/Epic-title'))

WebUI.setText(findTestObject('Create_Project/Project_Epics/Epic-title'), 'ABC')

WebUI.click(findTestObject('Create_Project/Project_Epics/product Owner1'))

//WebUI.click(findTestObject('Create_Project/Project_Epics/ProductOwner_Cancel_Button'))
WebUI.mouseOver(findTestObject('Create_Project/Project_Epics/productowner_Tester2.2 PO'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create_Project/Project_Epics/productowner_Tester2.2 PO'))

WebUI.click(findTestObject('Create_Project/Project_Epics/Additional production TextBox'))

WebUI.mouseOver(findTestObject('Create_Project/Project_Epics/Additional_tester1.11 PA'))

WebUI.click(findTestObject('Create_Project/Project_Epics/Additional_tester1.11 PA'))

WebUI.click(findTestObject('Create_Project/Project_Epics/Add More'))

WebUI.click(findTestObject('Create_Project/Project_Epics/button_Save and Continue'))

WebUI.callTestCase(findTestCase('Main TestCases/Project_Edit/Edit_Project-Member'), [:], FailureHandling.STOP_ON_FAILURE)

