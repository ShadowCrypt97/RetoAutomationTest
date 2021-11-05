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

public class homePageRegister extends BrowserFactory{

	WebDriver driver;
	WriteExcelFile writeFile = new WriteExcelFile();
	ReadExcelFile readFile = new ReadExcelFile();
	String filepath = "TestFiles/usersDataset.xlsx";
	Integer getLastRow = readFile.lastRow(filepath, "Hoja2");

	public homePageRegister(WebDriver driver) throws IOException {
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


	public void loginPageRegisterButton() {
		explicitWait(driver,15);
		loginButton.click();
	}

	public void emailFieldIsDisplayed() {
		explicitWait(driver,15);
		if(!username.isDisplayed())
			Assert.fail("El campo email no se encuentra");

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



}
