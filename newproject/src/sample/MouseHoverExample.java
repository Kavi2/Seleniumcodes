package sample;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html");
		
		
       WebElement mousehoverbtn= driver.findElement(By.xpath("//a[@class='btnMouse']"));
       Actions action=new Actions(driver);
       action.moveToElement(mousehoverbtn).build().perform();
       
     
      List<WebElement> lists= driver.findElements(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li"));
  
     for (WebElement webElement : lists) {
    	String result= webElement.getText();
    	
    	if(result.equalsIgnoreCase("Selenium")) {
    		webElement.click();
    		break;
    	}
    	
	}
     
Alert alerts=driver.switchTo().alert();
alerts.accept();

     
   
        
    
	}
	

}
