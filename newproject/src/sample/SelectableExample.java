package sample;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> sorting= driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		Actions action=new Actions(driver);
		/*
		 * action.keyDown(Keys.CONTROL).click(sorting.get(0)) .click(sorting.get(1))
		 * .click(sorting.get(2)) .build().perform();
		 */
		
		action.clickAndHold(sorting.get(0)).clickAndHold(sorting.get(1)).build().perform();
	}

}
