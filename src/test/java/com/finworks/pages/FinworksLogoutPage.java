package com.finworks.pages;

import com.finworks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinworksLogoutPage {
    public FinworksLogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "#")
    public WebElement dropDownMenu;


    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logOUtSelection;



}
