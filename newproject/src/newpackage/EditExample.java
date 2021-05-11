package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://leafground.com/pages/Edit.html");
WebElement emailbox= driver.findElement(By.id("email"));
emailbox.sendKeys("devi@gmail.com");
WebElement appendbox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
appendbox.sendKeys("Text");
WebElement textgvn= driver.findElement(By.name("username"));
String value= textgvn.getAttribute("value"); 
System.out.println(value);
WebElement ctext= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
ctext.clear();
WebElement enablebox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
boolean result= enablebox.isEnabled();
System.out.println(result);
	}                

}
