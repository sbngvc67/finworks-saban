package com.finworks.step_definitions;

import com.finworks.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }



        Driver.closeDriver();
        //System.out.println("====Closing driver using cucumber @After");
        //System.out.println("====Scenario ended/Take screenshot if failed");
    }
    /*
    @Before
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }



    @BeforeStep
    public void setupStep(){
        System.out.println("---------> applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("---------> applying tearDown using @AfterStep");
    }

     */



}
