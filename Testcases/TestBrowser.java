package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class TestBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", null)
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://way2automation.com");
		
		//this method is used for to get the title of automated page.
		//System.out.println( driver.getTitle());
		
		String title=driver.getTitle();
		//As string is the class so to print the lenth we need to call the lenght method;
		System.out.println(title.length());
		
		driver.close();
		

	}

}
