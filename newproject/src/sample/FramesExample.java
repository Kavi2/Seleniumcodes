package sample;







import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement button1= driver.findElement(By.xpath("//button[@id='Click']"));
		button1.click();
		String Text=driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(Text);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2= driver.findElement(By.xpath("//button[@id='Click1']"));
		button2.click();
		
		driver.switchTo().defaultContent();
		List<WebElement>noofframes =driver.findElements(By.tagName("iframe"));
		int result= noofframes.size();
		System.out.println("The numberof frames are:" +result);
		
	}

}
