package com.finworks.pages;

import com.finworks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class FinworksContactsPage {

    public FinworksContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[4]/a/span")
    public WebElement contactsModule;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/span[1]")
    public WebElement imageUploadButton;


    @FindBy(css = ".fa-pencil")
    public WebElement imageUploadButton1;

    @FindBy(name = "name")
    public WebElement nameBox;
    @FindBy(name = "street")
    public WebElement streetBox;
    @FindBy(name = "street2")
    public WebElement street2Box;
    @FindBy(name = "city")
    public WebElement cityBox;
    @FindBy(name = "zip")
    public WebElement zipBox;
    @FindBy(name = "vat")
    public WebElement TINBox;
    @FindBy(name = "function")
    public WebElement jobPositionBox;
    @FindBy(name = "phone")
    public WebElement phoneBox;
    @FindBy(name = "mobile")
    public WebElement mobileBox;
    @FindBy(name = "email")
    public WebElement emailBox;
    @FindBy(name = "website")
    public WebElement websiteBox;

    @FindBy(id = "o_field_input_339")
    public WebElement stateDropdown;

    @FindBy(id = "o_field_input_341")
    public WebElement countryDropdown;
    @FindBy(id = "o_field_input_350")
    public WebElement titleDropdown;
    @FindBy(id = "o_field_input_351")
    public WebElement languageDropdown;

    //C:\Users\admin\Desktop\TO_BE_UPLOADED.gif
    //String imagePath="C:\\Users\\admin\\Desktop\\TO_BE_UPLOADED.gif";
    //FinworksContactsPage finworksContactsPage=new FinworksContactsPage();
    //  finworksContactsPage.imageUploadButton.sendKeys(imagePath);



}
