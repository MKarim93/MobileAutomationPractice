package regressionTest;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class HomePageTest extends MobileAPI {

    HomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }

    @Test
    public void setsellingTest(){
        homePage.setDeals();
    }
    @Test(enabled = false)
    public void setdealeTest(){
        homePage.setSelling();
    }
    @Test
    public void setCategoriesTest(){
        homePage.setCategories();
    }
    @Test(enabled = false)
    public void setSavedTest(){
        homePage.setSaved();
    }
    @Test
    public void setSearchitemTest(){
        homePage.setSearchitem("iphone9");
    }
    @Test(enabled = false)
    public void setHamburgerTest(){
        homePage.setHamburger();
    }
    @Test(enabled =false)
    public void setCarshoppingTest(){
        homePage.setCarshopping();
    }
    @Test(enabled = false)
    public void setRegisterTest(){
        homePage.setRegister();
    }
    @Test
    public void setSignInTest(){
        homePage.setSignIn();
    }
    @Test(enabled = false)
    public void setBrightDaysTest(){
        homePage.setBrightDays();
    }
     @Test
    public void setTexttestTest(){
        homePage.setTexttest();
    }
}
