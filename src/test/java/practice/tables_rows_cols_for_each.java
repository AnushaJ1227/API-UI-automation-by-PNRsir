package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tables_rows_cols_for_each 
{
	public static void main(String args[])
	
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		driver.manage().window().maximize();
		List<WebElement> tables = driver.findElements(By.xpath("//table/tbody"));
		System.out.println("Tables are :" + tables.size());
		for(WebElement table:tables)
		{
			if(table.isDisplayed())
			{
			  driver.executeScript("arguments[0].style.border='2px dotted red';", table);
			}
		}
		 
		for(WebElement table:tables)
		{
			List<WebElement> rows = table.findElements(By.xpath("child::tr[@class='ds-text-tight-s']"));
			System.out.println("Rows are :" + rows.size());

			for(WebElement row:rows)
			{
			  List<WebElement> cols = row.findElements(By.xpath("child::td"));
			  System.out.println("Columns are :" + cols.size());

			     for(WebElement col:cols)
			     {
			    	 
			    	 System.out.println("Names of Column is:  " + col.getText()+",");
			    	
			     }
			   System.out.println();  
			}     
			     
		}
	//driver.close();	
	 	
	}

}
                                                             