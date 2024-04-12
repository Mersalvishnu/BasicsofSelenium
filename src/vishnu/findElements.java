package vishnu;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		String Title= driver.getTitle();
		System.out.println(Title);
		
	  List<WebElement>  list= driver.findElements(By.xpath("//div[@class='foot']//a"));
	  System.out.println("The size of WebElements is :"+list.size());
	     /*   Iterator  it =list.iterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next());
	        }*/
	        
	        
	       for(WebElement Take :list) {
	    	   
	    	   System.out.println("The List of WebElements were :" +Take.getText());
	       }
	  
		

		
		
		
	}

}
