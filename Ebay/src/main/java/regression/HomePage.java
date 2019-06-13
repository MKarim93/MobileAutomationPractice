package regression;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='SELLING']")
    WebElement selling;
    @FindBy(xpath = "//android.widget.TextView[@text='DEALS'")
    WebElement deals;
    @FindBy(xpath = "//android.widget.TextView[@text='CATEGORIES']")
    WebElement categories;
    @FindBy(xpath = "//android.widget.TextView[@text='SAVED']")
    WebElement saved;
    @FindBy(xpath = "//android.widget.TextView[@text='Search for anything']")
    WebElement searchitem;
    @FindBy(id = "com.ebay.mobile:id/home")
    WebElement hamburger;
    @FindBy(id = "com.ebay.mobile:id/action_view_icon")
    WebElement carshopping;
    @FindBy(xpath = "//android.widget.Button[@text='REGISTER']")
    WebElement register;
    @FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    WebElement SignIn;
    @FindBy(xpath = "//android.widget.TextView[@text='Bright Days, Brighter Deals']")
    WebElement BrightDays;
    @FindBy(id = "com.ebay.mobile:id/home_banner_sub_heading")
    WebElement texttest;


    public void setSelling() {
        selling.click();
    }

    public void setDeals() {
        deals.click();
    }

    public void setCategories() {
        categories.click();
    }

    public void setSaved() {
        saved.click();
    }

    public void setSearchitem(String item) {
        searchitem.sendKeys(item);
    }

    public void setHamburger() {
        hamburger.click();
    }

    public void setCarshopping() {
        carshopping.click();
    }

    public void setSignIn() {
        SignIn.click();
    }

    public void setRegister() {
        register.click();

    }

    public void setBrightDays() {
        BrightDays.click();
    }

    public void setTexttest() {
        texttest.click();
    }
}
