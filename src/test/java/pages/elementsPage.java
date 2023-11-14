package pages;
import util.elementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
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


    public void fillFullname(){ helper.sendKey(fullName,"Cem Talasgir");}

    public void fillEmail(){helper.sendKey(email,"cemtalasgir@gmail.com");}
    public void fillCurrentAdr(){helper.sendKey(currentAddress,"babam sagolsun");}
    public void fillPermanentAdr(){helper.sendKey(permanentAddress,"anam sağolsun");}
    public void clickSubmitBtn(){helper.click(submitBtn);}

}
