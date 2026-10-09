package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

import Locators.FlipkartLocators;

public class FlipkartTest {

	@Test
	public void OpenFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			driver.get("https://www.flipkart.com/");

			System.out.println("Flipkart opened successfully");

			// Close login popup if it appears
			closeLoginPopupIfPresent(driver);

			// Next, we will add the search steps here.
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			WebElement searchbox = wait.until(ExpectedConditions.elementToBeClickable(FlipkartLocators.Search_Box));

			searchbox.sendKeys("iphone 17");
			searchbox.sendKeys(org.openqa.selenium.Keys.ENTER);
			System.out.println("Iphone 17 searched succesfully");

		} finally {
			// Close Chrome after the test finishes
			driver.quit();
		}
	}

	private void closeLoginPopupIfPresent(WebDriver driver) {
		try {
			WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));

			WebElement closeButton = shortWait
					.until(ExpectedConditions.elementToBeClickable(FlipkartLocators.Login_PopUp_Close));

			closeButton.click();
			System.out.println("Login popup closed.");

		} catch (org.openqa.selenium.TimeoutException e) {
			System.out.println("No login popup appeared.");
		}
	}

}
