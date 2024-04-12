package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AttributeandText {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifcations");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		
		
		System.out.println("*****Get Attribute*******");
		WebElement FullName =driver.findElement(By.id("Form_getForm_FullName"));
		
		System.out.println("Get Attribute Value is :"+FullName.getAttribute("id"));
		
		System.out.println("*********GetText************");
		
		WebElement Text =driver.findElement(By.xpath("//div[@class='demo-section']//h4"));
		
       System.out.println("Get Text Value is:"+Text.getText());
       
       
       
	}

}
