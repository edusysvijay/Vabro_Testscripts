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

//Negative testcase
WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Add New Address'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_Address Line 1                         _73fb14'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input__AddressLine1'), 'rf')

WebUI.check(findTestObject('Company_Details/Add_Company_Details/input_Address Line 2'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Address Line 2'), 'f')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_City_City'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_City_City'), 'h')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_State'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_State'), 'o')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_Zip Code'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Zip Code'), 'd0')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_Phone Number'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number'), '23rfnb')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Close'))

//Positive Testcase
WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Add New Address'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input__AddressLine1'), 'IRC village near nayapalli ')

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Address Line 2'), 'Nayapalli Jaydev bihar')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_City_City'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_City_City'), 'Bhubaneswar')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/input_State'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_State'), 'odisha')

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Zip Code'), '751007')

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number'), '7381262664')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/a_Edit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/div_Phone Number'))

WebUI.setText(findTestObject('Company_Details/Add_Company_Details/input_Phone Number'), '8073801721')

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_Submit'))

WebUI.click(findTestObject('Company_Details/Add_Company_Details/button_SAVE'))

CustomKeywords.'customPackage.Logout_p.VabroLogoutpage'()

