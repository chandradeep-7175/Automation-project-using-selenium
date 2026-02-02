package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
    public ProductDetailsPage(WebDriver driver){
        super(driver);
    }
    public String searchInput = "blue top";
    @FindBy(xpath = "//div[@class='overlay-content']//p[contains(text(),'Blue Top')]")
    WebElement verifySearchText;
    @FindBy(xpath = "//input[@id='quantity']") WebElement quantity;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']") WebElement addToCart;
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']") WebElement continueShopping;
    @FindBy(css = "a[href='#reviews']") WebElement writeYourReviewText;
    @FindBy(xpath = "//input[@id='name']") WebElement yourName;
    @FindBy(xpath = "//input[@id='email']") WebElement yourEmail;
    @FindBy(xpath = "//textarea[@id='review']") WebElement addReviewHere;
    @FindBy(xpath = "//button[@id='button-review']") WebElement submitBtn;
    @FindBy(xpath = "//span[normalize-space()='Thank you for your review.']") WebElement thankYouMessage;
    public boolean verifySearchInput(){
        return ((verifySearchText.toString().toLowerCase()).equals(searchInput.toLowerCase()));
    }
    public void setQuantity(String quantityValue){
        quantity.clear();
        quantity.sendKeys(quantityValue);
    }
    public void addToCart(){
        addToCart.click();
    }
    public void continueShopping(){
        continueShopping.click();
    }
    public boolean writeYourReviewText(){
        return writeYourReviewText.isDisplayed();
    }
    public void yourName(String name){
        yourName.sendKeys(name);
    }
    public void yourEmail(String email){
        yourEmail.sendKeys(email);
    }
    public void addReviewHere(String rewiewtext){
        addReviewHere.sendKeys(rewiewtext);
    }
    public void submitBtn(){
        submitBtn.click();
    }
    public boolean thankYouMessage(){
        return thankYouMessage.isDisplayed();
    }
}
