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

WebUI.click(findTestObject('Create_Project/Project_Overview/button_Save and Continue'))*/
WebUI.delay(3)

CustomKeywords.'customPackage.FileUpload_V.uploadFile'(findTestObject('Create_Project/Project_Details/a_Add File'), 'C:\\Users\\Edusys\\Downloads\\SCRUMstudy.pdf')

WebUI.click(findTestObject('Create_Project/Project_Details/Add File_download'))

WebUI.delay(4)

WebUI.switchToWindowTitle('Project Details - VABROClient')

System.println(WebUI.getWindowTitle())

System.println(WebUI.getUrl())

WebUI.click(findTestObject('Create_Project/Project_Details/a_Add Link'))

WebUI.click(findTestObject('Create_Project/Project_Details/AttachmentLink'))

WebUI.setText(findTestObject('Create_Project/Project_Details/AttachmentLink'), 'https://www.realme.com')

WebUI.click(findTestObject('Create_Project/Project_Details/Open_Link'))

WebUI.delay(4)

WebUI.switchToWindowIndex(0)

System.println(WebUI.getWindowIndex())

System.println(WebUI.getUrl())

WebUI.click(findTestObject('Create_Project/Project_Details/a_Add Comment'))

WebUI.click(findTestObject('Create_Project/Project_Details/Comment_Impediments_button'))

WebUI.click(findTestObject('Create_Project/Project_Details/textarea_comment'))

WebUI.setText(findTestObject('Create_Project/Project_Details/textarea_comment'), 'Welcome To Vabro')

WebUI.click(findTestObject('Create_Project/Project_Details/Save_button_comment'))

WebUI.mouseOver(findTestObject('Create_Project/Project_Details/Comment_Reply'))

WebUI.click(findTestObject('Create_Project/Project_Details/Comment_Reply'))

WebUI.delay(3)

WebUI.click(findTestObject('Create_Project/Project_Details/textarea_replycomment'))

WebUI.delay(2)

WebUI.setMaskedText(findTestObject('Create_Project/Project_Details/textarea_replycomment'), 'Welcome to Vabro')

WebUI.click(findTestObject('Create_Project/Project_Details/ReplayComment_Save_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_Project/Project_Details/button_Save and Continue'))

WebUI.callTestCase(findTestCase('Main TestCases/Project_Edit/Edit_Project-Epic'), [:], FailureHandling.STOP_ON_FAILURE)

