package sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		
		
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]"));
		
		WebElement to=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release().build().perform();

	}

}
