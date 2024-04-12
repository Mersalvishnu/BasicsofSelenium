package Remember;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class Remember {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 ChromeOptions options =new ChromeOptions();
		 options.addArguments("--remote-allow-origin=*");
		 options.addArguments("--disable-notifications--");
		 WebDriver driver =new ChromeDriver(options);
		 driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		 driver.manage().window().maximize();
		 String Title =driver.getTitle();
		 System.out.println(Title);
		 
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 File src =ts.getScreenshotAs(OutputType.FILE);
		 File Target =new File(".\\screenshots\\orangehrmnew.png");
		 FileUtils.copyFile(src,Target);
		 
	
		
			
	
			
			 
		
		
		
	}

}
