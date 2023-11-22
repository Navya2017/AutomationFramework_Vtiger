package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility {

	//declaration
		@FindBy(linkText= "Organizations")
		private WebElement OrganizationsLnk;
		
		@FindBy(linkText="Contacts")
		private WebElement ContactsLnk;
		
		@FindBy(linkText="Opportunities")
		private WebElement OpportunitiesLnk;
		
		@FindBy(linkText="More")
		private WebElement MoreLnk;
		
		@FindBy(linkText="Vendors")
		private WebElement VendorsLnk;
		
		
		@FindBy(linkText="Products")
		private WebElement ProductsLnk;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement AdministratorImg;
		
		@FindBy(linkText="Sign Out")
		private WebElement SignOutLnk;
		
		//initialization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		//utilization
		
		
		
		
		public WebElement getOrganizationsLnk() {
			return OrganizationsLnk;
		}

		public WebElement getContactsLnk() {
			return ContactsLnk;
		}

		public WebElement getOpportunitiesLnk() {
			return OpportunitiesLnk;
		}

		public WebElement getMoreLnk() {
			return MoreLnk;
		}
		public WebElement getVendorsLnk() {
			return VendorsLnk;
		}

		public WebElement getProductsLnk() {
			return ProductsLnk;
		}

		public WebElement getAdministratorImg() {
			return AdministratorImg;
		}

		public WebElement getSignOutLnk() {
			return SignOutLnk;
		}

		//Business Libraries
		/**
		 * This method will click on Organizations link
		 */
		public void clickOnOrganizationLink()
		{
			OrganizationsLnk.click();
		}
		/**
		 * This method will click on Products link
		 */
		public void clickOnProductsLink()
		{
			ProductsLnk.click();
		}
		/**
		 * This method will click on more link
		 */
		public void clickOnMoreLink()
		{
			MoreLnk.click();
		}
		/**
		 * This method will click on contacts link
		 */
		public void clickOnContactsLink()
		{
			ContactsLnk.click();
		}
		/**
		 * This method will click on vendors link
		 */
		public void clickOnvendorsLink()
		{
			VendorsLnk.click();
		}
		
		
		/**
		 * This method will perform sign out operation on web app
		 * @param driver
		 */
		public void logoutOfApp(WebDriver driver)
		{
			mouseHoverAction(driver,AdministratorImg);
			SignOutLnk.click();
		}
		
		
		
	
	
}
