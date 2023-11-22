package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class CreateNewOrganizationPage  extends WebDriverUtility{
	//declaration
		@FindBy(name="accountname")
		private WebElement OrgNameEdt;
		
		@FindBy(name="industry")
		private WebElement IndustryDropDwn;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement SaveBtn;
		
		//initialization
		
		public CreateNewOrganizationPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	//utilizaion
		
		public WebElement getOrgNameEdt() {
			return OrgNameEdt;
		}

		public WebElement getIndustryDropDwn() {
			return IndustryDropDwn;
		}

		public WebElement getSaveBtn() {
			return SaveBtn;
		}
		//business library
		/**
		 *This method will create new organization 
		 */
		public void createNewOrganization(String ORGNAME)
		{
			OrgNameEdt.sendKeys(ORGNAME);
			//SaveBtn.click();
		}
		
		
		
		
		/**
		 * This method will create Organization with industry drop down
		 * @param ORGNAME
		 * @param INDUSTRY
		 */
		public void createNewOrganization(String ORGNAME,String INDUSTRY)
		{
			OrgNameEdt.sendKeys(ORGNAME);
			handleDropdown(IndustryDropDwn,INDUSTRY);
			SaveBtn.click();
		}
		
		
}
