package com.finworks.step_definitions;

import com.finworks.pages.FinworksContactsPage;
import com.finworks.pages.FinworksLoginPage;
import com.finworks.pages.FinworksLogoutPage;
import com.finworks.utilities.BrowserUtils;
import com.finworks.utilities.ConfigurationReader;
import com.finworks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FinworksLogoutStepDefs {

    FinworksLoginPage finworksLoginPage=new FinworksLoginPage();
    FinworksLogoutPage finworksLogoutPage=new FinworksLogoutPage();
    String username;
    String password;
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);


    @Given("user is logged in the page")
    public void user_is_logged_in_the_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("finworks.url"));
        finworksLoginPage.emailBox.sendKeys("salesmanager15@info.com");
        finworksLoginPage.passwordBox.sendKeys("salesmanager");
        finworksLoginPage.loginButton.click();
    }
    @When("user enters email {string} and {string} and click the login button")
    public void userEntersEmailAndAndClickTheLoginButton(String email, String password) {
            //finworksLoginPage.emailBox.sendKeys(email);
            //finworksLoginPage.passwordBox.sendKeys(password);
            //finworksLoginPage.loginButton.click();
    }

    @When("User clicks on {string}")
    public void user_clicks_on(String username) {

        finworksLoginPage.userName(username).click();
        //wait.until(ExpectedConditions.elementToBeSelected(username));
        //menu.click();
    }

    @And("User clicks on log out selection")
    public void userClicksOnLogOutSelection() {
        finworksLogoutPage.logOUtSelection.click();
    }

    @Then("User end the session and sees the title as {string}")
    public void userEndTheSessionAndSeesTheTitleAsLoginBestSolutionForStartups(String title) {
        String expectedTitle= title;
        String actualTitle= Driver.getDriver().getTitle();

    }


}
