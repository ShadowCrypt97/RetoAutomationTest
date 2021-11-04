package POM.Pages;

import ExcelDataSetHandler.ReadExcelFile;
import POM.Helper.BrowserFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.List;

public class RegisterPageComplete extends BrowserFactory {

    WebDriver driver;

    ReadExcelFile readExcelFile = new ReadExcelFile();
    String filepath = "TestFiles/usersDataset.xlsx";
    Integer getLastRow = readExcelFile.lastRow(filepath, "Hoja1");

    public RegisterPageComplete(WebDriver driver) throws IOException {
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "uniform-id_gender1")
    @CacheLookup
    WebElement titleMr;

    @FindBy(how = How.ID, using = "uniform-id_gender2")
    @CacheLookup
    WebElement titleMrs;

    @FindBy(how = How.ID, using = "customer_firstname")
    @CacheLookup
    WebElement customerfirstname;

    @FindBy(how = How.ID, using = "customer_lastname")
    @CacheLookup
    WebElement customerlastname;

    @FindBy(how = How.ID, using = "email")
    @CacheLookup
    WebElement email;

    @FindBy(how = How.ID, using = "passwd")
    @CacheLookup
    WebElement passwd;

    @FindBy(how = How.ID, using = "days")
    @CacheLookup
    WebElement days;

    @FindBy(how = How.ID, using = "months")
    @CacheLookup
    WebElement months;

    @FindBy(how = How.ID, using = "years")
    @CacheLookup
    WebElement years;

    @FindBy(how = How.ID, using = "newsletter")
    @CacheLookup
    WebElement signUpFor;

    @FindBy(how = How.ID, using = "optin")
    @CacheLookup
    WebElement receiveSpecialOffers;

    @FindBy(how = How.ID, using = "uniform-optin")
    @CacheLookup
    WebElement newsLetter;

    @FindBy(how = How.ID, using = "customer_firstname")
    @CacheLookup
    WebElement firstname;

    @FindBy(how = How.ID, using = "customer_lastname")
    @CacheLookup
    WebElement lastname;

    @FindBy(how = How.ID, using = "company")
    @CacheLookup
    WebElement company;

    @FindBy(how = How.ID, using = "address1")
    @CacheLookup
    WebElement address;

    @FindBy(how = How.ID, using = "address2")
    @CacheLookup
    WebElement address2;

    @FindBy(how = How.ID, using = "city")
    @CacheLookup
    WebElement city;

    @FindBy(how = How.ID, using = "uniform-id_state")
    @CacheLookup
    WebElement idstate;

    @FindBy(how = How.ID, using = "postcode")
    @CacheLookup
    WebElement postcode;

    @FindBy(how = How.ID, using = "uniform-id_country")
    @CacheLookup
    WebElement idcountry;

    @FindBy(how = How.ID, using = "other")
    @CacheLookup
    WebElement other;

    @FindBy(how = How.ID, using = "phone")
    @CacheLookup
    WebElement phone;

    @FindBy(how = How.ID, using = "phone_mobile")
    @CacheLookup
    WebElement phonemobile;

    @FindBy(how = How.ID, using = "alias")
    @CacheLookup
    WebElement alias;

    @FindBy(how = How.XPATH, using = "//span[text()='Register']")
    @CacheLookup
    WebElement register;

