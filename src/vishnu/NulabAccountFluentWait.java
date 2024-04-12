package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class NulabAccountFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		driver.get("https://apps.nulab.com/signup");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
         Wait	<WebDriver> fluentwait=new FluentWait<WebDriver>(driver)
          .withTimeout(Duration.ofSeconds(10))
          .pollingEvery(Duration.ofSeconds(10))
          .ignoring(NoSuchElementException.class);		  
		
		
		
	}

}
