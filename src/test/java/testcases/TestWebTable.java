package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> rowNums = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		System.out.println("Total rows are: " + rowNums.size() );
		
		List<WebElement> colNums = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		
		System.out.println("Total columns are: " + colNums.size());
		
		for (int rows = 1; rows <= rowNums.size(); rows++) {
			
			for (int cols = 1; cols <= colNums.size(); cols++) {
				String output = driver
							.findElement
							(By.
								xpath
								("//table[@class='dataTable']/tbody/tr["+rows+"]/td["+cols+"]"))
							.getText();
				System.out.println(output);
			}
		}
		
	}

}
