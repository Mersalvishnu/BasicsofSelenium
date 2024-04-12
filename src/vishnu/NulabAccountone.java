package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NulabAccountone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        ChromeOptions options =new ChromeOptions();		
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications--");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://apps.nulab.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Title=driver.getTitle();
		System.out.println(Title);
		WebElement Firstname =driver.findElement(By.id("name"));
		WebElement Password =driver.findElement(By.id("password"));
		WebElement email =driver.findElement(By.id("email"));
		
		sendkeys(driver,Firstname,10,"vishnu");
		sendkeys(driver,Password,10,"Bigil@123");
		sendkeys(driver,email,10,"vishnukumar.tada@gmail.com");
		/*
		Wait<WebDriver> fluently =new FluentWait<WebDriver>(driver)
		               .withTimeout(Duration.ofSeconds(10))
		               .pollingEvery(Duration.ofSeconds(10))
		               .ignoring(NoSuchElementException.class);
		               
		*/		
	}
	
	public static void sendkeys(WebDriver driver,WebElement element,int timeout,String value) {
		
		WebDriverWait explicitwait =new WebDriverWait(driver,Duration.ofSeconds(timeout));
		explicitwait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	
	
	
	
	
	
	

}
