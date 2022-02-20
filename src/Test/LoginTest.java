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

public class LoginTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://www.simplilearn.com");
		
		WebDriverWait wait =new WebDriverWait(driver,50);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement loginlink= driver.findElement(By.linkText("Log in"));
		loginlink.click();
		
		//wait.until(ExpectedCondition.)
		WebElement UserName= driver.findElement(By.name("user_login"));
		UserName.sendKeys("naglakshmij@gmail.com");
		
		WebElement Password= driver.findElement(By.id("password"));
		Password.sendKeys("Honeywell@123sdsds");
		
		WebElement Rememberme= driver.findElement(By.className("rememberMe"));
		Rememberme.click();
		
		WebElement Loginbtn= driver.findElement(By.name("btn_login"));
		Loginbtn.click();
		
		

		WebElement Errormessage= driver.findElement(By.id("msg_box"));
	    String actualmessage= Errormessage.getText();
		String expectedmsg="The email or password you have entered is invalid.";
		
		
		if(actualmessage.equals(expectedmsg))
		{
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase failed");
			
		}
		
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for( WebElement link: links)
		{
			System.out.println(link.getAttribute("href"));
		}
		
		//driver.close();
		
	}

}
