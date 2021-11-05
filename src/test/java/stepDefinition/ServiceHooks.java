package stepDefinition;

import POM.Helper.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static POM.Helper.BrowserFactory.driver;


public class ServiceHooks{

    @AfterStep
    public void addScreenshot(Scenario scenario){

        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");

    }

    @Before
    public void beforeScenario(){
        System.out.println("Abrir navegador");
        BrowserFactory.startBrowser("chrome");
    }

    @After
    public void afterScenario(){
        System.out.println("Cerrar navegador");
        BrowserFactory.closeBrowser(driver);
    }

}
