package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class yahoomail {
	
    @Test
	public void method() throws InterruptedException
	//public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("login-username")).sendKeys("Jaigurudhatta");
		Thread.sleep(5000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("Anusha@1227");
		Thread.sleep(5000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ybarMailLink")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Compose")).click();
		Thread.sleep(5000);
		// driver.findElement(By.id("message-to-field")).sendKeys("ytdytd779@gmail.com");
		driver.findElement(By.id("message-to-field")).sendKeys("jaigurudhatta@fastmail.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("For testing purpose");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi \nHow are you? \nI am sending an attachment \nThanks, \nxxxx.");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\css140753\\Downloads\\Test36.java");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(10000);
		String x = driver.findElement(By.xpath("//div[@role='presentation']/following-sibling::div[1]")).getText();
		// String x = driver.findElement(By.xpath("//div[@class='em_N D_F P_Z2baRGn A_6EWk i_6Mbr c1AVi73_6FYl c1AVi7H_6Mrc C_Z281SGl o_h r_BN']")).getText();
		Thread.sleep(10000);
		System.out.println(x);
		Thread.sleep(5000);
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("profile-signout-link")).click();
		Thread.sleep(5000);                                             
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		Set<String> s = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));                  
		// ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
		driver.get("https://login.fastmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// driver.switchTo().window(l.get(0));
		// driver.close();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Jaigurudhatta");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("Anusha@1227");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Log')]")).click();
		Thread.sleep(5000);
		String y = driver.findElement(By.xpath("//ul[@class='u-list-body v-Mailbox v-Mailbox--long v-Mailbox--vlong']/li/a/div/span/span[1]")).getText();
		System.out.println(y);
		if (y.equalsIgnoreCase("Adishankaracharya Sadguru@yahoo.com"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
		driver.findElement(By.xpath("//button[@id='main-nav-toolbar']/span/div[2]")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		// driver.quit();
		
	}

}
