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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.apache.commons.lang3.StringUtils.join

CustomKeywords.'customPackage.login.loginIntoApplicationWithGlobalVariable'()

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/home/welcome')

WebUI.click(findTestObject('Vabro_Welcome/Add_OR_Update_CompanyDetails/a_Update CompanyDetails_button'))

CustomKeywords.'customPackage.CustomFileUpload.uploadFile'(findTestObject('Vabro_Welcome/Add_OR_Update_CompanyDetails/Upload_company_logo'), 
    'D:\\Edusys Notes\\FilesBySize\\SampleJPGImage_50kbmb.jpg')
WebUI.delay(2)
selenium = new WebDriverBackedSelenium()

selenium.click("xpath=//div[@id='cropper-model']/div/div/div[2]/div")
selenium.click("xpath=//div[@id='cropper-model']/div/div/div[2]/div/div[3]/span[5]")
selenium.click("xpath=//div[@id='cropper-model']/div/div/div[3]/div/div/div/button[2]")
selenium.click("xpath=//div[@id='cropper-model']/div/div/div[3]/div/div/div/button[2]")
selenium.doubleClick("xpath=//div[@id='cropper-model']/div/div/div[3]/div/div/div/button[2]")
selenium.click("xpath=//div[@id='cropper-model']/div/div/div[3]/div/div/div/button[2]")
selenium.click("xpath=//div[@id='cropper-model']/div/div/div[2]/div/div[3]/span[5]")
selenium.click("xpath=//div[@id='cropper-model']/div/div/div[2]/div")
selenium.click("xpath=//div[@id='cropper-model']/div/div/div[2]/div/div[3]/span[5]")
selenium.click("id=crop")

//WebUI.click(findTestObject('Vabro_Welcome/Add_OR_Update_CompanyDetails/Logo_Upload_tools/image_Crop'))

