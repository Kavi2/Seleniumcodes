package sample;

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
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdown1']"));
        Select sel=new Select(dropdown1);
        sel.selectByIndex(2);
        
        WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/select"));
        Select sel1=new Select(dropdown2);
        sel1.selectByVisibleText("Selenium");
        
        WebElement dropdown3=driver.findElement(By.xpath("//select[@id='dropdown3']"));
        Select sel2=new Select(dropdown3);
        sel2.selectByValue("3");
        
        WebElement dropdown4=driver.findElement(By.xpath("//select[@class='dropdown']"));
        Select sel3=new Select(dropdown4);
        List<WebElement>Noofoptions= sel3.getOptions();
        int result= Noofoptions.size();
        System.out.println("The No of Options in Dropdown are:"+result);
        
        WebElement dropdown5= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
        dropdown5.sendKeys("Loadrunner");
        
        WebElement dropdown6= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
        Select sel4=new Select(dropdown6);
        sel4.selectByIndex(1);
        sel4.selectByIndex(2);
        sel4.selectByIndex(3);
         
	}

}
