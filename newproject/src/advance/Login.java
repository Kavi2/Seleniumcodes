package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	@Parameters({"User","Password"})
	public void logindata(String uname, String pass) {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\devis\\SELENIUM\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    WebElement loginname=driver.findElement(By.id("txtUsername"));
	    loginname.sendKeys(uname);
	    
	    WebElement Password=driver.findElement(By.id("txtPassword"));
	    Password.sendKeys(pass);
	    
	    WebElement login=driver.findElement(By.id("btnLogin"));
	    login.click();

}
}
