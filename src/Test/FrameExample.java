package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		
		WebDriverWait wait =new WebDriverWait(driver,50);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		// switching to frame
		driver.switchTo().frame("frame1");
		
		WebElement heading =driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		heading.getText();
		
		// switch to parent window frame
		driver.switchTo().defaultContent();
}
}