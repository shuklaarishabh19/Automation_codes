package Testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent {
	public static WebDriver driver;
	
	
	public static boolean elementpresent(String locator) {
		/*try {
		driver.findElement(By.xpath(locator));
		return true;
		}
		catch(Exception e) {
			return false;
		}*/
		
		List<WebElement> driver1 =driver.findElements(By.xpath(locator));
		if(driver1.size()==0) {
			return false;
			
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(elementpresent("//*[@id=\"load_form\"]/fieldset[4]/select/option[2]"));
		//System.out.println(elementpresent("//*[@id=\"load_form\"]/h3"));
		
		
	}

}
