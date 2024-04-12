package vishnu;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String Title =driver.getTitle();
	  System.out.println(Title);
	  driver.close();
		
		
	}

}
