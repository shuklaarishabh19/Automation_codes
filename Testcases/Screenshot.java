package Testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Screenshot {

	//private static final String FileUtils = null;
	//private static final String Output = null;

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		WebElement above=driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("abcd@gamil.com");
		File above_screenshot=above.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(above_screenshot, new File("C:\\Users\\ShuklaRi\\OneDrive - Landis+Gyr\\Documents\\Selenium\\screemshot\\above.jpg"));
		
		
	}

}
