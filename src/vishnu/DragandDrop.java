package vishnu;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origin=*");
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		String Title =driver.getTitle();
		System.out.println(Title);
		
		WebElement draggable =driver.findElement(By.id("box3"));
		WebElement droppable =driver.findElement(By.id("box106"));
		
		Actions action =new Actions(driver);
		action.dragAndDrop(draggable, droppable).build().perform();
		
		

	}

}
