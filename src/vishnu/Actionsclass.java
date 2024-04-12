package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   //Mousehover 
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		
		WebElement MEALS=driver.findElement(By.xpath("//a[text()=' MEALS ']"));
		
		Actions action =new Actions(driver);
		action.moveToElement(MEALS).build().perform();
		
		
		
		
		
	}

}
