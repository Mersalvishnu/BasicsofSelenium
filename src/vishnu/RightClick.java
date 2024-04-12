package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		WebElement element =driver.findElement(By.name("q"));
		Actions action =new Actions(driver);
		action.contextClick(element).build().perform();
		
		
		
	}

}
