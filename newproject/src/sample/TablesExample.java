package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> Noofcoloumns= driver.findElements(By.tagName("th"));
		int totalc= Noofcoloumns.size();
		
		System.out.println("The Number of Columns in the table are:" +totalc);
		
		List<WebElement> Noofrows= driver.findElements(By.tagName("tr"));
		int totalr= Noofrows.size();
		
		System.out.println("The Number of rows in the table are:" +totalr);
		
		WebElement Progressvalue= driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following::td[1]"));
		String result= Progressvalue.getText();
		System.out.println("The Pogress value of Learn to interact with Elements is:" +result);
		
		List<WebElement> allprogress= driver.findElements(By.xpath("//td[2]"));
		
	    
	    List<Integer> Numlist=new ArrayList<Integer>();
	    for (WebElement webElement : allprogress) {
	    	
	    	String results=webElement.getText().replace("%", "");
	    	Numlist.add(Integer.parseInt(results));
	    	
	    }
		
	    System.out.println(Numlist);
	    
	    int smallValue= Collections.min(Numlist);
	    System.out.println(smallValue);
	    
	   String SmallStringValue=Integer.toString(smallValue)+"%";
	   
	   
	   Actions Click=new Actions(driver);
	   WebElement check= driver.findElement(By.xpath("//td[normalize-space()= "+"\""+SmallStringValue+"\"]"+"//following::td[1]"));
	   Click.moveToElement(check).click().build().perform();
	    
	}

}
