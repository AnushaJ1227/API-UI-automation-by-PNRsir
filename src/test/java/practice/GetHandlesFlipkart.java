package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetHandlesFlipkart
{

public static void main(String[] args) throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		try
		{
			driver.findElement(By.xpath("//span[text()='Login']//preceding::button[1]")).click();
			Thread.sleep(1000);
		}
		
		catch(Exception e)
		{
			System.out.println("No pop-up is showing");
		}
		driver.findElement(By.xpath("//a[contains(text(),'VIEW ALL')][1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Baby')]")).click();
		/* Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Baby')]"));
		action.moveToElement(element).click().build().perform(); */
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Remo')]")).click();
		Thread.sleep(5000);
		List<WebElement> cars = driver.findElements(By.xpath("//div[contains(text(),'Pop')]/following::a[@class='_2rpwqI']"));
		
		for(int i=0;i<cars.size();i++)
		{
			cars.get(i).click();
			Set<String> s = driver.getWindowHandles();
			List<String> l = new ArrayList<String>(s);
			driver.switchTo().window(l.get(1));
		//  driver.switchTo().window(l.get(i+1)); // for getting the n item in n different pages
			String x = driver.findElement(By.xpath("//div[@id='price-info-icon']/preceding::div[@class='_30jeq3 _16Jk6d']")).getText();
			x=x.substring(1);
			x=x.replace(",", "");
			System.out.println(x);
			Thread.sleep(1000);
			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(l.get(0));
			Thread.sleep(10000);
		}
		
      driver.quit();
	}
	
}
