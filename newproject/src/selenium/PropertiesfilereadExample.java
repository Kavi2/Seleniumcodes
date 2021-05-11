package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class PropertiesfilereadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		FileInputStream stream=new FileInputStream("C:\\Users\\devis\\eclipse-workspace\\newproject\\src\\selenium\\config.properties");
		Properties properties=new Properties();
		properties.load(stream);
		
		String browser=properties.getProperty("browser");
		
	String driverLocation=	properties.getProperty("DriverLocation");
	
	if(browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", driverLocation);
	    driver=new ChromeDriver();
	    }else
		if(browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			 driver=new FirefoxDriver();
		}
       driver.get("https://www.google.com/");
	}

}
