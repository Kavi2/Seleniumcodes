package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		WebElement check1= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		check1.click();
		
		WebElement check2= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		if(check2.isSelected()) {
			System.out.println("The Selenium checkbox is selected");
		}
		
		WebElement check3= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		if(check3.isSelected()) {
			check3.click();
		}
		
		WebElement check4= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(check4.isSelected()) {
			check4.click();
		}
		
		WebElement check5= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input"));
	    check5.click();
	
	}
	

}
