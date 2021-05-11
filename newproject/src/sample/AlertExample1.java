package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement promptAlert= driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptAlert.click();
		
		Alert PromptAlert= driver.switchTo().alert();
		PromptAlert.sendKeys("Hello world");
		PromptAlert.accept();
	}

}
