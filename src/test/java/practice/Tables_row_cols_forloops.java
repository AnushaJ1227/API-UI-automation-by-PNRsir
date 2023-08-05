package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables_row_cols_forloops 
{
   public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2022-23-1298134/points-table-standings");
		driver.manage().window().maximize();
		List<WebElement> tables = driver.findElements(By.xpath("//table"));
		 System.out.println("Tables are :" + tables.size());
	/*	for(int i=0; i<tables.size();i++)
		{		
			List<WebElement> rows = tables.get(i).findElements(By.xpath("tbody/tr[@class='ds-text-tight-s']"));
			System.out.println("Rows are :" + rows.size());
			for(int j=0; j<rows.size();j++)
			{
			  List<WebElement> cols = rows.get(j).findElements(By.xpath("td"));
			  System.out.println("Columns are :" + cols.size());
	            for(int k=0;k<cols.size();k++)
			     {			    	 
			    	 System.out.println("Names of Column is:  " + cols.get(k).getText()+",");			    	 
			     }
	            System.out.println();
			}  */		
			
		for(int i=1;i<=tables.size();i++)
		{
		    List<WebElement> rows = driver.findElements(By.xpath("(//table/tbody)["+i+"]/tr"));
			System.out.println("Rows are :" + rows.size());
			for(int j=1;j<=rows.size();j++)
			{
				List<WebElement> cols = driver.findElements(By.xpath("(//table/tbody)["+i+"]/tr["+j+"]/td"));
				System.out.println("Columns are :" + cols.size());
				   for(int k=1;k<=cols.size();k++)
				     { 
				       System.out.println("Number of columns: " + driver.findElement(By.
				    		   xpath("(//table/tbody)["+i+"]/tr["+j+"]/td["+k+"]")).getText()+","); 
				     }
		        System.out.println();			
			} 
			
		}

	}

}
