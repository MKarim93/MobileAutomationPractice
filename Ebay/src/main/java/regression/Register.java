package regression;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Register extends MobileAPI {

    @FindBy(id = "com.ebay.mobile:id/button_register")
    WebElement register;
    @FindBy(id = "com.ebay.mobile:id/button_business")
    WebElement BusinessAccount;
    @FindBy(id = "businessname")
    WebElement name;
    @FindBy(id = "businessemail")
    WebElement email;
    @FindBy(id = "rbusinessemail")
    WebElement re_email;
    @FindBy(id = "PASSWORD_BIZREG")
    WebElement password;
    @FindBy(xpath = "//android.widget.Spinner[@text='Country and dial code']")
    WebElement selectphonenumber;
    @FindBy(id = "dial-code-labelphoneFlagComp1Businessdescription")
    WebElement phone;
    @FindBy(id = "sbtBtnBusiness")
    WebElement submit;

    public void setRegister(){
        register.click();
        BusinessAccount.click();
    }

    public void setName(String people){
        name.sendKeys(people);
    }
    public void setEmail(String emailadd){
        email.sendKeys(emailadd);
        re_email.sendKeys(emailadd);
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }
    public void setSelectphonenumber(){
        selectphonenumber.click();
        Select select = new Select(selectphonenumber);
        select.selectByIndex(0);
    }
    public  void setSubmit(){
        submit.click();
    }
}
