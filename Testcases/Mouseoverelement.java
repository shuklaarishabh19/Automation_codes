package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouseoverelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("way2automation.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a")).click();
		

	}

}
