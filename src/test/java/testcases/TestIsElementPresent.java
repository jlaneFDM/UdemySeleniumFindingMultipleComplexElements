package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	private static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.wikipedia.org");
		System.out.println("Element present: " + isElementPresent("/html/body/div[2]/div[1]/a/strong"));

	}

	public static Boolean isElementPresent(String xpath) {
		try {
			driver.findElement(By.xpath(xpath));
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return false;

	}

}
