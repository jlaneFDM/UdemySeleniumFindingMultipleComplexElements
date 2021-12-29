package testcases;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement form = driver.findElement(By.id("pollform"));
	    
	    List<WebElement> inputs = form.findElements(By.tagName("input"));
	    
	    for (WebElement input : inputs) {
			if (input.getAttribute("value").equals("1")) {
				input.click();
			}
		}
	    
	    WebElement mathQuestionText = driver.findElement(By.id("mathq2"));
	    
	    String mathQuestion = mathQuestionText.getText();
	    
	    mathQuestion.split(" ");
	    
	    char[] numbers = mathQuestion.toCharArray();
	    int firstInt = Integer.parseInt(Character.toString(numbers[0]));
	    int secondInt = Integer.parseInt(Character.toString(numbers[4]));
	    char operand = numbers[2];
	    System.out.println(Arrays.toString(numbers));
	    
	    int answer;
	    if (operand == '+') {
			answer = firstInt + secondInt;
			driver.findElement(By.id("mathuserans2")).sendKeys(Integer.toString(answer));
			
		}else if (operand == '-') {
			answer = firstInt - secondInt;
			driver.findElement(By.id("mathuserans2")).sendKeys(Integer.toString(answer));
		}
	    
	    driver.findElement(By.className("vot")).click();
	    
	}

}
