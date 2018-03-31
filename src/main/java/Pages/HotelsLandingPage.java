package Pages;

import framework.BaseAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Dimension;
import stepdefinition.SharedSD;

/**
 * Created by taniaamin on 3/29/18.
 */
public class HotelsLandingPage extends BaseAction {

    //Home screen locators
    @AndroidFindBy(id = "com.hcom.android:id/btnPositive")
    //@iOSFindBy(accessibility = "yesButton")
    private MobileElement yesButton;
    @AndroidFindBy(accessibility = "Open drawer menu")
    private MobileElement mainMenu;
    @AndroidFindBy(id = "com.hcom.android:id/hp_hcom_rewards_signin")
    private MobileElement signInButton;
    @AndroidFindBy(id = "com.hcom.android:id/hp_text_search")
    private MobileElement homePageHeading;
    @AndroidFindBy(id = "com.hcom.android:id/hp_hcom_rewards_create_account")
    private MobileElement createAccountButton;


    //home screen activities
    public void tapOnYesButton() {
        tapOn(yesButton);
    }
    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }

    public void tapOnSignInButton() {
        tapOn(signInButton);
    }
    public void tapOnCreateAccount(){
        tapOn(createAccountButton);
    }

}


