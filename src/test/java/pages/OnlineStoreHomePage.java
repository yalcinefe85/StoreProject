package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OnlineStoreHomePage {

    WebDriver driver;
    public OnlineStoreHomePage(){
        this.driver= Driver.driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title='Log in to your customer account']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "passwd")
    public WebElement passBox;
}
