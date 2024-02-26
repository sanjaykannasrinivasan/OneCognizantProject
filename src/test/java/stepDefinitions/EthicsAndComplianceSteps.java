package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EthicsAndCompliance;
import utilities.WriteExcelData;

public class EthicsAndComplianceSteps {

	WebDriver driver;
	EthicsAndCompliance ethics;
	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";

	@When("user clicks on Corporate Function")
	public void user_clicks_on_Corporate_Function() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver = BaseClass.getDriver();
		ethics = new EthicsAndCompliance(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Corporate Functions\")]")));
		ethics.clickCorporateAndFunction();
	}

	@Then("user hover to Legal & Corporate Affairs")
	public void user_hover_to_legal_corporate_affairs() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ethics.getLegalCorporateAffairs();
	}

	@Then("user click on Ethics and Compliance")
	public void user_click_on_Ethics_and_Compliance() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ethics.clickEthicsAndCompliance();
	}

	@When("Ethics and Compliance page is visible to user")
	public void ethics_and_compliance_page_is_visible_to_user() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean check = ethics.checkEthicsAndComplianceHeading();
		System.out.println("Ethics & Compliance page is visible : " + check);
	}

	@Then("user prints the details of Director")
	public void user_prints_the_details_of_director() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ethics.printDirectorDetails();

		List<String> directorDetails = ethics.getComplianceProgramData();
		WriteExcelData.writeEthicsAndComplianceDetails(directorDetails, excelFilePath);
	}

	@Then("user prints all the links present in page")
	public void user_prints_all_the_links_present_in_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ethics.printResourcesLink();

		List<String> link = ethics.getResourcesLink();

		WriteExcelData.writeAllResourcesLink(link, excelFilePath);
	}

	@Then("user prints the details of EAC officer along with seven elements of ethics and compliance")
	public void user_prints_the_details_of_eac_officer_along_with_seven_elements_of_ethics_and_compliance() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ethics.scrollToCompliance();
		ethics.printComplianceProgramData();
	}

	@When("user clicks on Ethics and Compliance Risks")
	public void user_clicks_on_ethics_and_compliance_risks() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ethics.scrollToRisk();
		ethics.clickComplianceRisks();
	}

	@Then("user print all the risks present in the web page")
	public void user_print_all_the_risks_present_in_the_web_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		ethics.scrollToRisk();
		ethics.printEthicsComplianceRiskText();
		ethics.printBUSpecificRisk();
		ethics.printEthicsComplianceRisk();

		List<String> buSpecificRisk = ethics.getBUSpecificRisk();
		WriteExcelData.writeBUSpecificRisk(buSpecificRisk, excelFilePath);

		List<String> ethicsComplianceRisk = ethics.getEthicsComplianceRisk();
		WriteExcelData.writeEthicsAndComplianceRisk(ethicsComplianceRisk, excelFilePath);
	}
}
