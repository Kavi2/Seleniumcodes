package newpackage;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		
		WebElement ClickLink= driver.findElement(By.linkText("Download Excel"));
		ClickLink.click();
		
	    Thread.sleep(3000);
		
		//C:\Users\devis\Downloads
		
		File filelocation =new File("C:\\Users\\devis\\Downloads");
		
		File[] Totalfiles= filelocation.listFiles();
		
		for (File file : Totalfiles) {
			if(file.getName().equals("testleaf.xlsx"))
			{ 
			System.out.println("File is downloaded");
			break;
			}
			
		}

	}

}
