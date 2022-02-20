package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBlogin
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");

		WebDriverWait wait =new WebDriverWait(driver,50);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement btn =driver.findElement(By.xpath("//button[@name='login']"));
		
		username.sendKeys("jnl_mca@yahoo.com");
		pwd.sendKeys("143sivaram*");
		btn.click();
				
		

	}
}