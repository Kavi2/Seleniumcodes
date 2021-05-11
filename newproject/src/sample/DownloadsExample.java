package sample;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement dwnloadclick= driver.findElement(By.linkText("Download Excel"));
		dwnloadclick.click();
		Thread.sleep(3000);
		
		File file=new File("C:\\Users\\devis\\Downloads");
		
		File[] files=file.listFiles();
		
		for (File file2 : files) {
			if(file2.getName().equals("testleaf.xlsx")) {
				System.out.println("The File is copied sucessfully");
				break;
			}
		}
		

	}

}
