package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement clickbtn= driver.findElement(By.id("Click"));
		clickbtn.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nestedclick= driver.findElement(By.id("Click1"));
		nestedclick.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> framescnt= driver.findElements(By.tagName("iframe"));
		int result=framescnt.size();
		System.out.println("The total frames available are:" +result);
		
	}

}
