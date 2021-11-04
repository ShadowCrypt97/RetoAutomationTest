package stepDefinition;

import ExcelDataSetHandler.ReadExcelFile;
import POM.Pages.LoginPageNew;
import POM.Pages.RegisterPageForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import static POM.Helper.BrowserFactory.driver;

public class stepDefinition_registerPageFormWithoutRequiredFields {
    ReadExcelFile readExcelFile = new ReadExcelFile();
    ReadExcelFile readFile = new ReadExcelFile();
    String filepath = "TestFiles/usersDataset.xlsx";
    LoginPageNew loginPageNew = PageFactory.initElements(driver,LoginPageNew.class);
    Integer getLastRow = readFile.lastRow(filepath, "Hoja1");
    RegisterPageForm registerPageForm = PageFactory.initElements(driver,RegisterPageForm.class);

    public stepDefinition_registerPageFormWithoutRequiredFields() throws IOException {
    }


    @Given("^me encuentro en el formulario de registro$")
    public void me_encuentro_en_el_formulario_de_registro() throws Throwable {
        registerPageForm.personalInformationFormIsDisplayed();
    }

    @When("^Valido que el boton de registro se muestre correctamente$")
    public void valido_que_el_boton_de_registro_se_muestre_correctamente() throws Throwable {
        registerPageForm.registerButtonIsDisplayed();
    }

    @Then("^Hago clic en el boton radial Mr/Mrs$")
    public void hago_clic_en_el_boton_radial_Mr_Mrs() throws Throwable {
        String name = Arrays.stream(loginPageNew.getDataset()).collect(Collectors.toList()).get(2);
        if(readExcelFile.readExcel(filepath,"Hoja2",name).equals(1)) {
            registerPageForm.genderMaleButton();
        }
        else if (readExcelFile.readExcel(filepath,"Hoja2",name).equals(2))
            registerPageForm.genderFemaleButton();
        else
            registerPageForm.genderMaleButton();
    }

    @Then("^Hago clic en el boton de registro$")
    public void hago_clic_en_el_boton_de_registro() throws Throwable {
        registerPageForm.registerButtonClick();
    }

    @Then("^Valido que en el mensaje de error se nombren todos los campos obligatorios$")
    public void valido_que_en_el_mensaje_de_error_se_nombren_todos_los_campos_obligatorios() throws Throwable {
        registerPageForm.phoneIsRequired_IsDisplayed();
        registerPageForm.countryIsRequired_IsDisplayed();
        registerPageForm.cityIsRequired_IsDisplayed();
        registerPageForm.addressIsRequired_IsDisplayed();
        registerPageForm.passwdIsRequired_IsDisplayed();
        registerPageForm.firstnameIsRequired_IsDisplayed();
        registerPageForm.lastnameIsRequired_IsDisplayed();
        registerPageForm.postalCodeIsRequired_IsDisplayed();
    }

}
