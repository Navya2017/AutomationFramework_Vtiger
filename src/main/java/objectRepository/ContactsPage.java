package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	//declaration
		@FindBy(xpath="//img[@alt='Create Contact...']")
		private WebElement CreateContactLookUpImg;
		
		//initialization
			public ContactsPage (WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
		
		//utilization
		
		public WebElement getCreateContactLookUpImg() {
				return CreateContactLookUpImg;
			}



		//business library
		/**
		 * This method will click on create contact look up image
		 */
		public void clickOnContactLookUpImg()
		{
			CreateContactLookUpImg.click();
		}
}
