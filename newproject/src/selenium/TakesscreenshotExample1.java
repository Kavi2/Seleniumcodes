package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TakesscreenshotExample1 {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/radio.html");
		
		Robot robot=new Robot();
		Dimension Screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(Screensize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destinationfile=new File("C:\\Users\\devis\\SELENIUM\\files\\sample.png");
		ImageIO.write(source, "png", destinationfile);
		
		
	}

}
