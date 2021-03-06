package POM.TestCasesRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\MACC\\OneDrive - ESCUELA COLOMBIANA DE INGENIERIA JULIO GARAVITO\\Documentos\\Proyectos Automatizacion pruebas\\RetoAutomationTest\\src\\test\\resources\\features\\registerPageCompleteRegister.feature",
        glue = {"stepDefinition"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:html:target/results.html, message:target/results.ndjson"},
        monochrome = true)
public class registerFormCompleteRunner {

}
