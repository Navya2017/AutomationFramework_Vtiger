package calenderPopUp;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUPCurrentSystemDate {

	public static void main(String[] args) throws Throwable {
		
		Date d=new Date();
		String date=d.toString();
		System.out.println(date);
		
		String a[]=date.split(" ");
		String day=a[0];
		String month=a[1];
		String date1=a[2];
		String year=a[5];
		
		String currentDate=day+ " "+month+ " "+date1+" "+year;
		System.out.println(currentDate);
		
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        Actions act=new Actions(driver);
		act.moveByOffset(10,10).click().perform();
		
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='"+currentDate+"']")).click();
		
		


	}

}
