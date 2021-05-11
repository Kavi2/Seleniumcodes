package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/radio.html");
		
		
		TakesScreenshot screenshot= (TakesScreenshot) driver;
		
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile=new File("C:\\Users\\devis\\SELENIUM\\files\\sample.png");
		
		FileHandler.copy(sourcefile, destinationfile);
		
	}

}
