package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static util.driverFactory.driver;

public class elementHelper {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    propertiesFactory propertiesFactory = new propertiesFactory();

    public elementHelper(RemoteWebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(propertiesFactory.getWait()));
    }

    public WebElement scrollElement(By by){
        checkElementPresence(by);
        WebElement element = driver.findElement(by);
        return element;
    }
    public void click(By by){
        scrollElement(by).click();
    }
    public void sendKey(By by, String text){
        scrollElement(by).sendKeys(text);
    }
    public String getText(By by){
        String text = scrollElement(by).getText();
        return text;
    }
    public void checkElementPresence(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public boolean checkText(By by, String expectedText){
        checkElementPresence(by);
        WebElement element = driver.findElement(by);
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }
    public void scrollIntoView(By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
