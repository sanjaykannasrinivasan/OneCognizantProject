package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountValidation extends BasePage {

	public AccountValidation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	List<String> userDetails = new ArrayList<>();
	
	// WebElements
	@FindBy(id = "O365_HeaderRightRegion")
	WebElement myaccount;
	
	@FindBy(id = "mectrl_currentAccount_secondary")
	WebElement userId;
	
	@FindBy(id = "mectrl_currentAccount_primary")
	WebElement userName;
	
	
	// Action Methods
	public void clickMyAccount() throws InterruptedException {
		
		myaccount.click();
	}
	
	public List<String> getUserDetails() throws InterruptedException {
		String emailId = userId.getText();
		userDetails.add(emailId);
		String username = userName.getText();
		userDetails.add(username);
		
		return userDetails;
	}
}
