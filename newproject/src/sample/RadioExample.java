package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devis\\eclipse-workspace\\newproject\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		
		WebElement radio1= driver.findElement(By.xpath("//input[@class='myradio'][@id='yes']"));
		radio1.click();
		
		WebElement radio2=driver.findElement(By.xpath("//input[@name='news'][@value='0']"));
		if(radio2.isSelected()) {
			System.out.println("UNChecked button is selected as default");
		}

		WebElement radio3=driver.findElement(By.xpath("//input[@name='news'][@value='1']"));
		if(radio3.isSelected()) {
			System.out.println("Checked button is selected as default");
		}
	}

}


/*
 * public static WebElement NumberOfPassengers(string value) { return
 * Wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//Select[@name='adultOrSeniorPassengerCount']/option[text()='"+value+"']"))
 * )
 * 
 * }
 * 
 * 
 * public static void SelectPassenger(string noOfpassenger) { Actions ac = new
 * Actions(Driver); ac.moveToElement(NumberofPassengers).Click().Perform(); }
 * 
 * 
 * SelectPassenger(2)
 */