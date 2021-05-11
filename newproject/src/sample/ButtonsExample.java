package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		
		
		WebElement positionbutton= driver.findElement(By.xpath("//button[@id='position']"));
	    Point xyposition=positionbutton.getLocation();
	    int xposition= xyposition.getX();
	    int yposition= xyposition.getY();
	    System.out.println(xposition);
	    System.out.println(yposition);
	    
	    WebElement buttoncolor= driver.findElement(By.xpath("//button[@id='color']"));
	    String Backcolor=buttoncolor.getCssValue("background-color");
	    System.out.println("The Button Color is:"+Backcolor);
	    
	    WebElement buttonsize= driver.findElement(By.xpath("//button[@id='size']"));
	    int height=buttonsize.getSize().getHeight();
	    int width=buttonsize.getSize().getWidth();
	    System.out.println("The Button Height is:"+height +"The Button Width is:"+width);
	    
	    WebElement homebutton= driver.findElement(By.xpath("//button[@id='home']"));
		homebutton.click();
	    
	    
	    
	    

	}

}
