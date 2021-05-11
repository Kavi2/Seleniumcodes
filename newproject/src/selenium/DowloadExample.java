package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DowloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		
		WebElement a=driver.findElement(By.linkText("Download Excel"));
		a.click();
		
		File file=new File("C:\\Users\\devis\\Downloads");
		
		File[] allfile=file.listFiles();
		
		for (File result : allfile) {
			
			if(result.getName().equals("testleaf.xlsx")){
				System.out.println("File copied");
				break;
				}
			
			
		}
		
		
			
		}
		
	
		

	}


