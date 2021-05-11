package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TootlTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		WebElement textbox1=driver.findElement(By.id("age"));
		String status=textbox1.getAttribute("title");
		System.out.println("Your Tooltip is:" +status);
		
		

	}

}
