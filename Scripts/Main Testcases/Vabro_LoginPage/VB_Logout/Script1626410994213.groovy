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

CustomKeywords.'com.test.vabro.Loginpage.Vabrologinpage'('')

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/')

for (def row = 1; row <= findTestData('Vabro_login details/New Test Data for vabrologin').getRowNumbers(); row++) {
    WebUI.setText(findTestObject('null'), 
        findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Email Id', row))

    WebUI.setText(findTestObject('null'), 
        findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Password', row))
}

WebUI.click(findTestObject('null'))

CustomKeywords.'com.test.vabro.Verifytittle.VerifyingTitle'('Project - VABROClient')

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.click(findTestObject('null'))

CustomKeywords.'com.test.vabro.Logoutpage.VabroLogoutpage'()

