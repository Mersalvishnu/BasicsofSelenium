package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/* Find Element is used to find the Element using Locators
	 * It Will Return Single WebElement
	 * If There are Multiple Elements it will Return First Element
	 * If the Element is not Found it will Throw No Such Element Exception 
	 * 	
	 */
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		WebElement FullName =driver.findElement(By.name("FullName"));
		FullName.sendKeys("Bigil");
		WebElement Email =driver.findElement(By.name("Email"));
		Email.sendKeys("vishnukumar.tada@gmail.com");
		WebElement Company =driver.findElement(By.name("CompanyName"));
		Company.sendKeys("FreeLancer");
		WebElement PhoneNumber =driver.findElement(By.name("Contact"));
		PhoneNumber.sendKeys("9176738131");
		
		
		
	}

}
