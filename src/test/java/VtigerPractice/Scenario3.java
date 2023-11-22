package VtigerPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario3 {

	public static void main(String[] args) {
	
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

//Step 4: Click on Create contact Look up Image
driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

//Step 5: Create organization with mandatory Fields
driver.findElement(By.name("accountname")).sendKeys("Flipkart1");



WebElement ele1=driver.findElement(By.name("industry"));
Select s=new Select(ele1);
s.selectByValue("Chemicals");



//Step 6: Save
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//Step 7: Validate for Organization
String ContactHeader =
driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
if(ContactHeader.contains("Flipkart"))
{
System.out.println(ContactHeader+" ---- PASS ----");
}
else
{
System.out.println(" ---- Failed ----");
}



//Step 8: Logout of app
WebElement ele2 =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
Actions act = new Actions(driver);
act.moveToElement(ele2).perform();
driver.findElement(By.linkText("Sign Out")).click();
System.out.println("Sign out successful");
driver.quit();

	}

}
