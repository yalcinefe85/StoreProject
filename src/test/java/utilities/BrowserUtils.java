package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class BrowserUtils {

    public static String getProperties(String key) throws IOException {
 //specify the needed file
        File credsFile = new File("src/test/resources/credentials.properties");
 //read from a file
        FileReader fileReader = new FileReader(credsFile);
        Properties properties = new Properties();
        properties.load(fileReader);
        String value = properties.getProperty(key);
        return value;
    }

    public static void hover(WebElement element, WebDriver driver){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
  // drag and drop
   /*
   This method will take the text of the webElement and return the String
   You need pass the element
    */
    public static String getText(WebElement element){
        return element.getText();
    }
    /*
    This method will take the list of WebElelement
    It will return list of text from the webelements
     */
    public static List<String> getElementsText(List<WebElement> elements){
        List<String > textList=new ArrayList<>();
        for(WebElement el: elements){
            if(!el.getText().isEmpty()){
                textList.add(el.getText());
            }
        }
        return textList;
    }
    public static void visibilityOfElement(WebDriver driver, WebElement element, int time){
        WebDriverWait wait=new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
  // clickable, isAlertPresent ---> HW
    public static void switchWindow(String targetTitle, WebDriver driver){
        String origin=driver.getWindowHandle();
        Set<String> allWindows=driver.getWindowHandles();
        for(String windows:allWindows){
            driver.switchTo().window(windows);
            if(driver.getTitle().equals(targetTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);
    }
}
