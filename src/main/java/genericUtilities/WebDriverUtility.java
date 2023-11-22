package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class consists of generic methods related to webdriver actions
 * @author A
 *
 */
public class WebDriverUtility {
	/**
	 * This method will maximize the window
	 * @param driver
	 */
		public void maximizewindow(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		/**
		 * This method will minimize the window
		 * @param driver
		 */
		public void minimizewindow(WebDriver driver)
		{
			driver.manage().window().minimize();
		}
		
		/**
		 * This method will wait for 20 seconds for the page load
		 * @param driver
		 */
		public void waitForPageLoad(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			}
		/**
		 * This method method will wait until particular webelement is visible
		 * @param driver
		 * @param element
		 */
		public void waitForElementToBeVisible(WebDriver driver,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
		/**
		 * This method method will wait until particular webelement is clickable
		 * @param driver
		 * @param element
		 */
		public void waitForElementToBeClickable(WebDriver driver,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
		/**
		 * This method will handle dropdown by index
		 * @param element
		 * @param index
		 */
		public void handleDropdown(WebElement element,int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		/**
		 * This method will handle dropdown by value
		 * @param element
		 * @param value
		 */
		public void handleDropdown(WebElement element,String value)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		/**
		 * This method will handle dropdown by visible Text
		 * @param Text
		 * @param element
		 */
		public void handleDropdown(String Text,WebElement element)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(Text);
		}
		
		
		
		/**
		 * This method will perform mouse hover action on webelement
		 * @param driver
		 * @param element
		 */
		public void mouseHoverAction(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.moveToElement(element).perform();
			
		}
		/**
		 * This method will move the cursor based on offset and click on webpage
		 * @param driver
		 */
		public void moveAndClick(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveByOffset(10,10).click().perform();
			
		}
		
		
		/**
		 * This method will perform right click anywhere on the page
		 * @param driver
		 */
		public void rightClickAction(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.contextClick().perform();
			
		}
		/**
		 * This method will perform right click action on particular webelement
		 * @param driver
		 * @param element
		 */
		
		public void rightClickAction(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.contextClick(element).perform();
			
		}
		/**
		 * This method will perform double click anywhere on the page
		 * @param driver
		 */
		public void doubleClickAction(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.doubleClick().perform();
			
		}
		/**
		 *This method will perform doubleclick action on particular webelement 
		 * @param driver
		 * @param element
		 */
		public void doubleClickAction(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.doubleClick(element).perform();
			
		}
		/**
		 * This method will perform drag and drop from one element to another
		 * @param driver
		 * @param srcElement
		 * @param dstElement
		 */
		public void dragAndDropAction(WebDriver driver,WebElement srcElement,WebElement dstElement)
		{
			Actions act=new Actions(driver);
			act.dragAndDrop(srcElement,dstElement).perform();
			
		}
		
		/**
		 * This method will handle frames with index
		 * @param driver
		 * @param index
		 */
		public void handleFrame(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
		/**
		 * This method will handle frames with name Or Id
		 * @param driver
		 * @param nameOrId
		 */
		public void handleFrame(WebDriver driver,String nameOrId)
		{
			driver.switchTo().frame(nameOrId);
		}
		/**
		 * This method will handle frames with Web element
		 * @param driver
		 * @param element
		 */
		public void handleFrame(WebDriver driver,WebElement element)
		{
			driver.switchTo().frame(element);
		}
		/**
		 * This method will Switch to  immediate parent frame
		 * @param driver
		 */
		public void handleParentFrame(WebDriver driver)
		{
			driver.switchTo().parentFrame();
		}
		/**
		 * This method will Switch to default frame
		 * @param driver
		 */
		public void handleDefaultFrame(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
		
		/**
		 * This method will accept alert pop up
		 * @param driver
		 */
		public void acceptAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		/**
		 * This method will dismiss alert pop up
		 * @param driver
		 */
		public void dismissAlert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		/**
		 * This method will randomly scroll downwardsby 500 units	
		 * @param driver
		 */
		public void scrollDownAction(WebDriver driver)	
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)", "");
			
		}
		/**
		 * This method will randomly scroll upwardsby -500 units	
		 * @param driver
		 */
		public void scrollUpAction(WebDriver driver)	
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-500)", "");
			
		}
		
		/**
		 * This method will scroll down until the particular web element
		 * @param driver
		 * @param element
		 */
		public void scrollAction(WebDriver driver,WebElement element)	
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			int y=element.getLocation().getY();
			
			js.executeScript("window.scrollBy(0,"+y+")",element);
			
		}	
		
		/**
		 * This method will capture and return the alert Text
		 * @param driver
		 * @return
		 */
		public String getAlertText(WebDriver driver)
		{
			return driver.switchTo().alert().getText();
		}
		
		
		/**
		 * This method will take screenshot and save it in screenshots folder
		 * @param driver
		 * @param screenShotName
		 * @return
		 * @throws IOException
		 */
		public String captureScreenShot(WebDriver driver,String screenShotName) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
		 File src=ts.getScreenshotAs(OutputType.FILE); //temporary location
			
			File dst=new File(".\\Screenshots\\"+screenShotName+".png");
			FileUtils.copyFile(src, dst);    //commons io dependency
			return dst.getAbsolutePath();  //used in extent reports
			
		}
		
		/**
		 * This method will switch to window based on partial window title
		 * @param driver
		 * @param partialwinTitle
		 */
		public void switchToWindow(WebDriver driver,String partialwinTitle)
		{
		//step 1:capture all window ids
			Set<String> winIds=driver.getWindowHandles();

		//step 2:use a for each loop and navigate it to each window
			for(String win:winIds)
			{
				//step 3:capture the title of each window
				String currentTitle=driver.switchTo().window(win).getTitle();
				
				//step 4:compare the current title with partial window title
				if(currentTitle.contains(partialwinTitle))
				{
					break;
				}
			}
		}	
		
}
