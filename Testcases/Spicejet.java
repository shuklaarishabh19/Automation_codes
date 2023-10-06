package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Spicejet {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'][normalize-space()='Chennai (MAA)'])[2]")).click();
		
	}

}
