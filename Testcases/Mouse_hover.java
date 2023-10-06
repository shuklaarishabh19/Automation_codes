package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://www.way2automation.com/");
		WebElement mouse=driver.findElement(By.xpath("//*[@id=\"menu-item-27617\"]/a/span[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(mouse).perform();
		driver.findElement(By.xpath("//*[@id=\"menu-item-27618\"]/a/span[2]")).click();
		


	}

}
