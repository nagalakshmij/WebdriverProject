package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBsignup {

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
				
				WebElement signup= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
				signup.click();
				
				
				WebElement UserName= driver.findElement(By.name("firstname"));
				UserName.sendKeys("naglakshmij@gmail.com");
				
				WebElement Password= driver.findElement(By.name("lastname"));
				Password.sendKeys("Honeywell@123sdsds");
				
				WebElement mail= driver.findElement(By.name("reg_email__"));
				mail.sendKeys("nag.gmail.com");
				
				String gender="Female";
				
				
				
				String genXpath="//label[text()='"+gender+"']/following-sibling::input";
				
				WebElement gen= driver.findElement(By.xpath(genXpath));
				gen.click();
				
				
				WebElement month= driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
				
				
				System.out.println("month"+month.getText());
				
				
				List<WebElement> links= driver.findElements(By.xpath("//select[@title='Month']/option"));
				System.out.println(links.size());
				
				for( WebElement link: links)
				{
					System.out.println(link.getText());
				}
				
				List<WebElement> linkss= driver.findElements(By.xpath("//select[@id='day']/option"));
				
				
				System.out.println(links.size());
				
				WebElement day1= driver.findElement(By.xpath("//select[@id='day']"));
				Select selectedday= new Select(day1);
				selectedday.selectByVisibleText("22");
				

				WebElement smonth= driver.findElement(By.xpath("//select[@title='Month']"));
				Select selectedmonth= new Select(smonth);
				selectedmonth.selectByVisibleText("Aug");
				
				System.out.println(links.size());
				
				for( WebElement day: linkss)
				{
					System.out.println(day.getText());
				}
				
				
				//select[@id='day']/option
				//select[@title='Month']/option

	}

}
