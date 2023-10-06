package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptalert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
		
		

	}

}
