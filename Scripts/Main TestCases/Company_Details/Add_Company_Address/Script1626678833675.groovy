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

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/Home/company-address')

//Positive Testcase
for (def row = 1; row <= findTestData('vabro_testdata').getRowNumbers(); row++) {
    WebUI.delay(2)

    WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Add New Address'))

    WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input__AddressLine1'), findTestData('vabro_testdata').getValue(
            'Address Line 1', row))

    WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Address Line 2_AddressLine2'), findTestData(
            'vabro_testdata').getValue('Address Line 2', row))

    WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_City_City'))

    WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_City_City'), findTestData('vabro_testdata').getValue(
            'City', row))

    WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_State_State'))

    WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_State_State'), findTestData('vabro_testdata').getValue(
            'State', row))

    WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Zip Code_PostalCode'), findTestData('vabro_testdata').getValue(
            'Zip', row))

    WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number_PhoneNo'), findTestData('vabro_testdata').getValue(
            'Ph number', row))

    WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))

    WebUI.delay(2)
}

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_SAVE'))

//Address Update

WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Edit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_Phone Number'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number_PhoneNo'), '8073801721')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_SAVE'))

CustomKeywords.'customPackage.logout.VabroLogoutpage'()
WebUI.closeBrowser()
