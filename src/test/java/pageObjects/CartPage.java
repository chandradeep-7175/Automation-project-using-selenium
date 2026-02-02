package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//i[@class='fa fa-times']") WebElement removeItem;
    public void removeItem(){
        removeItem.click();
    }
    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]") WebElement cartBtn;
    @FindBy(xpath = "(//tbody)[1]") WebElement products;
    @FindBy(xpath = "//p[@class='cart_total_price'][normalize-space()='Rs. 500']") WebElement product1Price;
    @FindBy(xpath = "(//button[normalize-space()='4'])[1]") WebElement productQuantity;
    @FindBy(xpath = "(//a[normalize-space()='Proceed To Checkout'])[1]") WebElement checkoutBtn;
    @FindBy(xpath = "(//u[normalize-space()='Register / Login'])[1]") WebElement registerOrLogin;
    public String q = productQuantity.getText().toString();
    public void cartBtn(){
        cartBtn.click();
    }
    public boolean products(){
        return products.isDisplayed();
    }
    public boolean productPrice(){
        return product1Price.isDisplayed();
    }
    public void proceedToCheckoutBtn(){checkoutBtn.click();}
    public void registerOrLogin(){registerOrLogin.click();}
}
