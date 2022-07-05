package com.finworks.pages;

import com.finworks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinworksLoginPage {
    public FinworksLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(id = "login")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    public WebElement userName(String username){

        WebElement userVerification=Driver.getDriver().findElement(By.xpath("//*[.='"+username+"']"));

        return userVerification;
    }

    @FindBy(name = "login")
    public WebElement fillOutThisFieldMessageEmailBox;

    @FindBy(name = "password")
    public WebElement fillOutThisFieldMessagePasswordBox;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;











}
