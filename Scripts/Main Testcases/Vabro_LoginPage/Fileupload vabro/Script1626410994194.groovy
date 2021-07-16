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

CustomKeywords.'com.test.vabro.Loginpage.Vabrologinpage'('')

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/home/login?ReturnUrl=%2Fhome%2Fwelcome')

WebUI.setText(findTestObject('null'), 
    findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Email Id', 1))

WebUI.setText(findTestObject('null'), findTestData(
        'Vabro_login details/New Test Data for vabrologin').getValue('Password', 1))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

CustomKeywords.'com.test.vabro.Vabrofileupload.uploadFile'(findTestObject('Vabro_welcome/Page_Add Company Details - VABROClient/input_Upload Logo_Logo'), 
    'C:\\Users\\NAMRATA BEHERA\\Desktop\\java grrom screeshot\\logo.gif..n.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('null'))

WebUI.delay(1)

WebUI.click(findTestObject('uploadfile/Page_Add Company Details - VABROClient/button_SAVE'))

CustomKeywords.'com.test.vabro.Logoutpage.VabroLogoutpage'()

