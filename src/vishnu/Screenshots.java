package vishnu;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 ChromeOptions options =new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications--");
		 WebDriver driver =new ChromeDriver(options);
		 driver.get("https://www.instagram.com/");
		 driver.manage().window().maximize();
		 String Title =driver.getTitle();
		 System.out.println(Title);
		 Thread.sleep(2000);
		TakesScreenshot  ts  =(TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		File Target =new File(".\\screenshots\\instagramone.png");
		FileUtils.copyFile(src, Target);
		
		Thread.sleep(20000);
		driver.close();
		 
		
		
		
	}

}
