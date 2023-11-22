package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Rule 1:create POM class for every webpage
	
		// Rule 2:Identify all the web elements using Annotations
		@FindBy(name="user_name")
		private WebElement UserNameEdt;
		
		@FindBy(name="user_password")
		private WebElement PassWordEdt;
		
		@FindAll({@FindBy(id= "submitButton"),@FindBy(xpath="//input[@type='submit']")})
		private WebElement LoginBtn;
		
		//Rule 3:Initialize these webelements with a constructor
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//Rule 4:provide getters to access these elements
		
		public WebElement getUserNameEdt() {
			return UserNameEdt;
		}

		public WebElement getPassWordEdt() {
			return PassWordEdt;
		}

		public WebElement getLoginBtn() {
			return LoginBtn;
		}
		
		
		//Business Library =Generic Methods -Project specific
		/**
		 * This method will login to application
		 * @param USERNAME
		 * @param PASSWORD
		 */
		public void loginToApp(String USERNAME,String PASSWORD)
		{
			UserNameEdt.sendKeys(USERNAME);
			PassWordEdt.sendKeys(PASSWORD);
			LoginBtn.click();
		}
	
}
