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

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/home/login?ReturnUrl=%2FHome%2Fcompany-details')

WebUI.sendKeys(findTestObject('null'), 
    findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Email Id', 1))

WebUI.sendKeys(findTestObject('null'), findTestData(
        'Vabro_login details/New Test Data for vabrologin').getValue('Password', 1))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

String Title = WebUI.getWindowTitle()

String Title2 = 'Add Company Details - VABROClientttr'

//The pagetitle Name
//Add Company Details - VABROClient
if (Title.equals(Title2)) {
    WebUI.comment('Title matched')
} else {
    WebUI.executeJavaScript('alert(\'page title not matched or not in the page of company details\')', null)
}

WebUI.setText(findTestObject('null'), 
    findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Company Name', 1))

WebUI.setText(findTestObject('null'), 
    findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Company Website', 1))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Company mail Id', 1))

CustomKeywords.'com.test.vabro.Vabrofileupload.uploadFile'(findTestObject('Vabro_welcome/Page_Add Company Details - VABROClient/input_Upload Logo_Logo'), 
    'C:\\Users\\NAMRATA BEHERA\\Pictures\\Screenshots\\hd-wallpaper.png')

WebUI.mouseOver(findTestObject('uploadfile/Page_Add Company Details - VABROClient/button_zoom-in'))

WebUI.click(findTestObject('uploadfile/Page_Add Company Details - VABROClient/button_zoom-in'))

WebUI.mouseOver(findTestObject('uploadfile/Page_Add Company Details - VABROClient/button_zoom-out'))

WebUI.click(findTestObject('uploadfile/Page_Add Company Details - VABROClient/button_zoom-out'))

WebUI.mouseOver(findTestObject('uploadfile/Page_Add Company Details - VABROClient/button_reset'))

WebUI.click(findTestObject('uploadfile/Page_Add Company Details - VABROClient/button_reset'))

WebUI.mouseOverOffset(findTestObject('uploadfile/Page_Add Company Details - VABROClient/cursor Logo_cropper-point'), 203, 
    150)

WebUI.dragAndDropByOffset(findTestObject('uploadfile/Page_Add Company Details - VABROClient/source_ Logo_-move'), 157, 58)

//WebUI.dragAndDropToObject(findTestObject('uploadfile/Page_Add Company Details - VABROClient/source_ Logo_-move'), findTestObject(
//        'uploadfile/Page_Add Company Details - VABROClient/desLogo_cropper-move'))
WebUI.delay(2)

WebUI.click(findTestObject('Vabro_welcome/Page_Add Company Details - VABROClient/button_Crop'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

CustomKeywords.'com.test.vabro.Logoutpage.VabroLogoutpage'()

