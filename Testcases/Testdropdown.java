package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testdropdown {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		
		//driver.findElement(By.name("country")).sendKeys("Greece"); this method is not 100% correct
		
		
		//to select any particular thing from dropdowm
		
		/*WebElement dropdown= driver.findElement(By.name("country"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Greece");*/
		
		
		
		
		// to select count the number of element from dropdown
		
		List<WebElement> count= (List<WebElement>) driver.findElements(By.tagName("option"));
		System.out.println(count.size());		

	}

}
