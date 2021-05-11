package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		WebElement homebutn=driver.findElement(By.id("home"));
		homebutn.click();
		
		String oldwindow=driver.getWindowHandle();
		
		WebElement button1=driver.findElement(By.xpath("//*[@id=\'home\']"));
		button1.click();
		
		Set<String>handles= driver.getWindowHandles();
		
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
			
		}
		
		WebElement button2=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		button2.click();
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		
		
		WebElement button3=driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		
		button3.click();
		
		int totalwin=driver.getWindowHandles().size();
		System.out.println(totalwin);	
			
		
		
        WebElement button4=driver.findElement(By.xpath("//button[@onclick='openWindows();']"));
		
		button4.click();
		
		Set<String> multiwins= driver.getWindowHandles();
		
		for (String single : multiwins) {
			if(!single.equals(oldwindow)) {
				driver.switchTo().window(single);
				driver.close();
			}
		}
	}

}
