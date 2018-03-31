package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.HotelsLandingPage;
import Pages.HotelsLoginPage;
import org.testng.Assert;

/**
 * Created by taniaamin on 3/29/18.
 */
public class HotelsSD {

        HotelsLandingPage HotelsLandingPage = new HotelsLandingPage();
        HotelsLoginPage HotelsLoginPage = new HotelsLoginPage();


// Hotels home page activities:

    @Given("^I am on hotel app home page$")
    public void iAmOnHomePageOfHotels() throws Throwable{
        HotelsLandingPage.tapOnYesButton();
    }
    @When("^I scroll down on page$")
    public void scrollDown() throws Throwable{
     // not needed as its on same screen
    }
    @When("^I tap on (Sign In|Create Account|Submit) button$")
    public void tapOn(String field) {
        switch (field) {
            case "Sign In":
                HotelsLandingPage.tapOnSignInButton();
                break;
            case "Create Account":
                HotelsLandingPage.tapOnCreateAccount();
                break;
            case "Submit":
                HotelsLoginPage.tapOnSubmitButton();
                break;
        }
    }
    @When("^I fill out (invalid username and password|required fields)$")
    public void fillInformation(String field) {
        switch (field) {
            case "invalid username and password":
                HotelsLoginPage.enterEmailAddressSignIn("abc@technosoftacademy.io");
                HotelsLoginPage.enterPasswordSignIn("Test12345");
                HotelsLoginPage.tapOnSignInButton();
                break;
            case "required fields":
                HotelsLoginPage.step1WrapUp();
                HotelsLoginPage.step2WrapUp();
                break;
        }
    }
    @Then("^I verify invalid error message$")
    public void verifyErrorMessage() {
        Assert.assertEquals(HotelsLoginPage.getErrorMessage(), "We no longer support signing in with this version of the app. Please update to the latest version.");
    }
    @Then("^I verify successful creation of a home page$")
    public void verifyCreatingAccount()  {
        Assert.assertEquals(HotelsLoginPage.getErrorMessage(), "We no longer support signing up with this version of the app. Please update to the latest version.");
    }
}
