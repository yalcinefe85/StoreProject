package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OnlineStoreHomePage;
import utilities.Configuration;
import utilities.Driver;

public class CreatingAccountSteps {
    OnlineStoreHomePage onlineStoreHomePage = new OnlineStoreHomePage();

    @Given("^User goes to the web page$")
    public void user_goes_to_the_web_page() throws Throwable {
        Driver.driverSetup(Configuration.getProperties("OnlineStoreUrl"));

    }

    @When("^User clicks on sign in button$")
    public void user_clicks_on_sign_in_button() throws Throwable {
        Thread.sleep(1000);
        onlineStoreHomePage.signInButton.click();

    }

    @When("^User provides an email to create an account$")
    public void user_provides_an_email_to_create_an_account() throws Throwable {

    }

    @When("^User provides necessary information$")
    public void user_provides_necessary_information() throws Throwable {

    }

    @Then("^User verifies that the account created$")
    public void user_verifies_that_the_account_created() throws Throwable {

    }


}
