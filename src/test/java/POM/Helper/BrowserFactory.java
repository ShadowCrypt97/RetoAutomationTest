package POM.Helper;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BrowserFactory {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions actions;
	public static SoftAssertions softAssertions;

	public static WebDriver startBrowser(String browserName) {
		if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();

		return driver;
	}
	public static void closeBrowser(WebDriver driver) {
		driver.close();
	}

	public static void abrirUrl(WebDriver driver, String url){
		driver.get(url);
	}

	public WebDriverWait explicitWait(WebDriver driver,Integer durationOnSeconds){
		wait = new WebDriverWait(driver, durationOnSeconds);
		return wait;
	}

	public String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		Date date = new Date();
		return dateFormat.format(date);
	}

}
