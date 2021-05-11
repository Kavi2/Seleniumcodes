package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
	    WebElement bkimage= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
	    if(bkimage.getAttribute("naturalWidth").equals("0")) {
	    	
	    	System.out.println("This is a Broken Image");
	    }
	    else {
	    	System.out.println("This is not broken image");
	    }

	}

}
