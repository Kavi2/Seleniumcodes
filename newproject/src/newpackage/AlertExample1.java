package newpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement NormalAlert= driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		NormalAlert.click();
		
		Alert OKAlert= driver.switchTo().alert();
		OKAlert.accept();
		
		WebElement ConfirmAlert= driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		ConfirmAlert.click();
		
		Alert ConfmAlert= driver.switchTo().alert();
		ConfmAlert.dismiss();
		
		WebElement Promptalert= driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		Promptalert.click();
		
		Alert Prmalert= driver.switchTo().alert();
		Prmalert.sendKeys("Test Leaf");
		Prmalert.accept();
		
		
		

		

	}

}
