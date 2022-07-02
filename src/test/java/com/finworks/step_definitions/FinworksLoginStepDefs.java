package com.finworks.step_definitions;

import com.finworks.pages.FinworksLoginPage;
import com.finworks.utilities.ConfigurationReader;
import com.finworks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class FinworksLoginStepDefs {
    FinworksLoginPage finworksLoginPage=new FinworksLoginPage();

   @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("finworks.url"));
    }
    @When("user enters email {string}")
    public void user_enters(String email) {
        finworksLoginPage.emailBox.sendKeys(email);
    }
    @And("user enters password {string}")
    public void userEntersPassword(String password) {
       finworksLoginPage.passwordBox.sendKeys(password);
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        finworksLoginPage.loginButton.click();
    }

    @Then("user should see the username at top right-hand corner of the page as {string}")
    public void userShouldSeeTheUsernameAtTopRightHandCornerOfThePageAs(String username) {
        String expectedUsername=username;
        String actualUsername= finworksLoginPage.userName(username).getText();
        Assert.assertEquals(actualUsername,expectedUsername);
    }
}
