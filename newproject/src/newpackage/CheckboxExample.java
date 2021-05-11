package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
        // To Select Java
		WebElement Java=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
        Java.click();
        
        WebElement Seleniumchk= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
        Boolean Status= Seleniumchk.isSelected();
        System.out.println(Status);
              
        WebElement FirstElement=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
        if(FirstElement.isSelected())
        { 
        	FirstElement.click();
        }
	   WebElement SecondElement= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
       if(SecondElement.isSelected())
       {
    	 SecondElement.click();  
       }
       
}
}