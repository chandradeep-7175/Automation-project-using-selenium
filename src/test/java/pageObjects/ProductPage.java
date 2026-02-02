package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver){
        super(driver);
    }
    public String actualTitle = "Automation Exercise - All Products";
    @FindBy(xpath = "//h2[normalize-space()='All Products']") WebElement allProductText;
    @FindBy(xpath = "//a[@href='/product_details/1']") WebElement firstProduct;

    public boolean allProductText(){
        return allProductText.isDisplayed();
    }
    public void firstProduct(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",firstProduct);
    }
    //Search Box Elements

    @FindBy(xpath = "//input[@id='search_product']") WebElement searchBox;
    @FindBy(xpath = "//button[@id='submit_search']") WebElement searchBtn;
    @FindBy(xpath = "(//div[@class='product-overlay'])[1]") WebElement product1;
    @FindBy(xpath = "(//div[@class='product-overlay'])[2]") WebElement product2;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]") WebElement addCart;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]") WebElement addToCartSecondProduct;
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']") WebElement continueShopping;
    @FindBy(xpath = "//h2[normalize-space()='Brands']") WebElement brands;
    @FindBy(xpath = "//a[@href='/brand_products/Polo']") WebElement polo;
    @FindBy(xpath = "//a[@href='/brand_products/H&M']") WebElement hAndM;
    @FindBy(css = "a[href='/product_details/1']") WebElement viewProduct;
     Actions act = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public void hoverProduct1(){
        js.executeScript("window.scrollBy(0,700);");
        act.moveToElement(product1);
    }
    public void hoverProduct2(){
        act.moveToElement(product2);
    }
    public void addCart(){
        js.executeScript("arguments[0].click()",addCart);
    }
    public void addToCartSecondProduct() {
//        wait.until(ExpectedConditions.elementToBeClickable(addToCartSecondProduct));
        js.executeScript("arguments[0].click()",addToCartSecondProduct);
    }
    public void continueShopping(){
        continueShopping.click();
    }
    public void searchBox(String input){
        searchBox.sendKeys(input);
    }
    public void searchBtn(){
        searchBtn.click();
    }
    public boolean brandsDisplay(){return brands.isDisplayed();}
    public void clickPolo(){
        polo.click();
    }
    public void clickHAndM(){
        hAndM.click();
    }
    public void viewProduct(){
        js.executeScript("arguments[0].click();",viewProduct);
    }
}
