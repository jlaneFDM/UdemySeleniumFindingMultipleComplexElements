package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		//import web driver manager 
		WebDriverManager.chromedriver().setup();
		//grab url
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		//drop <a> tags into a list of web elements
		List<WebElement> anchorTags = driver.findElements(By.tagName("a"));
		
		//output anchor tag text and total anchor tag count to console:
		
		for (WebElement anchorTag : anchorTags) {
			System.out.println(anchorTag.getText());
		}
		
		System.out.println("Total # of anchor tags: " + anchorTags.size());
		
		
		

	}

}
