package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement d1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(d1);
		select.selectByIndex(1);
		
		WebElement d2=driver.findElement(By.name("dropdown2"));
		Select select1=new Select(d2);
		select1.selectByVisibleText("Loadrunner");
		
		WebElement d3=driver.findElement(By.id("dropdown3"));
		Select select2=new Select(d3);
		select2.selectByValue("3");
		
		WebElement d4=driver.findElement(By.className("dropdown"));
		Select select3=new Select(d4);
		List<WebElement> s= select3.getOptions();
		int result=s.size();
		System.out.println(result);
		
		WebElement d5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		d5.sendKeys("UFT/QTP");
		
		WebElement d6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select4=new Select(d6);
		select4.selectByValue("1");
		select4.selectByIndex(2);
		select4.selectByVisibleText("UFT/QTP");
		

	}

}
