package stepDefinitions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.elementsPage;
import util.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class elements {
    elementsPage elementsPages = new elementsPage((RemoteWebDriver)driverFactory.getDriver());

    @Given("user is on textbox page")
    public void userIsOnTextboxPage() {

    }
    @When("user fill the fullname on textbox page")
    public void userFillTheFullnameOnTextboxPage() {
        elementsPages.fillFullname();
    }

    @When("user fill the email on textbox page")
    public void userFillTheEmailOnTextboxPage() {
        elementsPages.fillEmail();
    }

    @When("user fill the current address on textbox page")
    public void userFillTheCurrentAddressOnTextboxPage() {
        elementsPages.fillCurrentAdr();
    }

    @When("user fill the permanent address on textbox page")
    public void userFillThePermanentAddressOnTextboxPage() {
        elementsPages.fillPermanentAdr();
    }

    @When("user clicks to submit button on textbox page")
    public void userClicksToSubmitButtonOnTextboxPage() {
        elementsPages.clickSubmitBtn();
    }
    /*-------------------------------------------------------------------------------*/
    @Given("user is on checkbox page")
    public void userIsOnCheckboxPage() {
    }

    @When("select the home folder on checkbox page")
    public void selectTheHomeFolderOnCheckboxPage() {
    }

    @When("open the tree of home on checkbox page")
    public void openTheTreeOfHomeOnCheckboxPage() {
    }

    @When("unselect the office box on checkbox page")
    public void unselectTheOfficeBoxOnCheckboxPage() {
    }

}
