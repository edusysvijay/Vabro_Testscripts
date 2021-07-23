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

/*CustomKeywords.'customPackage.login.loginIntoApplication'('https://vabro-staging.azurewebsites.net/', 'tester1.11@yandex.com', 
    'Tester@123')

WebUI.click(findTestObject('Create_Project/Edit_this_Project/Edit Colon'))

WebUI.click(findTestObject('Create_Project/Edit_this_Project/Edit this Project'))

WebUI.click(findTestObject('Create_Project/Project_Overview/button_Save and Continue'))

WebUI.click(findTestObject('Create_Project/Project_Details/button_Save and Continue'))

WebUI.click(findTestObject('Create_Project/Project_Epics/button_Save and Continue'))*/

WebUI.click(findTestObject('Create_Project/Project_Member/ScrumMasterCancel'))

WebUI.click(findTestObject('Create_Project/Project_Member/SCRUM MASTER DropDown'))

WebUI.mouseOver(findTestObject('Create_Project/Project_Member/tester.3.18 STM-1'))

WebUI.click(findTestObject('Create_Project/Project_Member/tester.3.18 STM-1'))

WebUI.click(findTestObject('Create_Project/Project_Member/AdditionalScrumMasterCancel'))

WebUI.click(findTestObject('Create_Project/Project_Member/AdditionalScrumMasterDropDown'))

WebUI.mouseOver(findTestObject('Create_Project/Project_Member/tester3.15 ASM-1'))

WebUI.click(findTestObject('Create_Project/Project_Member/tester3.15 ASM-1'))

WebUI.click(findTestObject('Create_Project/Project_Member/ScrumTeamCancel'))

WebUI.click(findTestObject('Create_Project/Project_Member/SCRUM TEAM DropDOwn'))

WebUI.mouseOver(findTestObject('Create_Project/Project_Member/tester3.20 STM-2'))

WebUI.click(findTestObject('Create_Project/Project_Member/tester3.20 STM-2'))

WebUI.click(findTestObject('Create_Project/Project_Member/button_Save and Continue'))

