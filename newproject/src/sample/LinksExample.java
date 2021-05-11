package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		WebElement homelink= driver.findElement(By.linkText("Go to Home Page"));
		homelink.click();
		
		driver.navigate().back();
		
		WebElement findlink= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/a"));
		String result=findlink.getAttribute("href");
		System.out.println("The link is goin to open"+result);
		
		
		
		WebElement brokenlink= driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
		brokenlink.click();
		
		String Title=driver.getTitle();
		
		if(Title.contains("404")) {
			System.out.println("Link is broken");
		}
		
		driver.navigate().back();
		WebElement homelinks= driver.findElement(By.linkText("Go to Home Page"));
		homelinks.click();
		
		driver.navigate().back();
		
		List<WebElement> nooflink=driver.findElements(By.tagName("a"));
		int links=nooflink.size();
		
		System.out.println("Total links are:"+links);
	}

}
