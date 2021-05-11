package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		WebElement textbox1= driver.findElement(By.id("tags"));
		textbox1.sendKeys("s");
		Thread.sleep(4000);
		
		List<WebElement> Optionslist =driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement webElement : Optionslist) {
			String result=webElement.getText();
			System.out.println(result);
			   
		   }
			
		}

	}


