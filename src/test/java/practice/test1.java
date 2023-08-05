package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1
{
@Test
public void method() throws InterruptedException

	{
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		// EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(500);
		System.out.println("Successfully opened");
		driver.quit();
		System.out.println("Successfully closed"); 
        // test2 obj = new test2();
        // obj.main("edge");
	}
	
}
