package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		WebElement EmailAddress= driver.findElement(By.xpath("//input[@id='email']"));
		EmailAddress.sendKeys("Avanthika@gmail.com");
		
		WebElement AppendText= driver.findElement(By.xpath("//input[@type='text'][@value='Append ']"));
		AppendText.sendKeys("My Text");
		
		
		WebElement defaultText= driver.findElement(By.xpath("//input[@type='text'][@name='username'][@value='TestLeaf']"));
		String Result=defaultText.getAttribute("value");
		System.out.println("The Default Text is:"+Result);
		
		WebElement ClearText= driver.findElement(By.xpath("//input[@type='text'][@name='username'][@value='Clear me!!']"));
		ClearText.clear();
		
		WebElement Editfield= driver.findElement(By.xpath("//input[@type='text'][@disabled='true']"));
		Boolean Status =Editfield.isEnabled();
		System.out.println("The Edit field Status is:" +Status);
		
		
	}

}
