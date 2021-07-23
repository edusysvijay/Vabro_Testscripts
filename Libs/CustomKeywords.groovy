
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String



def static "customPackage.FileUpload_V.uploadFile"(
    	TestObject to	
     , 	String filePath	) {
    (new customPackage.FileUpload_V()).uploadFile(
        	to
         , 	filePath)
}


def static "customPackage.Verifytittle.VerifyingTitle"(
    	String ExpectedTitle	) {
    (new customPackage.Verifytittle()).VerifyingTitle(
        	ExpectedTitle)
}


def static "customPackage.login.loginIntoApplication"(
    	String applicationURL	
     , 	String username	
     , 	String password	) {
    (new customPackage.login()).loginIntoApplication(
        	applicationURL
         , 	username
         , 	password)
}


def static "customPackage.login.loginIntoApplicationWithGlobalVariable"() {
    (new customPackage.login()).loginIntoApplicationWithGlobalVariable()
}
