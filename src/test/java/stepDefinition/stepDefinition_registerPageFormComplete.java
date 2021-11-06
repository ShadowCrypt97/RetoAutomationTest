package stepDefinition;

import ExcelDataSetHandler.ReadExcelFile;
import ExcelDataSetHandler.WriteExcelFile;
import POM.Helper.BrowserFactory;
import POM.Pages.homePageRegister;
import POM.Pages.RegisterPageComplete;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import static POM.Helper.BrowserFactory.driver;
import static POM.Helper.BrowserFactory.softAssertions;

public class stepDefinition_registerPageFormComplete {
    WriteExcelFile writeFile = new WriteExcelFile();
    byte[] screenshot;
    String randomMail;
    BrowserFactory browserFactory = new BrowserFactory();
    RegisterPageComplete registerPageComplete = PageFactory.initElements(driver,RegisterPageComplete.class);
    ReadExcelFile readExcelFile = new ReadExcelFile();
    ReadExcelFile readFile = new ReadExcelFile();
    String filepath = "TestFiles/usersDataset.xlsx";
    homePageRegister loginPageNew = PageFactory.initElements(driver, homePageRegister.class);
    Integer getLastRow = readFile.lastRow(filepath, "Hoja1");

    public stepDefinition_registerPageFormComplete() throws IOException {
    }

    @Given("^me encuentro en la pagina create account$")
    public void me_encuentro_en_la_pagina_create_account() throws Throwable {
        BrowserFactory.abrirUrl(driver,"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        registerPageComplete.createAccountIsDisplayed();
    }

    @When("^Ingreso un email nuevo$")
    public void ingreso_un_email_nuevo() throws Throwable {
        writeFile.writeExcel(filepath,"Hoja1",registerPageComplete.getDataset());
        int lastRow = readExcelFile.lastRow(filepath,"Hoja1");
        randomMail = readExcelFile.getCellValue(filepath,"Hoja1",lastRow,0);
        registerPageComplete.typeEmail(randomMail);
    }

    @When("^Hago clic en el boton crateAccount$")
    public void hago_clic_en_el_boton_crateAccount() throws Throwable {
        loginPageNew.createAnAccount();
    }


    @When("^Valido que el boton de registro se muestre correctamente$")
    public void valido_que_el_boton_de_registro_se_muestre_correctamente() throws Throwable {
        registerPageComplete.registerButtonIsDisplayed();
    }

    @Then("^Hago clic en el boton radial Mr/Mrs$")
    public void hago_clic_en_el_boton_radial_Mr_Mrs() throws Throwable {
        String name = Arrays.stream(registerPageComplete.getDataset()).collect(Collectors.toList()).get(2);
        if(readExcelFile.readExcel(filepath,"Hoja2",name).equals(1)) {
            registerPageComplete.genderMaleButton();
        }
        else if (readExcelFile.readExcel(filepath,"Hoja2",name).equals(2))
            registerPageComplete.genderFemaleButton();
        else
            registerPageComplete.genderMaleButton();
    }

    @Then("^Hago clic en el boton de registro$")
    public void hago_clic_en_el_boton_de_registro() throws Throwable {
        registerPageComplete.registerButtonClick();
    }

    @When("^me arroje los campos obligatorios en el mensaje de error$")
    public void me_arroje_los_campos_obligatorios_en_el_mensaje_de_error() throws Throwable {
        registerPageComplete.phoneIsRequired_IsDisplayed();
        registerPageComplete.countryIsRequired_IsDisplayed();
        registerPageComplete.cityIsRequired_IsDisplayed();
        registerPageComplete.addressIsRequired_IsDisplayed();
        registerPageComplete.passwdIsRequired_IsDisplayed();
        registerPageComplete.firstnameIsRequired_IsDisplayed();
        registerPageComplete.lastnameIsRequired_IsDisplayed();
        registerPageComplete.postalCodeIsRequired_IsDisplayed();
    }

    @Then("^Valido que los campos requeridos se muestren$")
    public void valido_que_los_campos_requeridos_se_muestren() throws Throwable {
        registerPageComplete.phoneMobileIsDisplayed();
        registerPageComplete.passwdIsDisplayed();
        registerPageComplete.firstNameIsDisplayed();
        registerPageComplete.lastNameIsDisplayed();
        registerPageComplete.cityIsDisplayed();
        registerPageComplete.addressIsDisplayed();
        registerPageComplete.zipCodeIsDisplayed();
        registerPageComplete.stateToBeClickeable();
    }

    @Then("^Comparo el numero de campos marcados como obligatorios con el que nos muestra en el mensaje de error$")
    public void comparo_el_numero_de_campos_marcados_como_obligatorios_con_el_que_nos_muestra_en_el_mensaje_de_error() throws Throwable {
        registerPageComplete.numberOfRequiredFieldsAreDisplayedOnErrorMessage();
        softAssertions.assertThat(registerPageComplete.numberOfRequiredFields()).as("Step: And Comparo el numero de campos marcados como obligatorios con el que nos muestra en el mensaje de error").isEqualTo(registerPageComplete.asteriskAreDisplayed());
        if(softAssertions.errorsCollected().size()!=0)
            screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @Then("^Completo los campos obligatorios$")
    public void completo_los_campos_obligatorios() throws Throwable {
        registerPageComplete.phoneMobileSendKeys();
        registerPageComplete.addressSendKeys();
        registerPageComplete.citySendKeys();
        registerPageComplete.passwdSendKeys();
        registerPageComplete.firstNameSendKeys();
        registerPageComplete.lastNameSendKeys();
        registerPageComplete.zipCodeSendKeys();
        registerPageComplete.stateSelect();
    }

    @Then("^Hago clic nuevamente en el boton de registro$")
    public void hago_clic_nuevamente_en_el_boton_de_registro() throws Throwable {
        registerPageComplete.registerButtonClick();
    }

    @Then("^Valido que el nombre registrado aparezca en el boton arriba superior derecha$")
    public void valido_que_el_nombre_registrado_aparezca_en_el_boton_arriba_superior_derecha() throws Throwable {
        registerPageComplete.viewMyCustomerAccount();
    }

}
