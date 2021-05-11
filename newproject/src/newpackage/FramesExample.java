package newpackage;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement ClickMe= driver.findElement(By.id("Click"));
		ClickMe.click();

		String Youclickedme=driver.findElement(By.id("Click")).getText();
		System.out.println("On click you got:"+Youclickedme);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement Nestedclick= driver.findElement(By.id("Click1"));
		Nestedclick.click();
		String Display=driver.findElement(By.id("Click1")).getText();
		System.out.println("Heading is:" +Display);
		
		driver.switchTo().defaultContent();
	
		List<WebElement> NoofFrames=driver.findElements(By.tagName("iframe"));
		int Framecount= NoofFrames.size();
		System.out.println(Framecount);



	}

}
