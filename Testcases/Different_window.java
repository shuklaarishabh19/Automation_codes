package Testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Selenium 4");
		//driver.close();
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://gmail.com");
		driver.quit();
		
//		Set<String> window=driver.getWindowHandles();
//		Iterator iterator = (Iterator) window.iterator();
//		
//		List<String> list=new ArrayList<String>();
		
//		while (iterator.hasNext()) {
//			 
//			list.add(iterator.next());
//		}
		
		
		
		
		
		
		

	}

}
