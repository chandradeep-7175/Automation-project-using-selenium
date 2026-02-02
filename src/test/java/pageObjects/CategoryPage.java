package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{
    public CategoryPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']") WebElement womenDressProducts;
    @FindBy(xpath = "//h2[normalize-space()='Men - Tshirts Products']") WebElement menTshirtsProducts;

    public boolean womenDressProductsDisplay(){
        return womenDressProducts.isDisplayed();
    }
    public boolean menTshirtsProductsDisplay(){
        return menTshirtsProducts.isDisplayed();
    }
}