    @FindBy(how = How.CSS, using = "div[class='alert alert-danger']>ol")
    @CacheLookup
    WebElement errorsCount;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
    @CacheLookup
    WebElement myCustomerAccount;
    @FindBy(how = How.XPATH, using = "//sup[text()='*']")
    private WebElement asterisk1;
    @FindBy(how = How.XPATH, using = "(//sup[text()='*'])[2]")
    private WebElement asterisk2;
    @FindBy(how = How.XPATH, using = "(//sup[text()='*'])[3]")
    private WebElement asterisk3;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'required password')]//sup[1]")
    private WebElement asterisk4;
    @FindBy(how = How.XPATH, using = "//p[@class='required form-group']//sup")
    private WebElement asterisk5;
    @FindBy(how = How.XPATH, using = "(//p[@class='required form-group']//sup)[2]")
    private WebElement asterisk6;
    @FindBy(how = How.XPATH, using = "(//p[@class='required form-group']//sup)[3]")
    private WebElement asterisk7;
    @FindBy(how = How.XPATH, using = "//label[@for='city']//sup[1]")
    private WebElement asterisk8;
    @FindBy(how = How.XPATH, using = "//p[contains(@class,'required id_state')]//sup[1]")
    private WebElement asterisk9;
    @FindBy(how = How.XPATH, using = "//p[contains(@class,'required postcode')]//sup[1]")
    private WebElement asterisk10;
    @FindBy(how = How.XPATH, using = "//p[contains(@class,'required select')]//sup[1]")
    private WebElement asterisk11;
    @FindBy(how = How.XPATH, using = "//form[@id='account-creation_form']/div[2]/p[13]/label[1]/sup[1]")
    private WebElement asterisk12;
    @FindBy(how = How.XPATH, using = "//p[@id='address_alias']//sup[1]")
    private WebElement asterisk13;

    public void phoneMobileIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(phonemobile));
        phonemobile.isDisplayed();
    }

    public void phoneMobileSendKeys() throws IOException {
        String phoneNumber = readExcelFile.getCellValue(filepath, "Hoja1", getLastRow, 4);
        phonemobile.sendKeys(phoneNumber);
    }

    public void lastNameIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(lastname));
        lastname.isDisplayed();
    }

    public void lastNameSendKeys() throws IOException {
        String lastName = readExcelFile.getCellValue(filepath, "Hoja1", getLastRow, 2);
        lastname.sendKeys(lastName);
    }

    public void firstNameIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(firstname));
        firstname.isDisplayed();
    }

    public void firstNameSendKeys() throws IOException {
        String firsName = readExcelFile.getCellValue(filepath, "Hoja1", getLastRow, 1);
        firstname.sendKeys(firsName);
    }

    public void passwdIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(passwd));
        passwd.isDisplayed();
    }

    public void passwdSendKeys() throws IOException {
        String password = readExcelFile.getCellValue(filepath, "Hoja1", getLastRow, 3);
        passwd.sendKeys(password);
    }

    public void addressIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(address));
        address.isDisplayed();
    }

    public void addressSendKeys() throws IOException {
        String addr = readExcelFile.getCellValue(filepath, "Hoja1", getLastRow, 5);
        address.sendKeys(addr);
    }

    public void cityIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(city));
        city.isDisplayed();
    }

    public void citySendKeys() throws IOException {
        String cityStr = readExcelFile.getCellValue(filepath, "Hoja1", getLastRow, 6);
        city.sendKeys(cityStr);
    }

    public void zipCodeIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(postcode));
        postcode.isDisplayed();
    }

    public void zipCodeSendKeys() throws IOException {
        String zipCode = readExcelFile.getCellValue(filepath, "Hoja1", getLastRow, 7);
        postcode.sendKeys(zipCode);
    }

    public void stateToBeClickeable() {
        wait.until(ExpectedConditions.elementToBeClickable(idstate));
        idstate.isDisplayed();
    }

    public int asteriskAreDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(asterisk1, asterisk2, asterisk3, asterisk4,
                asterisk5, asterisk6, asterisk7, asterisk8, asterisk9, asterisk10, asterisk11, asterisk12, asterisk13)).size();
    }

    public void numberOfRequiredFieldsAreDisplayedOnErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(errorsCount));
    }

    public int numberOfRequiredFields(){
        Integer Count = 0;
        int numbererrors = driver.findElements(By.cssSelector("div[class='alert alert-danger']>ol>li")).size();
        return numbererrors;

    }

    public void registerButtonIsClickeable(){
        register.isDisplayed();
        register.click();
    }

    public void stateSelect(){
        List<WebElement> states = idstate.findElements(By.tagName("option"));
        Integer count = 0;
        for (int i = 0; i< states.size();i++){
            count++;
        }
        Assert.assertTrue("el conteo de la lista no coincide con el numero de los elementos de la lista",count.equals(states.size()));
        states.get(10).click();
    }

    public void viewMyCustomerAccount() throws IOException {
        wait.until(ExpectedConditions.visibilityOf(myCustomerAccount));
        myCustomerAccount.isDisplayed();
        String completeNameResult = myCustomerAccount.getText();
        String nameExpected = readExcelFile.getCellValue(filepath,"Hoja1",getLastRow,1);
        String lastNameExpected = readExcelFile.getCellValue(filepath,"Hoja1",getLastRow,2);
        String completeNameExpected = nameExpected + " " +lastNameExpected;
        if(!completeNameExpected.equals(completeNameResult))
            System.out.print("mensaje de error");
    }

}