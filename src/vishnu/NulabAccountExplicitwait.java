package vishnu;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NulabAccountExplicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          ChromeOptions options =new ChromeOptions();
          options.addArguments("--remote-allow-origins=*");
          options.addArguments("--disable notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://apps.nulab.com/signup");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Thread.sleep(20);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Title =driver.getTitle();
		System.out.println(Title);
		
		WebElement Name =driver.findElement(By.id("name"));
		WebElement Email= driver.findElement(By.id("email"));
		WebElement Password=driver.findElement(By.id("password"));
		sendkeys(driver,Name,10,"vishnu");
		sendkeys(driver,Password,10,"Shanthi.1");
		sendkeys(driver,Email,10,"vishnukumar.tada@gmail.com");
		
		
		Thread.sleep(20);
		//driver.quit();
		
	}
	
	public static   void sendkeys(WebDriver driver,WebElement element,int timeout,String value) {
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
		
	}

}
