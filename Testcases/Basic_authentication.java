package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));

		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();
		//driver.register

	}

}
