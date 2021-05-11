package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://leafground.com/pages/Button.html");	
	    //get xy postion
	    
	    WebElement positionbutton= driver.findElement(By.id("position"));
	   Point xyposition= positionbutton.getLocation();
	   int xvalue= xyposition.getX();
		  int yvalue= xyposition.getY();
		  System.out.println("x value is:"+ xvalue + "Y value is:"+yvalue);
		  
		  // get background color
		  
		  WebElement colorbutton= driver.findElement(By.id("color"));
		 String Buttoncolor= colorbutton.getCssValue("background-color");
		  System.out.println("The Background color:" +Buttoncolor);
		  
		  // get button size
		  
		  WebElement Buttonsize= driver.findElement(By.id("size"));
	      int Buttonheight= Buttonsize.getSize().getHeight();
	      int Buttonwidth= Buttonsize.getSize().getWidth();
	      System.out.println("Button Height:"+ Buttonheight +"Button width:" + Buttonwidth);
	}
	

}
