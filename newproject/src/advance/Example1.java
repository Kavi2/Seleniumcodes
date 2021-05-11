package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Example1 {
	@Test
	@Parameters({"User" ,"Password"})
	public void Logincorrect(String name,String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    WebElement Userbtn= driver.findElement(By.id("txtUsername"));
	   Userbtn.sendKeys(name);
	    WebElement passwordbtn= driver.findElement(By.id("txtPassword"));
	    passwordbtn.sendKeys(password);
	    WebElement Loginbtn= driver.findElement(By.id("btnLogin"));
	    Loginbtn.click();
	    
	}
	

}
