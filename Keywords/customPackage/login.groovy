package customPackage


import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
/*
 * Open browser
 * Navigate to URL -> get to Global variable
 * Provide username and password
 * Click on Login
 * */
/*
 * Will read value from Global Variable
 * */
public class login {
	@Keyword
	def static void loginIntoApplication(String applicationURL,String username,String password){

		WebUI.openBrowser(applicationURL)
		WebUI.waitForPageLoad(GlobalVariable.G_Timeout)
		WebUI.maximizeWindow()

		//		WebUI.waitForElementVisible(findTestObject('Pages/MyAccount page/nav_HomeMyaccount'), GlobalVariable.G_Timeout)

		WebUI.sendKeys(findTestObject('Vabro_Login/input_Email address'), username)
		WebUI.sendKeys(findTestObject('Vabro_Login/input_Password'), password)
		WebUI.delay(1)
		WebUI.click(findTestObject('Vabro_Login/button_Login'))
		WebUI.delay(1)
	}

	@Keyword
	def static void loginIntoApplicationWithGlobalVariable(){
		loginIntoApplication(GlobalVariable.G_SiteURL, GlobalVariable.G_Username, GlobalVariable.G_Password)
	}
}

