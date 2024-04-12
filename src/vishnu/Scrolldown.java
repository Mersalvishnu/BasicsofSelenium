package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolldown {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
	
		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)","");
		/*
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10000)", "");
		*/
	//	WebElement flag =driver.findElement(By.xpath("//div[text()='India']"));
	//	js.executeScript("arguments[0].scrollIntoView(true);",flag);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}

}
