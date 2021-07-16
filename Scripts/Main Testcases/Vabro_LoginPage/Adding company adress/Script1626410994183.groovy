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

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/home/login?ReturnUrl=%2FHome%2Fcompany-details')

WebUI.setText(findTestObject('null'), 
    'testadm21@aol.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'ZaJEugbsRAzrN/6XQFXNeQ==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'rf')

WebUI.setText(findTestObject('null'), 
    'f')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'h')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'o')

WebUI.setText(findTestObject('null'), 
    'd0')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '23rfnb')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'IRC village near nayapalli ')

WebUI.setText(findTestObject('null'), 
    'Nayapalli Jaydev bihar')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'Bhubaneswar')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'odisha')

WebUI.setText(findTestObject('null'), 
    '751007')

WebUI.setText(findTestObject('null'), 
    '7381262664')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    '8073801721')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

CustomKeywords.'com.test.vabro.Logoutpage.VabroLogoutpage'()

