package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DroppableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		
		WebElement from=driver.findElement(By.id("draggable"));
		
		WebElement to=driver.findElement(By.id("droppable"));
		
		/*
		 * Actions action=new Actions(driver);
		 * action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		 */
		
		
		Actions action=new Actions(driver);
		
	   action.dragAndDrop(from, to).build().perform();
		

	}

}
