package POM.Pages;

import POM.Helper.BrowserFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPageForm extends BrowserFactory {

    WebDriver driver;

    public RegisterPageForm(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(how = How.ID, using="uniform-id_gender1")
    @CacheLookup
    WebElement titleMr;

    @FindBy(how = How.ID, using="uniform-id_gender2")
    @CacheLookup
    WebElement titleMrs;

    @FindBy(how = How.XPATH, using="//li[text()='You must register at least one phone number.']")
    @CacheLookup
    WebElement phoneIsRequired;

    @FindBy(how = How.XPATH, using="//b[text()='lastname']")
    WebElement lastnameIsRequired;

    @FindBy(how = How.XPATH, using="//b[text()='firstname']")
    WebElement firstnameIsRequired;

    @FindBy(how = How.XPATH, using="(//li[text()=' is required.'])[3]")
    WebElement passwdIsRequired;

    @FindBy(how = How.XPATH, using="//b[text()='address1']")
    WebElement addressIsRequired;

    @FindBy(how = How.XPATH, using="//b[text()='city']")
    WebElement cityIsRequired;

    @FindBy(how = How.XPATH, using="//div[@id='center_column']/div[1]/ol[1]/li[7]")
    WebElement postalCodeIsRequired;

    @FindBy(how = How.XPATH, using="//li[text()='This country requires you to choose a State.']")
    WebElement countryIsRequired;

    @FindBy(how = How.XPATH, using="//span[text()='Register']")
    @CacheLookup
    WebElement register;

    @FindBy(how = How.XPATH, using="//h3[text()='Your personal information']")
    @CacheLookup
    WebElement personalInformationText;

    public void personalInformationFormIsDisplayed() {
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(personalInformationText));
        if(!personalInformationText.isDisplayed())
            Assert.fail("El texto \"your personal information\" no se encuentra");
    }

    public void registerButtonIsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(register));
        if(!register.isDisplayed())
            Assert.fail("El botón Register no se encuentra");
    }
    public void registerButtonClick(){
        register.click();
    }
    public void genderMaleButton() {
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(titleMr));
        titleMr.click();
    }

    public void genderFemaleButton() {
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(titleMrs));
        titleMrs.click();
    }

    public void phoneIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(phoneIsRequired));
        phoneIsRequired.isDisplayed();
    }
    public void lastnameIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(lastnameIsRequired));
        lastnameIsRequired.isDisplayed();
    }
    public void firstnameIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(firstnameIsRequired));
        firstnameIsRequired.isDisplayed();
    }
    public void passwdIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(passwdIsRequired));
        passwdIsRequired.isDisplayed();
    }
    public void addressIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(addressIsRequired));
        addressIsRequired.isDisplayed();
    }
    public void cityIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(cityIsRequired));
        cityIsRequired.isDisplayed();
    }
    public void postalCodeIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(postalCodeIsRequired));
        postalCodeIsRequired.isDisplayed();
    }
    public void countryIsRequired_IsDisplayed(){
        explicitWait(driver,15).until(ExpectedConditions.visibilityOf(countryIsRequired));
        countryIsRequired.isDisplayed();
    }
}
