package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("user-message")).sendKeys("Hello there!");
				
		WebElement form = driver.findElement(By.id("get-input"));
						
		List<WebElement> buttons = form.findElements(By.tagName("button"));
		
		for (WebElement webElement : buttons) {
			if (webElement.getText().equals("Show Message")) {
				webElement.click();
			}
		}
		

		

	}
}
