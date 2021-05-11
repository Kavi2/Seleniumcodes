package sample;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadsExampl1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		
		WebElement linkclick= driver.findElement(By.linkText("Download Excel"));
		linkclick.click();
		Thread.sleep(3000);
		
		File file=new File("C:\\Users\\devis\\Downloads");
		
		File[] allfiles=file.listFiles();
		
		for (File file2 : allfiles) {
			if(file2.getName().equals("testleaf.xlsx")) {
				System.out.println("File Copied Sucessfully");
				break;
			}
		}
	}

}
