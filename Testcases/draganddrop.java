package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(draggable, droppable).perform();
		action.dragAndDropBy(draggable, 400, 400).perform();

	}

}
