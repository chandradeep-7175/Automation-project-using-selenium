package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public String homePagetitle = "Automation Exercise";
    @FindBy(xpath = "//a[normalize-space()='Home']") WebElement clickHome;
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']") WebElement lnkSignupLogin;
    @FindBy(xpath = "//a[normalize-space()='Contact us']") WebElement contactLink;
    @FindBy(xpath = "//a[contains(text(),'Test Cases')]") WebElement testCasesLink;
    @FindBy(xpath = "//a[@href='/products']") WebElement productLink;
    @FindBy(xpath = "//a[normalize-space()='Cart']") WebElement cartBtn;
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]") WebElement viewfirstProduct;
    @FindBy(xpath = "//h2[normalize-space()='Category']") WebElement category;
    @FindBy(xpath = "//a[normalize-space()='Women']") WebElement womenCategory;
    @FindBy(xpath = "//a[normalize-space()='Men']") WebElement menCategory;
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]") WebElement dress;
    @FindBy(xpath = "//a[normalize-space()='Tshirts']") WebElement tshirts;
    @FindBy(xpath = "//h2[normalize-space()='Brands']") WebElement brands;
    @FindBy(xpath = "//h2[normalize-space()='recommended items']") WebElement recommendedText;
    @FindBy(xpath = "//div[@class='carousel-inner']//a[@data-product-id='1']") WebElement recommendedProduct;

    public void clickSignupLogin(){
        lnkSignupLogin.click();
    }
    public void clickHome(){
        clickHome.click();
    }
    public void contactLink(){
        contactLink.click();
    }
    public void testCasesLink(){
        testCasesLink.click();
    }
    public void productLink(){
        productLink.click();
    }
    public void clickCartBtn(){
        cartBtn.click();
    }
    public void viewfirstProduct(){viewfirstProduct.click();}
    public boolean categoryDisplay(){return category.isDisplayed();}
    public void clickWomenCategory(){womenCategory.click();}
    public void clickDress(){dress.click();}
    public void clickMenCategory(){menCategory.click();}
    public void clickTshirts(){tshirts.click();}
    public boolean brandsDisplay(){return brands.isDisplayed();}
    public boolean recommendedText(){
        return recommendedText.isDisplayed();
    }
    public void recommendedProductAddToCart(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",recommendedProduct);
    }
}
