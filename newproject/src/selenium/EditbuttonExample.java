package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditbuttonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		WebElement emailbox=driver.findElement(By.xpath("//input[@id='email']"));
		emailbox.sendKeys("avanthi@gmail.com");
		
		WebElement appendbox=driver.findElement(By.xpath("//input[@value='Append ']"));
		appendbox.sendKeys("avanthi");
		
		WebElement defaultbox= driver.findElement(By.name("username"));
		String s=defaultbox.getAttribute("value");
		System.out.println(s);
		
		WebElement clearbox= driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearbox.clear();
		
		
		WebElement editfield= driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean result=editfield.isEnabled();
		System.out.println(result);
		
		
	}  
	
	

}
