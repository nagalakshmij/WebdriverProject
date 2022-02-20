package Test;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsExample
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		WebDriverWait wait =new WebDriverWait(driver,50);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String parentwindow=driver.getWindowHandle();
				System.out.println("Before clicking "+parentwindow);

		WebElement element =driver.findElement(By.xpath("//button[@id='windowButton']"));
		element.click();
		//button[@id='tabButton']
		WebElement tabclick =driver.findElement(By.xpath("//button[@id='tabButton']"));
		tabclick.click();
		
		System.out.println("after clicking ");

		Set<String> handles=driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while(itr.hasNext())
		{
			
			String currnetvalue=itr.next();
			System.out.println("current value"+currnetvalue);
			if(!currnetvalue.equals(parentwindow))
			{
				driver.switchTo().window(currnetvalue);
				
			}
		}
		
		
		WebElement heading =driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		heading.getText();
		System.out.println(heading.getText());
		driver.close();
		// switching back to parent window
		driver.switchTo().window(parentwindow);
		//driver.close();
		
		
		
}
}