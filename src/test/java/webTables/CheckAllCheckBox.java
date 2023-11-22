package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckAllCheckBox {

	public static void main(String[] args) throws Throwable {
		//Step 1: Launch the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8888");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
//Step 2: Login to App
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();

//Step 3: Navigate to Contacts link
driver.findElement(By.linkText("Organizations")).click();
		List<WebElement>chbx=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]"));
		System.out.println(chbx.size());
		
		for (WebElement cb:chbx)
		{
			cb.click();
			
		}
		
	}

}
