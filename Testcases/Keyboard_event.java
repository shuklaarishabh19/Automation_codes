package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_event {

	public static void main(String[] args) {
//		WebDriver driver= new ChromeDriver();
//		driver.get("http://gmail.com");
		//driver.manage().window().fullscreen();
//		driver.findElement(By.id("identifierId"));
//		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("trainer@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
//		
//		Actions action= new Actions(driver);
//		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
//		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
//		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
//
//		//action.sendKeys(Keys.ENTER).perform();
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
	
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
		

	}

}
