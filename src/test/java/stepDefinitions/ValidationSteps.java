package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AccountValidation;
import utilities.WriteExcelData;

public class ValidationSteps {

	WebDriver driver;
	WebElement accountButton;
	AccountValidation validation;
	Properties p;
	
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";

	@Given("user navigates beCognizant portal")
	public void user_navigates_be_cognizant_portal() throws InterruptedException {

		validation = new AccountValidation(BaseClass.getDriver());
	}

	@Then("user click on myaccount menu")
	public void user_click_on_myaccount_menu() throws InterruptedException {
		Thread.sleep(5000);
		validation.clickMyAccount();
	}

	@Then("user should see user account details")
	public void user_should_see_user_account_details() throws IOException, InterruptedException {
		
		// Getting actual email id from .properties file
//		String actualEmail = BaseClass.getProperties().getProperty("email");
		
		//Getting email id and username from myaccount section of beCognizant portal
		List<String> userDetails = validation.getUserDetails();
		WriteExcelData.writeUserDetails(userDetails, excelFilePath);
		// to check if actual email and email from myaccount is same or not

		
		System.out.println("\nThe user id of Employee is: " + userDetails.get(0));
		System.out.println("The username of Employee is: " + userDetails.get(1));
		
	}
}
