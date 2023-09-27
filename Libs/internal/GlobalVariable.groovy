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
    public static Object EmployeeEmail
     
    /**
     * <p></p>
     */
    public static Object EmployerEmail
     
    /**
     * <p></p>
     */
    public static Object EmployerPassword
     

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
            EmployeeEmail = selectedVariables['EmployeeEmail']
            EmployerEmail = selectedVariables['EmployerEmail']
            EmployerPassword = selectedVariables['EmployerPassword']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
