package practice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images_download_saving {

	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		File folder = new File("D:\\images_download_program");
		if(!folder.exists())
		{
			folder.mkdirs();
		}
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		int num = 1;
		for(WebElement image:images)
		{
		  String imgurl = image.getAttribute("src");
		  String filename = "image"+num+".png";
		  Path destinationpath = Path.of(folder.getAbsolutePath(), filename);
		  URL url = new URL(imgurl);
		  BufferedInputStream in = new BufferedInputStream(url.openStream());
		  Files.copy(in, destinationpath, StandardCopyOption.REPLACE_EXISTING);
		  in.close();
		  num++;
		}
		driver.close();
	}

}
