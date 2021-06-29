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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

CustomKeywords.'customPackage.login.loginIntoApplicationWithGlobalVariable'()

WebUI.delay(2)

WebUI.click(findTestObject('Vabro_Welcome/CreateProject/a_Create New Project'))

WebUI.delay(2)

WebUI.setText(findTestObject('Vabro_CreateProject/Project Overview/input__ProjectName'), GlobalVariable.G_ProjectName)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Vabro_CreateProject/Project Overview/SelectScruTeams'), '1', true)

for (int i = 0; i < 5; i++) {
    WebUI.click(findTestObject('Vabro_CreateProject/Project Overview/i__fas fa-minus'))

    WebUI.delay(2)
}

WebUI.click(findTestObject('Vabro_CreateProject/Project Overview/button_Save and Continue'))

WebUI.verifyElementPresent(findTestObject('Vabro_CreateProject/Project Details/div_Project Created'), GlobalVariable.G_Timeout)

WebUI.callTestCase(findTestCase('Main TestCases/Project_Creation/Project-Details'), [:], FailureHandling.STOP_ON_FAILURE)

