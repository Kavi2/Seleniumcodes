package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		
		Actions action=new Actions(driver);
		WebElement to= driver.findElement(By.id("highlight-addons"));
		

		action.moveToElement(to).build().perform();
		
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.xpath("//a[text()=' International SIM Cards ']"));
		click.click();
		driver.quit();
		
	}

}
