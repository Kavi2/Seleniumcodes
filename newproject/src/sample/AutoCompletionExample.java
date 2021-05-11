package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement autobutton=driver.findElement(By.id("tags"));
		autobutton.sendKeys("s");
        Thread.sleep(4000);
		List<WebElement> list= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		
		for (WebElement webElement : list) {
			
			if(webElement.getText().equals("Web Services")) {
				webElement.click();
				
				break;
			}
			
			}
		}
	}


