package vishnu;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Screenshotsone {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	ChromeOptions options =new ChromeOptions();
	options.addArguments("--remote-allow-origin=*");
	options.addArguments("--disable-notifications--");
	WebDriver driver =new ChromeDriver(options);
	driver.get("https://apps.nulab.com/signup");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	/*
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src =ts.getScreenshotAs(OutputType.FILE);
	   File trg =new File(".\\screenshots\\nulab.png");
	   FileUtils.copyFile(src, trg);
	 */
	
	   WebElement Firstname =driver.findElement(By.id("name"));
	   File src =Firstname.getScreenshotAs(OutputType.FILE);
	   File target =new File(".\\screenshots\\firstname.png");
	   FileUtils.copyFile(src, target);
		
		
	}

}
