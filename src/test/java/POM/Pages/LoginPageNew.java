package POM.Pages;

import ExcelDataSetHandler.ReadExcelFile;
import ExcelDataSetHandler.WriteExcelFile;
import POM.Helper.BrowserFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.Random;

public class LoginPageNew extends BrowserFactory{

	WebDriver driver;
	Random randomclass = new Random();
	WriteExcelFile writeFile = new WriteExcelFile();
	ReadExcelFile readFile = new ReadExcelFile();
	String filepath = "TestFiles/usersDataset.xlsx";
	Integer getLastRow = readFile.lastRow(filepath, "Hoja2");
	String[] dataset = {"","","","","","","",""};

	public LoginPageNew(WebDriver driver) throws IOException {
		this.driver = driver;
	}

	@FindBy(id="email_create")
	@CacheLookup
	WebElement username;  
	
	@FindBy(how=How.CLASS_NAME, using="login")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(how=How.ID, using="SubmitCreate")
	@CacheLookup
	WebElement submit_button;

	@FindBy(how = How.XPATH, using="//h3[text()='Your personal information']")
	@CacheLookup
	WebElement personalInformationText;

	@FindBy(how = How.XPATH, using="//h3[text()='Create an account']")
	@CacheLookup
	WebElement createAnAccountText;

	public String[] getDataset() throws IOException {
		String randomMail = createRandomEmail(8) + "@testmail.com";
		String nombre = readFile.getCellValue(filepath,"Hoja2",randomclass.nextInt(getLastRow),randomclass.nextInt(1));
		String apellido = readFile.getCellValue(filepath,"Hoja2",randomclass.nextInt(getLastRow),2);
		String passwd = randomclass.nextInt(99999-10000)+10000+"";
		String randomNumber = randomclass.nextInt(  2000000000-1000000000) + 1000000000+"";
		String address = readFile.getCellValue(filepath,"Hoja2",randomclass.nextInt(getLastRow),3);
		String city = readFile.getCellValue(filepath,"Hoja2",randomclass.nextInt(getLastRow),4);
		String postalCode = randomclass.nextInt(99000-10000)+10000+"";
		dataset[0] = randomMail;
		dataset[1] = nombre;
		dataset[2] = apellido;
		dataset[3] = passwd;
		dataset[4] = randomNumber;
		dataset[5] = address;
		dataset[6] = city;
		dataset[7] = postalCode;
		return dataset;
	}

	public void loginPageRegisterButton() {
		explicitWait(driver,15);
		loginButton.click();
	}

	public void emailFieldIsDisplayed() {
		explicitWait(driver,15);
		if(!username.isDisplayed())
			Assert.fail("El campo email no se encuentra");

	}

	public void typeEmail(String inputText) {
		username.clear();
		username.sendKeys(inputText);
	}

	public void createAnAccount() {
		explicitWait(driver,15);
		submit_button.click();
	}

	public void createAnAccountTextIsDisplayed() {
		explicitWait(driver,15);
		if(!createAnAccountText.isDisplayed())
			Assert.fail("El texto de crear nueva cuenta no se muestra");

	}

	public void personalInformationFormIsDisplayed() {
		explicitWait(driver,15).until(ExpectedConditions.visibilityOf(personalInformationText));
		if(!personalInformationText.isDisplayed())
			Assert.fail("El texto \"your personal information\" no se encuentra");
	}
	public String createRandomEmail(Integer i) {
		String theAlphaNumericS;
		StringBuilder builder;

		theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789";

		//create the StringBuffer
		builder = new StringBuilder(i);

		for (int m = 0; m < i; m++) {

			// generate numeric
			int myindex
					= (int)(theAlphaNumericS.length()
					* Math.random());

			// add the characters
			builder.append(theAlphaNumericS
					.charAt(myindex));
		}

		return builder.toString();
	}
}
