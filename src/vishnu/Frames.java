package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	ChromeOptions options =new ChromeOptions();
	options.addArguments("--remote-allow-origin=*");
	options.addArguments("--disable-notifications");
	WebDriver driver =new ChromeDriver();
	driver.get("https://classic.freecrm.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	driver.manage().window().maximize();
	String Title =driver.getTitle();
	System.out.println(Title);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  driver.findElement(By.name("username")).sendKeys("vishnukumar");
  driver.findElement(By.name("password")).sendKeys("password");
    Thread.sleep(20000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
		
		
		
	}
	
	
	

}
