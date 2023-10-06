package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("phone"))).sendKeys("rishabh");
		driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input")).toRightOf(By.linkText("Signin"))).click();

	}

}
