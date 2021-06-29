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

WebUI.click(findTestObject('Vabro_CreateProject/Project Details/a_Add Files'))

WebUI.delay(2)

CustomKeywords.'customPackage.CustomFileUpload.uploadFile'(findTestObject('Vabro_CreateProject/Project Details/button_Browse'), 
    'D:\\Edusys Notes\\FilesBySize\\SampleJPGImage_50kbmb.jpg')

WebUI.delay(2)

WebUI.click(findTestObject('Vabro_CreateProject/Project Details/a_Add Links'))

WebUI.delay(2)

WebUI.setText(findTestObject('Vabro_CreateProject/Project Details/input_Links_ProjectLinks0.AttachmentLink'), GlobalVariable.G_AttachmentLink)

WebUI.delay(2)

WebUI.setText(findTestObject('Vabro_CreateProject/Project Details/textarea_Changes_ProjectComments0.Comment'), GlobalVariable.G_Comment)

WebUI.delay(2)

WebUI.click(findTestObject('Vabro_CreateProject/Project Details/button_Add Project Details'))

WebUI.callTestCase(findTestCase('Main TestCases/Project_Creation/Project-Epics'), [:], FailureHandling.STOP_ON_FAILURE)