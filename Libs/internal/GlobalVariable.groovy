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
    public static Object Staging
     
    /**
     * <p></p>
     */
    public static Object Production
     
    /**
     * <p></p>
     */
    public static Object CandidateStagingEmail
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object JobSeekerProductonEmail
     
    /**
     * <p></p>
     */
    public static Object EmployerEmail
     
    /**
     * <p></p>
     */
    public static Object newPassword
     
    /**
     * <p></p>
     */
    public static Object UpdatedEmail
     
    /**
     * <p></p>
     */
    public static Object flagEmail
     
    /**
     * <p></p>
     */
    public static Object CandidateEmail
     
    /**
     * <p></p>
     */
    public static Object jobURL
     
    /**
     * <p></p>
     */
    public static Object location
     
    /**
     * <p></p>
     */
    public static Object jobTitle
     
    /**
     * <p></p>
     */
    public static Object outlookEmail
     
    /**
     * <p></p>
     */
    public static Object outlookPassword
     
    /**
     * <p></p>
     */
    public static Object urlForReset
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            Staging = selectedVariables['Staging']
            Production = selectedVariables['Production']
            CandidateStagingEmail = selectedVariables['CandidateStagingEmail']
            Password = selectedVariables['Password']
            JobSeekerProductonEmail = selectedVariables['JobSeekerProductonEmail']
            EmployerEmail = selectedVariables['EmployerEmail']
            newPassword = selectedVariables['newPassword']
            UpdatedEmail = selectedVariables['UpdatedEmail']
            flagEmail = selectedVariables['flagEmail']
            CandidateEmail = selectedVariables['CandidateEmail']
            jobURL = selectedVariables['jobURL']
            location = selectedVariables['location']
            jobTitle = selectedVariables['jobTitle']
            outlookEmail = selectedVariables['outlookEmail']
            outlookPassword = selectedVariables['outlookPassword']
            urlForReset = selectedVariables['urlForReset']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
