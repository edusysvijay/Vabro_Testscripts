package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_SiteURL
     
    /**
     * <p></p>
     */
    public static Object G_Username
     
    /**
     * <p></p>
     */
    public static Object G_Password
     
    /**
     * <p></p>
     */
    public static Object G_AttachmentLink
     
    /**
     * <p></p>
     */
    public static Object G_Comment
     
    /**
     * <p></p>
     */
    public static Object G_ProjectName
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            G_Timeout = selectedVariables['G_Timeout']
            G_SiteURL = selectedVariables['G_SiteURL']
            G_Username = selectedVariables['G_Username']
            G_Password = selectedVariables['G_Password']
            G_AttachmentLink = selectedVariables['G_AttachmentLink']
            G_Comment = selectedVariables['G_Comment']
            G_ProjectName = selectedVariables['G_ProjectName']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
