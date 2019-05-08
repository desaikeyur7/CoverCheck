package CoverCheckTest;

import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();


    @Given("^I am on homepage$")
    public void i_am_on_homepage() {

    }

    @When("^I enter a valid vehicle registration number$")
    public void i_enter_a_valid_vehicle_registration_number() {
        homePage.userShouldBeAbleToFindCarRegistrationNumber();
    }

    @Then("^I should be able to see if the vehicle exists$")
    public void i_should_be_able_to_see_if_the_vehicle_exists() {

    }

    @Then("^I should be able to see the start date and time of the cover$")
    public void i_should_be_able_to_see_the_start_date_and_time_of_the_cover() {

    }

    @Then("^I should be able to see the date and time the cover will end$")
    public void i_should_be_able_to_see_the_date_and_time_the_cover_will_end() {

    }

}
