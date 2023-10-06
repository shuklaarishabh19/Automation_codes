package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
     

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver-win64\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		///html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]
		///html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[6]
		WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		
		System.out.println(checkboxes.size());
		for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		
		
	
	}
}
