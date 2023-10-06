package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicksubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input")).sendKeys("rishabh");
		driver.findElement(By.xpath("(//input[@value='Submit'])[2]")).click();

	}

}
