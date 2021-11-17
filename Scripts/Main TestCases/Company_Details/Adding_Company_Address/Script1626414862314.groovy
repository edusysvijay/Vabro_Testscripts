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

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net')

WebUI.setText(findTestObject('Vabro_Home Page/input_Email address_Email'), 'testerpo1@aol.com')

WebUI.setText(findTestObject('Vabro_Home Page/input_Password_Password'), 'Tester@1234')

WebUI.click(findTestObject('Vabro_Home Page/button_Login'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_AOL company'))

WebUI.navigateToUrl('https://vabro-staging.azurewebsites.net/Home/company-address')

//WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Skip for now'))
WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Add New Address'))

WebUI.delay(3)

//WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_Address Line 1                         _73fb14'))

//WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input__AddressLine1'), 'rf')
//
//WebUI.check(findTestObject('Company_Details/Add_Company_Details/input_Address Line 2'))
//
//WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Address Line 2'), 'f')
//
//WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_City_City'))
//
//WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_City_City'), 'h')
//
//WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_State_State'))
//
//WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_State_State'), 'o')
//
//WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_Zip Code_PostalCode'))
//
//WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Zip Code_PostalCode'), 'd0')
//
//WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_Phone Number'))
//
//WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number_PhoneNo'), '23rfnb')
//
//WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))
//
//WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Close'))

//WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Add New Address'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input__AddressLine1'), 'IRC village near nayapalli ')

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Address Line 2'), 'Nayapalli Jaydev bihar')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_City_City'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_City_City'), 'Bhubaneswar')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_State_State'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_State_State'), 'odisha')

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Zip Code_PostalCode'), '751007')

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number_PhoneNo'), '7381262664')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Edit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_Phone Number'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number_PhoneNo'), '8073801721')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_SAVE'))

CustomKeywords.'customPackage.Logout_p.VabroLogoutpage'()

