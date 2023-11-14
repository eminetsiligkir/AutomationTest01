package util;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class driverFactory {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;
    propertiesFactory propertiesFactory = new propertiesFactory();

    public void initDriver(String browser){
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver();
                driver = new EdgeDriver();
            default:
                Assert.isTrue(false,"wrong browser");
                break;
        }
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(propertiesFactory.getUrl());
    }
    public void closeDriver(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}