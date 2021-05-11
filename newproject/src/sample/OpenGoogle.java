package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		FileInputStream stream=new FileInputStream("config.properties");
		
		Properties properties=new Properties();
		properties.load(stream);
		String browser=properties.getProperty("browser");
		
		String driverlocation=properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverlocation);
		 driver= new ChromeDriver();
	}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver= new FirefoxDriver();
		}
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
		
		WebElement linkclick= driver.findElement(By.xpath("//h3[text()='Agni - Wikipedia']"));
		linkclick.click();
		
		
	}
}
