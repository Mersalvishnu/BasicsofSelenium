package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driverbasiccommands {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		String CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
	//	String CurrentPageSource=driver.getPageSource();
	//	System.out.println(CurrentPageSource);
	     driver.navigate().to("https://www.opencart.com/index.php?route=account/login");
	     String CurrentUrl1 =driver.getCurrentUrl();
	     System.out.println(CurrentUrl1);
	     driver.navigate().back();
	     driver.navigate().forward();
	     driver.navigate().refresh();
		
		
		

	}

}
