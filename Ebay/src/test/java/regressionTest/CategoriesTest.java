package regressionTest;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Categories;

public class CategoriesTest extends MobileAPI {

    Categories categories;

    @BeforeMethod
    public void init(){
        categories = PageFactory.initElements(appiumDriver, Categories.class);
    }
    @Test(priority = 1)
    public void setCategoriesTest(){
        categories.setCategories();
    }
    @Test(priority = 2)
    public void setArtTest(){
        categories.setCategories();
        categories.setArt();
    }
    @Test(priority = 3)
    public void setArtpostersTest(){
        categories.setCategories();
        categories.setArt();
        categories.setArtprints();
    }
    @Test(priority = 4)
    public void setFilterTest(){
        categories.setCategories();
        categories.setArt();
        categories.setArtprints();
        categories.setFilter();
    }
}
