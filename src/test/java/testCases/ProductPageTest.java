package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import pageObjects.ProductDetailsPage;
import pageObjects.ProductPage;
import testBase.BaseClass;

public class ProductPageTest extends BaseClass {
    //TestCase_8
    @Test
    public void verify_product_page_and_detalis(){
        HomePage hp = new HomePage(driver);
        hp.productLink();
        ProductPage pd = new ProductPage(driver);
        Assert.assertEquals(driver.getTitle(),pd.actualTitle);
        pd.allProductText();
        pd.firstProduct();
        driver.findElement(By.xpath("//h2[normalize-space()='Blue Top']")).isDisplayed();
        driver.findElement(By.xpath("//p[normalize-space()='Category: Women > Tops']")).isDisplayed();
        driver.findElement(By.xpath("//span[normalize-space()='Rs. 500']")).isDisplayed();
        driver.findElement(By.xpath("//b[normalize-space()='Availability:']")).isDisplayed();
        driver.findElement(By.xpath("//b[normalize-space()='Condition:']")).isDisplayed();
        driver.findElement(By.xpath("//b[normalize-space()='Brand:']"));
    }
    //TestCase_9
    @Test
    public void search_product_product(){
        HomePage hp = new HomePage(driver);
        hp.productLink();
        ProductPage pd = new ProductPage(driver);
        Assert.assertEquals(driver.getTitle(),pd.actualTitle);
        pd.allProductText();
        ProductDetailsPage pdp = new ProductDetailsPage(driver);
        pd.searchBox(pdp.searchInput);
        pd.searchBtn();
        pdp.verifySearchInput();
    }
}
