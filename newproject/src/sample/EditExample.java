package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		
		
		WebElement emailbox= driver.findElement(By.xpath("//input[@id='email']"));
		emailbox.sendKeys("avanthi@gmail.com");
		
		WebElement appendbox= driver.findElement(By.xpath("//input[@value='Append ']"));
		appendbox.sendKeys("My Text");
		
		WebElement textenter= driver.findElement(By.xpath("//input[@name='username'][@value='TestLeaf']"));
		String result= textenter.getAttribute("value");
		System.out.println("MyTextbox default text is:" +result);
	    
		WebElement textclear= driver.findElement(By.xpath("//input[@name='username'][@value='Clear me!!']"));
		textclear.clear();
		
		WebElement enablebox= driver.findElement(By.xpath("//input[@type='text'][@disabled='true']"));
		boolean satus= enablebox.isEnabled();
		System.out.println("The TextBox enable is:" +satus);
		
	}
	

}
