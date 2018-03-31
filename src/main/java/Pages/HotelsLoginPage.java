package Pages;

import framework.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Dimension;
import stepdefinition.SharedSD;

/**
 * Created by taniaamin on 3/29/18.
 */
public class HotelsLoginPage extends BaseAction {


    //Sign-in locators:
    @AndroidFindBy(id = "com.hcom.android:id/txt_sign_in_email_address")
    private MobileElement emailSignInTextField;
    @AndroidFindBy(id = "com.hcom.android:id/txt_sign_in_password")
    private MobileElement passwordSignInTextField;
    @AndroidFindBy(id = "com.hcom.android:id/aut_sig_p_signin_btn_sign_in")
    private MobileElement signInButton;
    @AndroidFindBy(id = "com.hcom.android:id/alertMessage")
    private MobileElement errorMessage;

    //Sign-in Locators activities:
    public void enterEmailAddressSignIn(String email) {
        setValue(emailSignInTextField, email);
    }
    public void enterPasswordSignIn(String password) {
        setValue(passwordSignInTextField, password);
    }
    public void tapOnSignInButton() {
        tapOn(signInButton);
    }
    public String getErrorMessage(){
        return getValue(errorMessage);
    }

    public void swipe(){

    }





//-----------------------------------------------------------------------------------------------------------------------




    //Create Account Locators
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_email_address")
    private MobileElement emailTextField;
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_email_address_confirm")
    private MobileElement emailConfirmTextField;
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_first_name")
    private MobileElement firstnameTextField;
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_last_name")
    private MobileElement lastNameTextField;
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_address1")
    private MobileElement addressLine1TextField;
    @AndroidFindBy(id = "com.hcom.android:id/txt_register_1_city")
    private MobileElement cityTextField;
    @AndroidFindBy(id = "com.hcom.android:id/register_1_submit")
    private MobileElement nextStepButton;
    @AndroidFindBy(id = "com.hcom.android:id/spinner_register_1_state_province")
    private MobileElement stateDropDownField;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Arizona']")
    private MobileElement selectArizona;
    @AndroidFindBy(id = "com.hcom.android:id/register_2_password")
    private MobileElement passwordTextField;
    @AndroidFindBy(id = "com.hcom.android:id/register_2_confirm_password")
    private MobileElement passwordConfirmTextField;
    @AndroidFindBy(id = "com.hcom.android:id/register_2_tc_privacy_agree")
    private MobileElement policyCheckBox;
    @AndroidFindBy(id = "com.hcom.android:id/register_2_submit")
    private MobileElement submitButton;


    //Step 1 activities:
    public void enterEmail(String email) {
        setValue(emailTextField, email);
    }
    public void enterEmailConfirm(String emailConfirm) {
        setValue(emailConfirmTextField, emailConfirm);
    }
    public void enterFirstName(String firstName) {
        setValue(firstnameTextField, firstName);
    }
    public void enterLastName(String lastName) {
        setValue(lastNameTextField, lastName);
    }
    public void enterAddressLine1(String address) {
        setValue(addressLine1TextField, address);
    }
    public void enterCity(String city) {
        setValue(cityTextField, city);
    }
    public void selectState() {
        tapOn(stateDropDownField);
        tapOn(selectArizona);
    }
    public void tapOnNextStepButton() {
        tapOn(nextStepButton);
    }
    public void step1WrapUp(){
        enterEmail("jane@technosoftacademy.io");
        enterEmailConfirm("jane@technosoftacademy.io");
        enterFirstName("Jane");
        enterLastName("Doe");
        enterAddressLine1("38th street");
        enterCity("city");
        //scroll down the page
        scrollTo("Next: Step 2");
        selectState();
        tapOnNextStepButton();
    }

    //redirects to Step 2.
    //Step 2 activities:
    public void enterPasswordFirstTime(String password) {
        setValue(passwordTextField, password);
    }
    public void enterpasswordSecondTime(String passwordConfirm) {
        setValue(passwordConfirmTextField, passwordConfirm);
    }
    public void tapOnPolicyCheckBox() {
        tapOn(policyCheckBox);
    }
    public void tapOnSubmitButton() {
        tapOn(submitButton);
    }
    public void step2WrapUp(){
        //scroll down the page first
        scrollTo("Submit");
        enterPasswordFirstTime("Test12345");
        enterpasswordSecondTime("Test12345");
        tapOnPolicyCheckBox();
    }





}
