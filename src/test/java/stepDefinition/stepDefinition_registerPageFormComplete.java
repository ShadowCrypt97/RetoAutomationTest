package stepDefinition;

import POM.Helper.BrowserFactory;
import POM.Pages.RegisterPageComplete;
import POM.Pages.RegisterPageForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static POM.Helper.BrowserFactory.driver;

public class stepDefinition_registerPageFormComplete {
    BrowserFactory browserFactory = new BrowserFactory();
    RegisterPageForm registerPageForm = PageFactory.initElements(driver,RegisterPageForm.class);
    RegisterPageComplete registerPageComplete = PageFactory.initElements(driver,RegisterPageComplete.class);

    public stepDefinition_registerPageFormComplete() throws IOException {
    }

    @Given("^me arrojo los campos obligatorios en el mensaje de error$")
    public void me_arrojo_los_campos_obligatorios_en_el_mensaje_de_error() throws Throwable {
        registerPageForm.phoneIsRequired_IsDisplayed();
        registerPageForm.countryIsRequired_IsDisplayed();
        registerPageForm.cityIsRequired_IsDisplayed();
        registerPageForm.addressIsRequired_IsDisplayed();
        registerPageForm.passwdIsRequired_IsDisplayed();
        registerPageForm.firstnameIsRequired_IsDisplayed();
        registerPageForm.lastnameIsRequired_IsDisplayed();
        registerPageForm.postalCodeIsRequired_IsDisplayed();
    }

    @When("^Valido que los campos requeridos se muestren$")
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
        Assert.assertEquals(registerPageComplete.numberOfRequiredFields(),registerPageComplete.asteriskAreDisplayed());
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

    @Then("^Realizo clic en el boton de registro$")
    public void hago_clic_en_el_boton_de_registro() throws Throwable {
        registerPageComplete.registerButtonIsClickeable();
    }

    @Then("^Valido que el nombre registrado aparezca en el boton arriba superior derecha$")
    public void valido_que_el_nombre_registrado_aparezca_en_el_boton_arriba_superior_derecha() throws Throwable {
        registerPageComplete.viewMyCustomerAccount();
    }

}
