package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement Dropdown1=driver.findElement(By.xpath("//*[@id='dropdown1']"));
		Select select=new Select(Dropdown1);
		select.selectByIndex(1);
		
		WebElement Dropdown2=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select select1=new Select(Dropdown2);
		select1.selectByVisibleText("Appium");
		
		WebElement Dropdown3=driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select select2=new Select(Dropdown3);
		select2.selectByValue("3");
		
		WebElement Dropdown4= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select select3=new Select(Dropdown4);
		List<WebElement>Noofoptions= select3.getOptions();
		int NoofOptions=Noofoptions.size();
		System.out.println("Number of Options are:"+NoofOptions);
		
		WebElement Usesndkey=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		Usesndkey.sendKeys("Loadrunner");
		
		WebElement Dropdown6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
	    Select multiselect=new Select(Dropdown6);
	    multiselect.selectByIndex(0);
	    multiselect.selectByIndex(1);
        multiselect.selectByIndex(3);

	}

}
