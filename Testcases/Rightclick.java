package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().fullscreen();
		WebElement img=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		Actions action= new Actions(driver);
		action.contextClick(img).perform();
		driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dm2m2i1tdT\"]")).click();

		
	}

}
