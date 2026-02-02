package testCases;


import org.testng.annotations.Test;
import pageObjects.CategoryPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ViewCategoryProducts extends BaseClass {
    //TestCase_18
    @Test
    public void view_category_products(){
        HomePage hp = new HomePage(driver);
        hp.categoryDisplay();
        hp.clickWomenCategory();
        hp.clickDress();
        CategoryPage cp = new CategoryPage(driver);
        cp.womenDressProductsDisplay();
        hp.clickMenCategory();
        hp.clickTshirts();
        cp.menTshirtsProductsDisplay();
    }
}
