package calenderPopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUpFutureDate {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        Actions act=new Actions(driver);
		act.moveByOffset(10,10).click().perform();
		
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		Thread.sleep(1000);
		while(true)//for(;;)
		{
			try
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@aria-label='Fri Dec 08 2023']")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
