package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.ErrorManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableExample
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebDriverWait wait =new WebDriverWait(driver,50);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		//List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());

		List<WebElement> columns= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		//List<WebElement> columns= driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(columns.size());
		
		
		List<WebElement> data= driver.findElements(By.xpath("//table[@id='customers']//tr[4]/td"));
		//List<WebElement> columns= driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(data.size());
		for( WebElement el: data)
		{
			System.out.println(el.getText());
		}
		
		// to print 1st column data
		List<WebElement> coldata= driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		//List<WebElement> columns= driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(coldata);
		for( WebElement el: coldata)
		{
			System.out.println(el.getText());
		}
		
		int column = 1;
		String xpath = "//table[@id='customers']//td[" + column + "]";
		//td[text()='Island Trading']/following-sibling::td


		
		
		
		driver.close();

	}
}
//table[@id='customers']/tbody/tr