package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDropdowns {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.cbc.ca/");
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("menuButton")).click();
		driver.findElement(By.xpath("//*[@id=\"mainMenuNav\"]/div/ul/li[2]/a")).click();
		
		driver.quit();
	
		//Select class only works on dropdowns using the html "select" tag
		
	   
	
		
		
		
		
		
		
		
	}

}
