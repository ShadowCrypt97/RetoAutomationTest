package stepDefinition;

import ExcelDataSetHandler.ReadExcelFile;
import ExcelDataSetHandler.WriteExcelFile;
import POM.Helper.BrowserFactory;
import POM.Pages.homePageRegister;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import static POM.Helper.BrowserFactory.driver;

public class stepDefinition_homePageRegister {
    WriteExcelFile writeFile = new WriteExcelFile();
    ReadExcelFile readFile = new ReadExcelFile();
    String filepath = "TestFiles/usersDataset.xlsx";
    String randomMail;
    Integer getLastRow = readFile.lastRow(filepath, "Hoja1");
    homePageRegister loginPageNew;

    public stepDefinition_homePageRegister() throws IOException {
    }

    @Given("^abro la pagina de la tienda en el navegador$")
    public void abro_la_pagina_de_la_tienda_en_el_navegador() throws Throwable {
        BrowserFactory.abrirUrl(driver, "http://automationpractice.com/index.php");
        loginPageNew = PageFactory.initElements(driver, homePageRegister.class);
    }

    @When("^el boton de signIn se cargue le hago clic$")
    public void el_boton_de_signIn_se_cargue_le_hago_clic() throws Throwable {
        loginPageNew.loginPageRegisterButton();
    }

    @Then("^valido que me redirige a la pagina de autenticacion$")
    public void valido_que_me_redirige_a_la_pagina_de_autenticacion() throws Throwable {
        loginPageNew.createAnAccountTextIsDisplayed();
    }

    @Then("^Valido que el campo de ingresar email se muestra$")
    public void valido_que_el_campo_de_ingresar_email_se_muestra() throws Throwable {
        loginPageNew.emailFieldIsDisplayed();
    }

}
