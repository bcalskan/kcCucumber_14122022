package stepDefinitions;

import io.cucumber.java.en.*;
import pages.DatatablesPage;
import utilities.Driver;

public class DatatablesStepDefinition {
    DatatablesPage dtPage = new DatatablesPage();

    @Then("user clicks new button")
    public void user_clicks_new_button() {

    }
    @Then("user enters name in {string}")
    public void user_enters_name_in(String string) {
    dtPage.firstNameBox.sendKeys();
    }
    @Then("user enters lastname {string}")
    public void user_enters_lastname(String string) {

    }
    @Then("user enters position {string}")
    public void user_enters_position(String string) {

    }
    @Then("user enters office {string}")
    public void user_enters_office(String string) {

    }
    @Then("user enters extension {string}")
    public void user_enters_extension(String string) {

    }
    @Then("user enters start date {string}")
    public void user_enters_start_date(String string) {

    }
    @Then("user enters salary {string}")
    public void user_enters_salary(String string) {

    }
    @Then("user clicks create button")
    public void user_clicks_create_button() {

    }
    @When("user searches with first name")
    public void user_searches_with_first_name() {

    }
    @Then("user validates his name in name field")
    public void user_validates_his_name_in_name_field() {

    }
}
