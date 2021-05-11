package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='tags']"));
		searchbox.sendKeys("s");
		
		Thread.sleep(3000);

		List<WebElement> listofoptions= driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		for (WebElement webElement : listofoptions) {
			if(webElement.getText().equalsIgnoreCase("Rest API")) {
				
				webElement.click();
				break;
				
			}
		}
		
	}

}
