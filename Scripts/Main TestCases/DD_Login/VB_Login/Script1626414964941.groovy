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

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/')

//Iterating multiple data

for (def row = 1; row <= findTestData('Vabro_login details/New Test Data for vabrologin').getRowNumbers(); row++) {
    WebUI.setText(findTestObject('Object Repository/Vabro_Home Page/input_Email address_Email'), findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Email Id', 
            row))

    WebUI.setText(findTestObject('Object Repository/Vabro_Home Page/input_Password_Password'), findTestData('Vabro_login details/New Test Data for vabrologin').getValue('Password', 
            row))
}

String Title = WebUI.getWindowTitle()

String Title2 = 'Home Page - VABROClient'

//The pagetitle Name
//*Home Page - VABROClient
if (Title.equals(Title2)) {
    WebUI.comment('Title matched')
} else {
    WebUI.executeJavaScript('alert(\'page title not matched or this is not Vabro homepage\')', null)

    WebUI.delay(2)
}

WebUI.click(findTestObject('Vabro_Home Page/span_Show'))

WebUI.click(findTestObject('Vabro_Home Page/span_Hide'))

WebUI.click(findTestObject('Vabro_Home Page/img_Join_rounded'))

WebUI.click(findTestObject('Vabro_Home Page/input_concat'))

WebUI.click(findTestObject('Vabro_Home Page/img_Join_rounded'))

WebUI.delay(2)

WebUI.click(findTestObject('Vabro_Home Page/button_Login'))

WebUI.delay(2)

CustomKeywords.'customPackage.Logout_p.VabroLogoutpage'()

