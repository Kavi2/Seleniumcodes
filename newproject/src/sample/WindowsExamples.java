package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		
		String OldWindow= driver.getWindowHandle();
		
		WebElement button1= driver.findElement(By.xpath("//button[@id='home']"));
		button1.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for (String newwindow : allwindows) {
			
			driver.switchTo().window(newwindow);
			}
		
		WebElement editbox= driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();
		driver.close();
		
		driver.switchTo().window(OldWindow);
		
		WebElement Multiwindow= driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		Multiwindow.click();
		
		Set<String>mutiplewindows= driver.getWindowHandles();
		int result= mutiplewindows.size();
		System.out.println("No of Windows opened are:"+result);
		
		WebElement closebtn= driver.findElement(By.xpath("//button[@id='color']"));
		closebtn.click();
		
		Set<String> allnewwindows=driver.getWindowHandles();
		for (String newwndw : allnewwindows) {
			
			if(!newwndw.equals(OldWindow)) {
				driver.switchTo().window(newwndw);
				driver.close();
			}
			
		}
		
		
		
	}

}
