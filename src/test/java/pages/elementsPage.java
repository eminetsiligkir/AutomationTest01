package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.elementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import static util.driverFactory.driver;

public class elementsPage {
    elementHelper helper;

    public elementsPage(RemoteWebDriver driver){
        this.helper = new elementHelper(driver);
    }

    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submitBtn = By.id("submit");


    public void fillFullname(){
        helper.checkElementPresence(fullName);
        helper.sendKey(fullName,"Cem Talasgir");}
    public void fillEmail(){
        helper.checkElementPresence(email);
        helper.sendKey(email,"cemtalasgir@gmail.com");}
    public void fillCurrentAdr(){
        helper.checkElementPresence(currentAddress);
        helper.sendKey(currentAddress,"babam sagolsun");}
    public void fillPermanentAdr(){
        helper.checkElementPresence(permanentAddress);
        helper.sendKey(permanentAddress,"anam sağolsun");}
    public void clickSubmitBtn(){
        helper.scrollIntoView(submitBtn);
        helper.checkElementPresence(submitBtn);
        helper.click(submitBtn);}
}
