package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsInfoPage {
	//declaration
		@FindBy(xpath="//span[@class='dvHeaderText']")
		private WebElement OrgHeaderText;
		
		//initialization
			public OrganizationsInfoPage (WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
	//utilization
			public WebElement getOrgHeaderText() {
				return OrgHeaderText;
			}
		//business library
			/**
			 * This method will get the  header text and return it to the caller
			 * @return
			 */
			public String getOrganizationHeader()
			{
				return  OrgHeaderText.getText();
			}
}
