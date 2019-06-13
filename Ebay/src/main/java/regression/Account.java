package regression;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account extends MobileAPI {

    @FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    WebElement SignIn;
    @FindBy(xpath = "//android.widget.Button[@text='CREATE AN ACCOUNT']")
    WebElement CreateAccount;
    @FindBy(xpath = "//android.widget.Button[@text='USE YOUR EMAIL']")
    WebElement UseEmail;

    public void setSignIn(){
        SignIn.click();
    }
    public void setCreateAccount(){
        CreateAccount.click();
    }
    public void setUseEmail(){
        UseEmail.click();
    }
}
