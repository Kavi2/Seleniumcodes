              package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");

WebElement Dropdown1= driver.findElement(By.id("dropdown1"));
Select select1= new Select(Dropdown1);
select1.selectByIndex(0);

WebElement Dropdown2= driver.findElement(By.name("dropdown2"));
Select select2= new Select(Dropdown2);
select2.selectByVisibleText("Appium");

WebElement Dropdown3= driver.findElement(By.id("dropdown3"));
Select select3= new Select(Dropdown3);
select3.selectByValue("4");

WebElement Dropdown4= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
Select select4 =new Select(Dropdown4);
List<WebElement> Multioptions= select4.getOptions();

int size= Multioptions.size();
System.out.println("No of options:" +size);

WebElement Dropdown5= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
Dropdown5.sendKeys("UFT/QTP");

WebElement Dropdown6= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));

Select select5= new Select(Dropdown6);
select5.selectByVisibleText("Selenium");

select5.selectByVisibleText("UFT/QTP");

	}

}                 
