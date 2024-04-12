package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisplayedSelectedEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		
		WebElement displayed =driver.findElement(By.xpath("//input[@type='submit']"));
		boolean Result =displayed.isDisplayed();
		System.out.println(Result);

		
		
		
	}

}
