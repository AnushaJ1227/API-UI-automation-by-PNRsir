package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class display_count 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		int visible = 0, nonvisible = 0;
		driver.get("https://www.flipkart.com/");
		List<WebElement> I = driver.findElements(By.xpath("//*"));
		for(WebElement e:I)
		{
			if(e.isDisplayed())
			{
				visible=visible+1;
			}
			else
			{
				nonvisible = nonvisible+1;
			}
		}
		System.out.println("Visible elements:" +visible);
		System.out.println("Non Visible elements:" +nonvisible);
		driver.close(); 
	}
  
}
