
package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/radio.html");
    WebElement Radio1= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));
    Boolean Status1 = Radio1.isSelected();
    WebElement Radio2= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
    Boolean Status2= Radio2.isSelected(); 
    System.out.println(Status1);
    System.out.println(Status2);
    
    WebElement Radio3= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
    Radio3.click();

	}

}
