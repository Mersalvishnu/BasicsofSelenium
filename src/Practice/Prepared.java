package Practice;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prepared {

	public static void main(String[] args) throws IOException {
		/*
		ChromeOptions options =new ChromeOptions();
		//This Method is used when WebDriver is not Compatible with the HTTP Client
		options.addArguments("--remote-allow-origin=*");
		//This Method is used to disable the Chrome Notifications
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		String Title =driver.getTitle();
		System.out.println(Title);
		System.out.println("Current URL is :"+driver.getCurrentUrl());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		*/
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		
		/*
		WebElement element =driver.findElement(By.id("Form_getForm_FullName"));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		element.sendKeys("vishnu");
		*/
		/*
		WebElement FirstName =driver.findElement(By.id("Form_getForm_FullName"));
		WebElement Mail   =driver.findElement(By.id("Form_getForm_Email"));
		WebElement Company =driver.findElement(By.id("Form_getForm_CompanyName"));
		WebElement phonenumber =driver.findElement(By.id("Form_getForm_Contact"));
		
		sendKeys(driver,FirstName,20,"vishnu");
		sendKeys(driver,Mail,20,"vishnukumar.tada@gmail.com");
		sendKeys(driver,Company,20,"waste");
		sendKeys(driver,phonenumber,20,"9176738131");
*/
		
	/*	
		List<WebElement>  type=driver.findElements(By.xpath("//input[@type='checkbox']/following::*"));
		
		System.out.println(type.size());
		for(WebElement W :type) {
			
			System.out.println("type values were :"+W.getText());
		}
		
	*/
		
		
		
		//Screenshot of Whole page 
		/*
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg =new File(".\\screenshots\\nulabwholepage.png");
		FileUtils.copyFile(src, trg);
		*/
		
		//Particular Element Screenshot 
		
		/*
		WebElement Firstname =driver.findElement(By.id("Form_getForm_FullName"));
		File src =Firstname.getScreenshotAs(OutputType.FILE);
		File trg =new File(".\\screenshots\\Firstname.png");
		FileUtils.copyFile(src, trg);
		*/
		
		//Actions class :
		/*
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		WebElement Meals =driver.findElement(By.xpath("//a[text()=' MEALS ']"));
		//WebElement MEALS=driver.findElement(By.xpath ("//a[text()=' MEALS ']"));
		Actions action =new Actions(driver);
		action.moveToElement(Meals).build().perform();
		*/
		
		//Right click 
		/*
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		
		WebElement Name =driver.findElement(By.name("q"));
		Actions action =new Actions(driver);
		action.contextClick(Name).build().perform();
		*/
		/*
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(35));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		*/
		/*
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("field1")).clear();
		driver.findElement(By.id("field1")).sendKeys("waste Tester");
		WebElement element =driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions action =new Actions(driver);
		action.doubleClick(element).build().perform();
		*/
		
		/*
		driver.switchTo().frame("iframeResult");		
		driver.findElement(By.id("field1")).clear();
		driver.findElement(By.id("field1")).sendKeys("waste Tester");
	    WebElement element=	driver.findElement(By.xpath("//button[text()='Copy Text']"));
		Actions action =new Actions(driver);
		action.doubleClick(element).build().perform();
		*/
		
		/*
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement drag =driver.findElement(By.id("box5"));
		WebElement drop =driver.findElement(By.id("box101"));
		Actions action =new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		*/
		/*
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://apps.nulab.com/signup");
		String Title =driver.getTitle();
		System.out.println(Title);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		*/
		/*
		JavascriptExecutor cs =(JavascriptExecutor)driver;
		
		cs.executeScript("window.scrollBy(0,10000)","");
		*/
		
		
		/*
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		//span[text()='How To']
		WebElement flag =driver.findElement(By.xpath("//span[text()='How To']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", flag);
		*/
		
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		
		
		
	}
/*
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) {
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		element.sendKeys(value);
		
	}
	*/
	
}
