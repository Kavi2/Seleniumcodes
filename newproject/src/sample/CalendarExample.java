package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		
		WebElement calenbox=driver.findElement(By.id("datepicker"));
		calenbox.click();
		
		WebElement calennext=driver.findElement(By.xpath("//span[text()='Next']"));
		calennext.click();
		
		WebElement calenclick=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		calenclick.click();

	}

}
