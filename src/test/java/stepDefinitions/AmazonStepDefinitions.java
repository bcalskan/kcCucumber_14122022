package stepDefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("user search for Nutella")
    public void user_search_for_nutella() {
        amazonPage.searchBox.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("user tests whether results contain Nutella")
    public void user_tests_whether_results_contain_nutella() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("Nutella"));
    }
    @Then("close the Website")
    public void close_the_website() {
        Driver.closeDriver();
    }


    @Then("user search for Java")
    public void user_search_for_java() {
        amazonPage.searchBox.sendKeys("Java"+ Keys.ENTER);

    }

    @Then("user tests whether results contain Java")
    public void user_tests_whether_results_contain_java() {
        Assert.assertTrue(amazonPage.searchResult.getText().contains("Java"));

    }
}
