package newpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		//Normal Alert
		WebElement AlertBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		AlertBox.click();
		Alert OkAlert =driver.switchTo().alert();
		OkAlert.accept();
		// Conformation Alert
		WebElement ConfirmBtn= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		ConfirmBtn.click();
		Alert ConfirmAlert=driver.switchTo().alert();
		ConfirmAlert.dismiss();
		// Dispaly PromptBox
		WebElement Promptbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		Promptbox.click();
		Alert PromptAlert=driver.switchTo().alert();
		PromptAlert.sendKeys("Devisree");
		PromptAlert.accept();
		
		
	}
	

}
