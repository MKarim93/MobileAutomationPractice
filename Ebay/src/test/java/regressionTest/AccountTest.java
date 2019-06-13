package regressionTest;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Account;
import regression.Register;


public class AccountTest extends MobileAPI {

    Account account;
    Register register;

    @BeforeMethod
    public void init(){
        account= PageFactory.initElements(appiumDriver,Account.class);
        register= PageFactory.initElements(appiumDriver,Register.class);

    }
    @Test
    public void Myaccounttest(){
        account.setSignIn();
        account.setCreateAccount();
        account.setUseEmail();

    }
    @Test
    public void setRegistertest(){
        register.setRegister();
        register.setName("Mohammad");
        register.setEmail("Karim@gmail.com");
        register.setPassword("password");
        register.setSelectphonenumber();
        register.setSubmit();
    }
}
