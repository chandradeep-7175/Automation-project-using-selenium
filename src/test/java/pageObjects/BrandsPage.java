package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandsPage extends BasePage{
    public BrandsPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//h2[normalize-space()='Brand - Polo Products']") WebElement brandPoloProducts;
    @FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']") WebElement brandHMProducts;
    public boolean brandPoloProductsDisplay(){return brandPoloProducts.isDisplayed();}
    public boolean brandHMProductsDisplay(){return brandHMProducts.isDisplayed();}
}
