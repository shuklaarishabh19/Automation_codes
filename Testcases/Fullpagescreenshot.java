package Testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Fullpagescreenshot {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		File screenshot=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("C:\\Users\\ShuklaRi\\OneDrive - Landis+Gyr\\Documents\\Selenium\\screemshot\\screenshot.jpg"));

	}

}
