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
    public static Object employeeProductonEmail
     
    /**
     * <p></p>
     */
    public static Object EmployeeProductionEmail
     
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
     
    /**
     * <p></p>
     */
    public static Object urlForChangeEmail
     
    /**
     * <p></p>
     */
    public static Object cardNumber
     
    /**
     * <p></p>
     */
    public static Object cardHolderName
     
    /**
     * <p></p>
     */
    public static Object cvv
     
    /**
     * <p></p>
     */
    public static Object expirationDate
     
    /**
     * <p></p>
     */
    public static Object employeeStagingEmail
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            Staging = selectedVariables['Staging']
            Production = selectedVariables['Production']
            CandidateStagingEmail = selectedVariables['CandidateStagingEmail']
            Password = selectedVariables['Password']
            employeeProductonEmail = selectedVariables['employeeProductonEmail']
            EmployeeProductionEmail = selectedVariables['EmployeeProductionEmail']
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
            urlForChangeEmail = selectedVariables['urlForChangeEmail']
            cardNumber = selectedVariables['cardNumber']
            cardHolderName = selectedVariables['cardHolderName']
            cvv = selectedVariables['cvv']
            expirationDate = selectedVariables['expirationDate']
            employeeStagingEmail = selectedVariables['employeeStagingEmail']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
