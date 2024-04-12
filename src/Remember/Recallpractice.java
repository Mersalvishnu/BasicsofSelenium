package Remember;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.*;

public class Recallpractice {
	
	
	public static void ExplicitwaitforgroupofElements(WebDriver driver,WebElement element,int timeout,String value) {
		
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		String Title =driver.getTitle();
		System.out.println(Title);
		/*
		driver.navigate().to("https://www.google.com/");
		String Title1 =driver.getTitle();
		System.out.println(Title1);
		driver.navigate().back();
		String Title2=driver.getTitle();
		System.out.println(Title2);
		driver.navigate().forward();
		String Title3 =driver.getTitle();
		System.out.println(Title3);
		driver.navigate().refresh();
		*/
		
		
		//single Element Explicit wait 
		/*WebElement element =driver.findElement(By.id("Form_getForm_FullName"));
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(45));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		element.sendKeys("vishnu");
		*/
		//group of Elements explicitwait 
		
		WebElement FullName = driver.findElement(By.id("Form_getForm_FullName"));
		WebElement CompanyName=driver.findElement(By.id("Form_getForm_Email"));
		WebElement BusinessMail=driver.findElement(By.id("Form_getForm_CompanyName"));
		WebElement phonenumber =driver.findElement(By.id("Form_getForm_Contact"));
		
		
		ExplicitwaitforgroupofElements(driver,FullName,25,"vishnu");
		ExplicitwaitforgroupofElements(driver,CompanyName,25,"lavada");
		ExplicitwaitforgroupofElements(driver,BusinessMail,25,"vishnukumar.tada@gmail.com");
		ExplicitwaitforgroupofElements(driver,phonenumber,25,"9176738131");
		
		
		
		
		
		
		

	}

}
