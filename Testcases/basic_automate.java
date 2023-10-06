package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;


public class basic_automate {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		WebElement name= driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input"));
		name.sendKeys("rishabh");
		

	}

}
