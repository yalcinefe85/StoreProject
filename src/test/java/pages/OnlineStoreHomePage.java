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
    @FindBy(xpath = "//div[@class='header_user_info']")
    public WebElement signInButton;
}
