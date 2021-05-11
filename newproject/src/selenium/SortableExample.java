package selenium;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://leafground.com/pages/selectable.html");
		
		List<WebElement> s= driver.findElements(By.xpath("//ol[@id='selectable']//li"));
		
		int all=s.size();
		System.out.println(all);
		
		
		  Actions a=new Actions(driver); 
		  //a.keyDown(Keys.CONTROL).click(s.get(0)).click(s.get(1)).click(s.get(2)).build().perform();
		 a.clickAndHold(s.get(0)).clickAndHold(s.get(1)).clickAndHold(s.get(2)).clickAndHold(s.get(3)).build().perform();
		

	}

}
