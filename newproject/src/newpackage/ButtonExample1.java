package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		WebElement GetPosition= driver.findElement(By.xpath("//button[@id='position']"));
		Point XYLocation=GetPosition.getLocation();
		int XLocation= XYLocation.getX();
		int YLocation= XYLocation.getY();
		System.out.println("The X value is:"+XLocation +"The X value is:"+YLocation);
		
		WebElement ButtonColor= driver.findElement(By.xpath("//button[@id='color']"));
		String Backgroundcolor=ButtonColor.getCssValue("background-color");
		System.out.println("The Button Background color is:" + Backgroundcolor);
		
		WebElement ButtonSize= driver.findElement(By.xpath("//button[@id='size']"));
		int Height= ButtonSize.getSize().getHeight();
        int width=ButtonSize.getSize().getWidth();
        System.out.println("The Button Height is:" +Height +"The Button Width is:" +width);
        
        WebElement HomePage= driver.findElement(By.xpath("//button[@id='home']"));
		HomePage.click();

	}

}
