package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement OkAlert= driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		OkAlert.click();
		
		Alert okalert=driver.switchTo().alert();
		okalert.accept();
		
		WebElement cancelAlert= driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		cancelAlert.click();
		
		Alert CancelAlert= driver.switchTo().alert();
		CancelAlert.dismiss();
		
		WebElement promptalert= driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptalert.click();
		
		Alert PromptAlert= driver.switchTo().alert();
		PromptAlert.sendKeys("hi");
		PromptAlert.accept();
		
		WebElement linealert =driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		linealert.click();
		
		Alert LineAlert= driver.switchTo().alert();
		LineAlert.accept();
		
		WebElement sweetalert=driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
		 sweetalert.click();
		
		 /*Alert SweetAlert= driver.switchTo().alert(); SweetAlert.accept();*/
		
	}

}
