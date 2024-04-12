package vishnu;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NulabAccountTwo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications--");
		WebDriver driver =new ChromeDriver();
		String baseUrl ="https://apps.nulab.com/signup";
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String Title =driver.getTitle();
		System.out.println(Title);
		
		WebElement Fullname =driver.findElement(By.id("name"));
		WebElement Password =driver.findElement(By.id("password"));
		WebElement mail =driver.findElement(By.id("email"));
		
		sendkeys(driver,Fullname,10,"vishnu");
		sendkeys(driver,Password,10,"Bigil");
		sendkeys(driver,mail,10,"vishnukumar.tada@gmail.com");
		
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File src =ts.getScreenshotAs(OutputType.FILE);
		  File trg =new File(".\\screenshots\\Fullpage.png");
		  FileUtils.copyFile(src, trg);
		  
		  
		  File src1 =mail.getScreenshotAs(OutputType.FILE);
		  File trg1 =new File(".\\screenshots\\mail.png");
		  FileUtils.copyFile(src1, trg1);
		  
		  
				
	}
	
	public static void sendkeys(WebDriver driver,WebElement Element,int timeout,String value) {
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.visibilityOf(Element));
	Element.sendKeys(value);
		
		
		
		
	}
	

}
