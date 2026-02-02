package testCases;

import org.testng.annotations.Test;
import pageObjects.BrandsPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class ViewAndCartProducts extends BaseClass {
    //TestCase_19
    @Test
    public void view_brand_products(){
        HomePage hp = new HomePage(driver);
        hp.productLink();
        ProductPage pp = new ProductPage(driver);
        pp.brandsDisplay();
        pp.clickPolo();
        BrandsPage bp = new BrandsPage(driver);
        bp.brandPoloProductsDisplay();
        pp.clickHAndM();
        bp.brandHMProductsDisplay();
    }
}
