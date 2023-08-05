package practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class lalli1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Create an account']")).click();
		Thread.sleep(100);
		/*Actions action = new Actions(driver);
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//div[text()='First name']"));
		Thread.sleep(1000);
		action.moveToElement(element).sendKeys("RamanaMaharshi"); */
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='First name']")));
		 Category_Body.sendKeys("RamanaMaharshi"); */
		
		// driver.findElement(By.name("//input[name='firstName']")).sendKeys("RamanaMaharshi");
		// driver.findElement(By.xpath("//div[text()='First name']")).sendKeys("RamanaMaharshi");
		driver.findElement(By.xpath("//div[@class='Xb9hP']/input[1]")).sendKeys("SeleniumPNRsir");
		// driver.findElement(By.xpath("//div[contains(text(),'First name')]")).sendKeys("RamanaMaharshi");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class=\"Xb9hP\"]/input[1]")).sendKeys("12");
		Thread.sleep(1000);
		Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='CuHakb']/select[1]")));
		Thread.sleep(1000);
		dropdown.selectByValue("1");
		driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("1990");
		// driver.findElement(By.name("//input[@name='year']")).sendKeys("1990");
		Thread.sleep(1000);
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@aria-labelledby='gender-label']")));
		dropdown1.selectByValue("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
	/*	Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@aria-labelledby='selectionc0']"));
		action.moveToElement(element).click();   */
		driver.findElement(By.xpath("//div[@aria-labelledby='selectionc0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Anusha@1227");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("Anusha@1227");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//label[@for='phoneNumberId']/input")).sendKeys("9959696847");
		// driver.findElement(By.xpath("//span[contains(text(),'Pho')]")).sendKeys("9959696847");
		driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9959696847");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Enter code']"));
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='Next']"));
		action.moveToElement(element).click();
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("//span[@name='Skip']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("//span[@name='Skip']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
		Thread.sleep(10000);
        driver.close();
	}

}
