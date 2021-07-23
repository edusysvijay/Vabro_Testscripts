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
import org.testng.Assert as Keys

CustomKeywords.'customPackage.login.loginIntoApplication'('https://vabro-staging.azurewebsites.net/', 'tester1.11@yandex.com', 
    'Tester@123')

WebUI.click(findTestObject('Create_Project/Edit_this_Project/Edit Colon'))

WebUI.click(findTestObject('Create_Project/Edit_this_Project/Edit this Project'))

WebUI.delay(3)

String ActualTitle = WebUI.getWindowTitle()

String ExpectedTitle = 'Project Overview - VABROClient'

Assert.assertEquals(ActualTitle, ExpectedTitle)

WebUI.delay(3)

WebUI.setText(findTestObject('Create_Project/Project_Overview/input__ProjectName'), 'Edit Automation Testing')

WebUI.selectOptionByIndex(findTestObject('Create_Project/Project_Overview/Scrum Team Dropdown'), 2)

WebUI.click(findTestObject('Create_Project/Project_Overview/Public'))

WebUI.clearText(findTestObject('Create_Project/Project_Overview/select_TeamName1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Create_Project/Project_Overview/select_TeamName1'), 'TestingTeam1')

WebUI.selectOptionByIndex(findTestObject('Create_Project/Project_Overview/number of team member dropdown'), 1)

WebUI.delay(2)

WebUI.clearText(findTestObject('Create_Project/Project_Overview/Select_TeamName2'))

WebUI.setText(findTestObject('Create_Project/Project_Overview/Select_TeamName2'), 'TesteingTeam2')

WebUI.selectOptionByIndex(findTestObject('Create_Project/Project_Overview/number of team member dropdown2'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Create_Project/Project_Overview/button_Save and Continue'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Main TestCases/Project_Edit/Edit_Project-Details'), [:], FailureHandling.STOP_ON_FAILURE)

