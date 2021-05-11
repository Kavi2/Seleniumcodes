package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
        
		List<WebElement> Multiselect= driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(Multiselect.get(0))
		.click(Multiselect.get(1))
		.click(Multiselect.get(2)).build().perform();

		/*Actions action=new Actions(driver);
        action.clickAndHold(Multiselect.get(0)).clickAndHold(Multiselect.get(1)).clickAndHold(Multiselect.get(2))
        .build().perform();*/
	}

}
