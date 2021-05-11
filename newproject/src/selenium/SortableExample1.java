package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		
		List<WebElement> sorting= driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(sorting.get(6)).moveToElement(sorting.get(0)).build().perform();

	}

}
