package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		String OldWindow=driver.getWindowHandle();
		
		WebElement Homebutton=driver.findElement(By.id("home"));
		Homebutton.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String string : allwindows) {
			
			driver.switchTo().window(string);
			
			
		}
		
		WebElement editbutn= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbutn.click();
		driver.close();
		
		driver.switchTo().window(OldWindow);
		
		WebElement multiwindow= driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		multiwindow.click();
		
		Set<String> mutiplewindows =driver.getWindowHandles();
		
		int totalwindows=mutiplewindows.size();
		
		System.out.println("Total windows opened are:" +totalwindows);
		
		WebElement colorbutn=driver.findElement(By.xpath("//button[@id='color']"));
		
		colorbutn.click();
		
		Set<String> alwindows= driver.getWindowHandles();
		
		for (String newwindow : alwindows) {
			
			if(!newwindow.equals(OldWindow)) {
				
				driver.switchTo().window(newwindow);
				driver.close();
			}
			
		}
		
		
		
		
	}

}
