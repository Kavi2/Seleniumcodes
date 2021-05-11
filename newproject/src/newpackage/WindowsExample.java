package newpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String Oldwindow= driver.getWindowHandle();
		WebElement Homepagebtn= driver.findElement(By.id("home"));
		Homepagebtn.click();
		
		Set<String> handles= driver.getWindowHandles();
		for (String newwindow : handles) 
		{
			driver.switchTo().window(newwindow);
			
		}
		
			WebElement Editbutton=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));	
			Editbutton.click();
			driver.close();
			
		driver.switchTo().window(Oldwindow);
		WebElement Multiwindow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		Multiwindow.click();
		int Noofwindows= driver.getWindowHandles().size();
		System.out.println("No of Windows open:"+ Noofwindows);
		WebElement dontcloseme=driver.findElement(By.id("color"));
		dontcloseme.click();
		
		Set<String>childwindow= driver.getWindowHandles();
		for (String allwindows : childwindow) {
			if(!allwindows.equals(Oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
			
		}
		}
		           
	
	}


