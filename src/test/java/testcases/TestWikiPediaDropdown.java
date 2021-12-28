package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWikiPediaDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(dropdown); //Select class works because HTML built the menu using <select> tag
		select.selectByVisibleText("Deutsch");
		select.selectByValue("da"); //grab a tag by its value attribute
		
		List<WebElement> options = driver.findElements(By.tagName("option")); //grab multiple elements using tag name
		
		System.out.println("Total elements in dropdown: " + options.size());
		for (WebElement webElement : options) {
			System.out.println("Tag type: " 
								+ webElement.getTagName() 
								+ ", Text: " 
								+ webElement.getText());
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on page: " + links.size());
		
		for (WebElement webElement : links) {
			System.out.println("Link text: " + webElement.getText() + "\n URL: " + webElement.getAttribute("href"));
		}
		
		
		//find elements within a block: counting links inside wikipedia homepage footer
		
		WebElement footer = driver.findElement(By.xpath("/html/body/div[11]"));
		
		List<WebElement> anchorTags = footer.findElements(By.tagName("a"));
		
		System.out.println("Total links in footer: " + anchorTags.size());
		
		
		

	}

}
