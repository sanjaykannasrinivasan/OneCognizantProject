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
import pageObjects.HeaderPage;
import utilities.WriteExcelData;

public class HeaderSteps {

	WebDriver driver;
	HeaderPage header;

	String excelFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata.xlsx";

	@When("user click on Company header")
	public void user_click_on_company_header() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver = BaseClass.getDriver();
		header = new HeaderPage(driver);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), \"Company\")]")));
		header.clickCompany();
	}

	@Then("user stores all header features displayed in Company header")
	public void user_stores_all_header_features_displayed_in_company_header() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<String> companyFeature = header.getCompanyData();
		header.printCompanyData();

		WriteExcelData.writeCompanyHeaderFeatures(companyFeature, excelFilePath);
	}

	@When("user click on Service Lines")
	public void user_click_on_service_lines() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		header.clickServiceLines();
	}

	@Then("user stores all header features displayed in Service Lines")
	public void user_stores_all_header_features_displayed_in_service_lines() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<String> serviceLineFeature = header.getServiceLinesData();
		header.printServiceLinesData();

		WriteExcelData.writeServiceLineHeaderFeatures(serviceLineFeature, excelFilePath);
		List<List<String>> subServiceHeader = header.getSubServiceLinesData();
		WriteExcelData.writeSubServiceLineHeaderFeatures(subServiceHeader, excelFilePath);

	}

	@When("user click on Sales Resources")
	public void user_click_on_sales_resources() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		header.clickSalesResources();
	}

	@Then("user stores all header features displayed in Sales Resources")
	public void user_stores_all_header_features_displayed_in_sales_resources() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<String> SalesResourceFeature = header.getSalesResourcesData();
		header.printSalesResourcesData();

		WriteExcelData.writeSalesResourcesHeaderFeatures(SalesResourceFeature, excelFilePath);
	}

	@When("user click on Markets and Countries")
	public void user_click_on_markets_and_countries() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		header.clickMarketandCountries();
	}

	@Then("user stores all header features displayed in Markets and Countries")
	public void user_stores_all_header_features_displayed_in_markets_and_countries() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		List<String> marketandCountryFeature = header.getMarketandCountriesData();
		header.printMarketandCountriesData();

		List<List<String>> submarketheader = header.getSubMarketandCountriesData();
		WriteExcelData.writeMartketandCountryHeaderFeatures(marketandCountryFeature, submarketheader, excelFilePath);
	}

	@When("user click on Corporate Functions")
	public void user_click_on_corporate_functions() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		header.clickCorporateFunctions();
	}

	@Then("user stores all header features displayed in Corporate Functions")
	public void user_stores_all_header_features_displayed_in_corporate_functions() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<String> CorporateFunctionsFeature = header.getCorporateFunctionsData();
		header.printCorporateFunctionsData();

		List<List<String>> subcorporateheader = header.getSubCorporateFunctionsData();
		WriteExcelData.writeCorporateHeaderFeatures(CorporateFunctionsFeature, subcorporateheader, excelFilePath);
	}

	@When("user click on People")
	public void user_click_on_people() {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		header.clickPeople();
	}

	@Then("user stores all header features displayed in People")
	public void user_stores_all_header_features_displayed_in_people() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<String> PeopleFeature = header.getPeopleData();
		header.printPeopleData();

		WriteExcelData.writePeopleHeaderFeatures(PeopleFeature, excelFilePath);
	}
}