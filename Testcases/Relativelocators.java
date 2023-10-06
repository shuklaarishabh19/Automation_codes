package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;

public class Relativelocators {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select"))).sendKeys("abcd@gamil.com");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select"))).sendKeys("new delhi");
		
		//driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin"))).click();
		
		driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).toRightOf(By.tagName("label"))).sendKeys("abcd");
		
		driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("//*[@id=\"load_form\"]/div[1]/div[2]/input"))).click();*/

		/*driver.findElement(RelativeLocator.with(By.tagName("input"))
				.above(By.linkText("Signin"))
				.below(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input"))).sendKeys("abcd"); */
				  
		  List<WebElement> labels = driver.findElements(RelativeLocator.with(By.tagName("label")).below(By.xpath("//*[@id=\"load_form\"]/h3")));
		  
		  
			for(WebElement label: labels) {
				
				System.out.println(label.getText());
		
	}

}}
