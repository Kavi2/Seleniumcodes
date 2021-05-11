package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	String[][] data={
		{"Admin1","admin123"},
		{"Admin","admin12"},
		{"Admin1","admin1234"},
		{ "Admin","admin123"},
		
	};
	
	
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		
		return data;
		
	}

@Test(dataProvider="loginData")	
public void Loginpage(String name,String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devis\\SELENIUM\\Drivers\\chromedriver.exe");
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

	

