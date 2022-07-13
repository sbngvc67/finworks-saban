package com.finworks.step_definitions;

import com.finworks.pages.FinworksContactsPage;
import com.finworks.utilities.BrowserUtils;
import com.finworks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FinworksContactsStepDefs {

    FinworksContactsPage finworksContactsPage=new FinworksContactsPage();

    @When("user navigates to Contacts module")
    public void user_navigates_to_contacts_module() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        finworksContactsPage.contactsModule.click();

    }

    @And("user enters clicks on Create button")
    public void userEntersClicksOnCreateButton() {
        finworksContactsPage.createButton.click();
    }

    @When("user enters name {string}")
    public void user_enters_name(String string) {
        finworksContactsPage.nameBox.sendKeys(string);

    }
    @When("user enters street name {string}")
    public void user_enters_street_name(String string) {
        finworksContactsPage.streetBox.sendKeys(string);
    }
    @When("user enters additional street name {string}")
    public void user_enters_additional_street_name(String string) {
        finworksContactsPage.street2Box.sendKeys(string);
    }
    @When("user enters city name {string}")
    public void user_enters_city_name(String string) {
        finworksContactsPage.cityBox.sendKeys(string);
    }

    @When("user selects state")
    public void userSelectsState() {
        String selection=finworksContactsPage.stateDropdown.getText().toString();
        System.out.println("selection = " + selection);

        Select selectState=new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"o_field_input_337\"]")));

//        selectState.getFirstSelectedOption();
//        BrowserUtils.sleep(4);
//        selectState.selectByIndex(1);
//        for (WebElement eachState : selectState.getOptions()) {
//           if (eachState.getText().equalsIgnoreCase(selection)){
//                finworksContactsPage.stateDropdown.click();
//                break;
//            }
//       }
    }
    @When("user enters zip {string}")
    public void user_enters_zip(String string) {
        finworksContactsPage.zipBox.sendKeys(string);
    }
    @When("user selects country")
    public void userSelectsCountry() {

    }
    @When("user enters TIN number {string}")
    public void user_enters_tin_number(String string) {
        finworksContactsPage.TINBox.sendKeys(string);
    }
    @When("user enters job position {string}")
    public void user_enters_job_position(String string) {
        finworksContactsPage.jobPositionBox.sendKeys(string);
    }
    @When("user enters phone number {string}")
    public void user_enters_phone_number(String string) {
        finworksContactsPage.phoneBox.sendKeys(string);
    }
    @When("user enters mobile number {string}")
    public void user_enters_mobile_number(String string) {
        finworksContactsPage.mobileBox.sendKeys(string);
    }
    @When("user enters e-mail {string}")
    public void user_enters_e_mail(String string) {
        finworksContactsPage.emailBox.sendKeys(string);
    }
    @When("user enters website {string}")
    public void user_enters_website(String string) {
        finworksContactsPage.websiteBox.sendKeys(string);
    }
    @When("user selects title {string}")
    public void user_selects_title(String string) {
        
    }
    @When("user selects language {string}")
    public void user_selects_language(String string) {
        
    }
    @When("user clicks the edit image button and upload an image")
    public void user_clicks_the_edit_image_button_and_upload_an_image() {

        String imagePath="C:\\Users\\admin\\Desktop\\TO_BE_UPLOADED.gif";
        //finworksContactsPage.imageUploadButton.sendKeys(imagePath);
        //finworksContactsPage.imageUploadButton1.click();
        //finworksContactsPage.imageUploadButton1.sendKeys(imagePath);

    }
    @When("user clicks save button")
    public void user_clicks_save_button() {
        finworksContactsPage.saveButton.click();
    }
    @Then("user should see the username {string} at the title")
    public void user_should_see_the_username_at_the_title(String string) {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="New - Odoo";
        Assert.assertEquals(expectedTitle,actualTitle);
        BrowserUtils.sleep(3);
    }



}
