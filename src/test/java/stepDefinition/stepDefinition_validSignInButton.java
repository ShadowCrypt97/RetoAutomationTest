package stepDefinition;

import ExcelDataSetHandler.ReadExcelFile;
import ExcelDataSetHandler.WriteExcelFile;
import POM.Helper.BrowserFactory;
import POM.Pages.LoginPageNew;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import static POM.Helper.BrowserFactory.driver;

public class stepDefinition_validSignInButton {
    WriteExcelFile writeFile = new WriteExcelFile();
    ReadExcelFile readFile = new ReadExcelFile();
    String filepath = "TestFiles/usersDataset.xlsx";
    String randomMail;
    Integer getLastRow = readFile.lastRow(filepath, "Hoja1");
    LoginPageNew loginPageNew;

    public stepDefinition_validSignInButton() throws IOException {
    }



    @Given("^abro la pagina de la tienda en el navegador$")
    public void abro_la_pagina_de_la_tienda_en_el_navegador() throws Throwable {
        driver = BrowserFactory.startBrowser("chrome", "http://automationpractice.com/index.php");
        loginPageNew = PageFactory.initElements(driver, LoginPageNew.class);
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

    @Then("^Ingreso un email nuevo$")
    public void ingreso_un_email_nuevo() throws Throwable {
        writeFile.writeExcel(filepath,"Hoja1",loginPageNew.getDataset());
        randomMail = Arrays.stream(loginPageNew.getDataset()).collect(Collectors.toList()).get(0);
        loginPageNew.typeEmail(randomMail);
    }

    @Then("^Hago clic en el boton crateAccount$")
    public void hago_clic_en_el_boton_crateAccount() throws Throwable {
        loginPageNew.createAnAccount();
    }

    @Then("^Valido que me redirige al formulario de informacion personal$")
    public void valido_que_me_redirige_al_formulario_de_informacion_personal() throws Throwable {
        loginPageNew.personalInformationFormIsDisplayed();
    }

}
