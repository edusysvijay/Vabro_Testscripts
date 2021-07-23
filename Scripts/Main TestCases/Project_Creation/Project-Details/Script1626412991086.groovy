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

WebUI.click(findTestObject('Create_Project/Project_Overview/i_Team AOL'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Create_Project/Edit_this_Project/a_Edit this Project'))

WebUI.click(findTestObject('Create_Project/Project_Overview/button_Save and Continue'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_Project/Project_Details/a_Add Link'))

WebUI.setText(findTestObject('Create_Project/Project_Details/input_.AttachmentLink'), 'https://gmail.com')

//WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('Create_Project/Project_Details/a_Add Comment'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create_Project/Project_Details/textarea_comment'), 'hello')

WebUI.click(findTestObject('Create_Project/Project_Details/button_Save'))

WebUI.click(findTestObject('Create_Project/Project_Details/a_Add File'))

WebUI.click(findTestObject('Create_Project/Project_Details/button_Save and Continue'))

