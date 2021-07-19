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

WebUI.navigateToUrl('https://vabro-dev.azurewebsites.net/home/welcome')

WebUI.setText(findTestObject('Vabro_Home Page/input_Email address_Email'), 'testadm21@aol.com')

WebUI.setEncryptedText(findTestObject('Vabro_Home Page/input_Password_Password'), 'ZaJEugbsRAzrN/6XQFXNeQ==')

WebUI.click(findTestObject('Vabro_Home Page/img_Join_rounded_1'))

WebUI.mouseOver(findTestObject('Vabro_Home Page/img'))

WebUI.delay(2)

WebUI.click(findTestObject('Vabro_Home Page/img'))

WebUI.delay(3)

WebUI.click(findTestObject('Vabro_Home Page/img_Join_rounded_1'))

String Title = WebUI.getWindowTitle()

String Title2 = 'Welcome To Vabro! - VABROClient'

//The pagetitle Name
//*Welcome to Vabro!- VABROClient
if (Title.equals(Title2)) {
    WebUI.comment('Title matched')
} else {
    WebUI.executeJavaScript('alert(\'page title not matched or Do not welcome vabro\')', null)

    WebUI.delay(4)
}

//WebUI.takeScreenshot('C:\\Users\\NAMRATA BEHERA\\Pictures\\Screenshots\\Screenshot (27).png')
WebUI.click(findTestObject('Vabro_Home Page/button_Login'))

WebUI.delay(1)

CustomKeywords.'com.test.vabro.Logoutpage.VabroLogoutpage'()

