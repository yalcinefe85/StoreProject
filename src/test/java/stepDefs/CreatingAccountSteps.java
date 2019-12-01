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
        Thread.sleep(8000);
        onlineStoreHomePage.signInButton.click();
        Thread.sleep(1000);
        System.out.println("some changes");
        System.out.println("trying to work with git commends");

    }

    @When("^User clicks on sign in button$")
    public void user_clicks_on_sign_in_button() throws Throwable {


//        onlineStoreHomePage.signInButton.click();
//        Thread.sleep(1000);
//
//        onlineStoreHomePage.emailBox.sendKeys("asd123@email.com");
//        onlineStoreHomePage.passBox.sendKeys("12345");

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
