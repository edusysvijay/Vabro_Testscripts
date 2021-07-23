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

CustomKeywords.'customPackage.login.loginIntoApplicationWithGlobalVariable'()

String Title = WebUI.getWindowTitle()

String Title2 = 'Add Company Details - VABROClient'

//The pagetitle Name, Add Company Details - VABROClient
if (Title.equals(Title2)) {
    WebUI.executeJavaScript('alert(\'page title not matched or not in the page of company details\')', null)
} else {
    WebUI.comment('Title matched')
}

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/home/welcome')

WebUI.click(findTestObject('Vabro_Welcome/Add-Update-CompanyDetails'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Company Name_CompanyName'), findTestData('Vabro_Testdata/vabro_testdata').getValue(
        'Company Name', 1))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Website_Website'), findTestData('Vabro_Testdata/vabro_testdata').getValue(
        'Company Website', 1))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Company Email Id_CompanyEmailId'), findTestData(
        'vabro_testdata').getValue('Company mail Id', 1))

CustomKeywords.'customPackage.FileUpload.uploadFile'(findTestObject('Company_Details/Add_Company_Details/input_Upload Logo_Logo'), 
    'C:\\Users\\Edusys\\Katalon Studio\\VABRO_TestScripts\\SampleJPGImage_100kbmb.jpg')

WebUI.delay(1)

//Zoom in
WebUI.mouseOver(findTestObject('Company_Details/Add_Company_Details/button_zoom-in'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_zoom-in'))

//Zoom out
WebUI.mouseOver(findTestObject('Company_Details/Add_Company_Details/button_zoom-out'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_zoom-out'))

//Reset the image
WebUI.mouseOver(findTestObject('Company_Details/Add_Company_Details/button_reset'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_reset'))

WebUI.mouseOverOffset(findTestObject('Company_Details/Add_Company_Details/cursor Logo_cropper-point'), 203, 150)

WebUI.dragAndDropByOffset(findTestObject('Company_Details/Add_Company_Details/source_ Logo_-move'), 157, 58)

//Reset the image
WebUI.mouseOver(findTestObject('Company_Details/Add_Company_Details/button_reset'))

WebUI.delay(2)

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Crop'))

WebUI.delay(2)

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_SAVE'))

WebUI.delay(2)

