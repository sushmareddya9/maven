package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void m() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Desktop\\selenium\\seleniumdriver\\chromedriver76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize browser window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//navigate to url
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}
