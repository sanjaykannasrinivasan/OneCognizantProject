package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

	public HeaderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Initialising list to store the data of beCognizant header features

	List<String> companyData = new ArrayList<>();

	List<String> serviceLinesData = new ArrayList<>();
	List<List<String>> subserviceLinesData = new ArrayList<>();

	List<String> salesRessourcesData = new ArrayList<>();

	List<String> marketAndCountriesData = new ArrayList<>();
	List<List<String>> submarketAndCountriesData = new ArrayList<>();

	List<String> corporateFunctionsData = new ArrayList<>();
	List<List<String>> subcorporateFunctionsData = new ArrayList<>();

	List<String> peopleData = new ArrayList<>();
	List<List<String>> subpeopleData = new ArrayList<>();

	// Stroring web elements for performing actions on beCognizant portal

	@FindBy(xpath = "//ul[starts-with(@class, \"ms-ContextualMenu-list\")]/li//span")
	List<WebElement> featureslist;

	@FindBy(xpath = "//div[starts-with(@id, 'ContextualMenu')]/div/ul/li//span")
	List<WebElement> subfeatureslist;

	@FindBy(xpath = "(//div[starts-with(@class, \"ms-Layer ms-Layer\")])[3]//ul/li//span")
	List<WebElement> subsubfeatureslist;

	// storing web elements of Company header
	@FindBy(xpath = "//span[contains(text(), \"Company\")]")
	WebElement company;

	// storing web elements of Service Lines header
	@FindBy(xpath = "//span[contains(text(), \"Service Lines\")]")
	WebElement service;

	// storing web elements of sub header Service Lines
	@FindBy(xpath = "//span[contains(text(), 'Core Technologies & Insights (CT&I)')]")
	WebElement subservice1;

	@FindBy(xpath = "//span[contains(text(), 'Software & Platform Engineering (SPE)')]")
	WebElement subservice2;

	// storing web elements of Sales Resources header
	@FindBy(xpath = "//span[contains(text(), \"Sales Resources\")]")
	WebElement salesresource;

	// storing web elements of Markets and Countries header
	@FindBy(xpath = "//span[contains(text(), \"Markets and Countries\")]")
	WebElement marketandcountries;

	// storing web elements of sub header of Markets and Countries
	@FindBy(xpath = "//span[contains(text(), 'Americas')]")
	WebElement submarket1;

	@FindBy(xpath = "//span[contains(text(), 'Asia Pacific and Japan')]")
	WebElement submarket2;

	@FindBy(xpath = "//span[contains(text(), 'Europe, the Middle East and Africa')]")
	WebElement submarket3;

	// storing web elements of last sub header of Market and Countries
	@FindBy(xpath = "//*[text()='Countries']")
	WebElement subsubmarket1;

	@FindBy(xpath = "//*[text()='Countries (EMEA)']")
	WebElement subsubmarket2;

	@FindBy(xpath = "//*[text()='Central Europe Deal Management']")
	WebElement subsubmarket3;

	@FindBy(xpath = "//*[text()='Products and Resources (P&R)']")
	WebElement subsubmove1;

	// storing web elements of Corporate Functions header
	@FindBy(xpath = "//span[contains(text(), \"Corporate Functions\")]")
	WebElement corporatefunctions;

	// storing web elements of sub header of Corporate Functions
	@FindBy(xpath = "//span[contains(text(), 'Finance')]")
	WebElement subcorporate1;

	@FindBy(xpath = "//span[contains(text(), 'Legal & Corporate Affairs')]")
	WebElement subcorporate2;

	@FindBy(xpath = "//span[contains(text(), 'Marketing')]")
	WebElement subcorporate3;

	@FindBy(xpath = "//span[contains(text(), 'Security and Technology')]")
	WebElement subcorporate4;

	// storing web elements of last sub header of Corporate Functions
	@FindBy(xpath = "//*[text()='Corporate Real-Estate Workplace Services']")
	WebElement subsubcorporate1;

	@FindBy(xpath = "//*[text()='Contract Lifecycle Risk Management']")
	WebElement subsubcorporate2;

	@FindBy(xpath = "//*[text()='Procurement']")
	WebElement subcorporatemove;

	@FindBy(xpath = "//*[text()='Client Experience']")
	WebElement subsubcorporate3;

	@FindBy(xpath = "//*[text()='Human Resources']")
	WebElement subsubcorporate4;

	// storing web elements of Poeple header
	@FindBy(xpath = "//button[@name=\"People\"]")
	WebElement people;

	// storing web elements of sub header of Poeple
	@FindBy(xpath = "//span[contains(text(), 'Careers')]")
	WebElement subpeople1;

	@FindBy(xpath = "//span[contains(text(), 'Diversity and Inclusion')]")
	WebElement subpeople2;

	@FindBy(xpath = "//span[contains(text(), 'Rewards, Life and Work')]")
	WebElement subpeople3;

	// clicking on Company header
	public void clickCompany() {
		company.click();
	}

	// Storing all sub headers of Company header
	public List<String> getCompanyData() {
		companyData.clear();
		for (WebElement ele : featureslist) {
			String data = ele.getText();
			companyData.add(data);
		}
		return companyData;
	}

	// clicking on Service Lines header
	public void clickServiceLines() {
		service.click();
	}

	// Storing all sub headers of Service Lines header
	public List<String> getServiceLinesData() throws InterruptedException {
		serviceLinesData.clear();
		for (WebElement ele : featureslist) {
			String data = ele.getText();
			serviceLinesData.add(data);
		}
		return serviceLinesData;
	}

	// Storing all headers inside sub headers of Service Lines header
	public List<List<String>> getSubServiceLinesData() throws InterruptedException {
		List<String> list1 = new ArrayList<>();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(subservice1).build().perform();

		// Clear list1 before populating it
		list1.clear();
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list1.add(data);
		}
		subserviceLinesData.add(new ArrayList<>(list1));

		List<String> list2 = new ArrayList<>();
		action.moveToElement(subservice2).build().perform();

		// Clear list2 before populating it
		list2.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list2.add(data);
		}
		subserviceLinesData.add(new ArrayList<>(list2));

		return subserviceLinesData;
	}

	// clicking on Sales Resources header
	public void clickSalesResources() {
		salesresource.click();
	}

	// Storing all sub headers of Sales Resources header
	public List<String> getSalesResourcesData() {
		salesRessourcesData.clear();
		for (WebElement ele : featureslist) {
			String data = ele.getText();
			salesRessourcesData.add(data);
		}
		return salesRessourcesData;
	}

	// clicking on Market and Countries header
	public void clickMarketandCountries() {
		marketandcountries.click();
	}

	// Storing all sub headers of Market and Countries header
	public List<String> getMarketandCountriesData() {
		marketAndCountriesData.clear();
		for (WebElement ele : featureslist) {
			String data = ele.getText();
			marketAndCountriesData.add(data);
		}
		return marketAndCountriesData;
	}

	// Storing all headers inside sub headers of Market and Countries header
	public List<List<String>> getSubMarketandCountriesData() throws InterruptedException {
		submarketAndCountriesData.clear();
		List<String> list1 = new ArrayList<>();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(submarket1).build().perform();

		// Clear list1 before populating it
		list1.clear();
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list1.add(data);
		}
		submarketAndCountriesData.add(new ArrayList<>(list1));
		Thread.sleep(3000);
		// sub sub countries
		List<String> list21 = new ArrayList<>();
		action.moveToElement(subsubmarket1).build().perform();
		list21.clear();
		Thread.sleep(2000);
		for (WebElement ele : subsubfeatureslist) {
			String data = ele.getText();
			list21.add(data);
		}
		submarketAndCountriesData.add(new ArrayList<>(list21));
		action.moveToElement(subsubmove1).build().perform();
		Thread.sleep(2000);
		List<String> list2 = new ArrayList<>();
		action.moveToElement(submarket2).build().perform();

		// Clear list2 before populating it
		list2.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list2.add(data);
		}
		submarketAndCountriesData.add(new ArrayList<>(list2));

		List<String> list3 = new ArrayList<>();
		action.moveToElement(submarket3).build().perform();

		// Clear list3 before populating it
		list3.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list3.add(data);
		}
		submarketAndCountriesData.add(new ArrayList<>(list3));

		List<String> list23 = new ArrayList<>();
		action.moveToElement(subsubmarket2).build().perform();
		list23.clear();
		Thread.sleep(2000);
		for (WebElement ele : subsubfeatureslist) {
			String data = ele.getText();
			list23.add(data);
		}
		submarketAndCountriesData.add(new ArrayList<>(list23));
		action.moveToElement(subsubmarket3).build().perform();

		return submarketAndCountriesData;
	}

	// clicking on Corporate Functions header
	public void clickCorporateFunctions() {
		corporatefunctions.click();
	}

	// Storing all sub headers of Corporate Functions header
	public List<String> getCorporateFunctionsData() {
		corporateFunctionsData.clear();
		for (WebElement ele : featureslist) {
			String data = ele.getText();
			corporateFunctionsData.add(data);
		}
		return corporateFunctionsData;
	}

	// Storing all headers inside sub headers of Corporate Functions header
	public List<List<String>> getSubCorporateFunctionsData() throws InterruptedException {
		subcorporateFunctionsData.clear();
		List<String> list1 = new ArrayList<>();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(subcorporate1).build().perform();

		// Clear list1 before populating it
		list1.clear();
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list1.add(data);
		}
		subcorporateFunctionsData.add(new ArrayList<>(list1));

		List<String> list2 = new ArrayList<>();
		action.moveToElement(subcorporate2).build().perform();

		// Clear list2 before populating it
		list2.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list2.add(data);
		}
		subcorporateFunctionsData.add(new ArrayList<>(list2));

		// creating list21 to store last subheader data of respective header
		List<String> list21 = new ArrayList<>();
		action.moveToElement(subsubcorporate1).build().perform();
		list21.clear();
		Thread.sleep(2000);
		for (WebElement ele : subsubfeatureslist) {
			String data = ele.getText();
			list21.add(data);
		}
		subcorporateFunctionsData.add(new ArrayList<>(list21));

		// creating list22 to store last subheader data of respective header
		List<String> list22 = new ArrayList<>();
		action.moveToElement(subsubcorporate2).build().perform();
		list22.clear();
		Thread.sleep(2000);
		for (WebElement ele : subsubfeatureslist) {
			String data = ele.getText();
			list22.add(data);
		}
		subcorporateFunctionsData.add(new ArrayList<>(list22));

		action.moveToElement(subcorporatemove).perform();
		List<String> list3 = new ArrayList<>();
		action.moveToElement(subcorporate3).build().perform();

		// Clear list3 before populating it
		list3.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list3.add(data);
		}
		subcorporateFunctionsData.add(new ArrayList<>(list3));

		// creating list23 to store last subheader data of respective header
		List<String> list23 = new ArrayList<>();
		action.moveToElement(subsubcorporate3).build().perform();
		list23.clear();
		Thread.sleep(2000);
		for (WebElement ele : subsubfeatureslist) {
			String data = ele.getText();
			list23.add(data);
		}
		subcorporateFunctionsData.add(new ArrayList<>(list23));

		action.moveToElement(subsubcorporate4).build().perform();
		Thread.sleep(3000);
		List<String> list4 = new ArrayList<>();
		action.moveToElement(subcorporate4).build().perform();

		// Clear list4 before populating it
		list4.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list4.add(data);
		}
		subcorporateFunctionsData.add(new ArrayList<>(list4));

		return subcorporateFunctionsData;
	}

	// clicking on People header
	public void clickPeople() {
		people.click();
	}

	// Storing all sub headers of People header
	public List<String> getPeopleData() {
		peopleData.clear();
		for (WebElement ele : featureslist) {
			String data = ele.getText();
			peopleData.add(data);
		}
		return peopleData;
	}

	// Storing all headers inside sub headers of People header
	public List<List<String>> getSubPeopleData() throws InterruptedException {
		subpeopleData.clear();
		List<String> list1 = new ArrayList<>();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(subpeople1).build().perform();

		// Clear list1 before populating it
		list1.clear();
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list1.add(data);
		}
		subpeopleData.add(new ArrayList<>(list1));

		List<String> list2 = new ArrayList<>();
		action.moveToElement(subpeople2).build().perform();

		// Clear list2 before populating it
		list2.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list2.add(data);
		}
		subpeopleData.add(new ArrayList<>(list2));

		List<String> list3 = new ArrayList<>();
		action.moveToElement(subpeople3).build().perform();

		// Clear list3 before populating it
		list3.clear();
		Thread.sleep(2000);
		for (WebElement ele : subfeatureslist) {
			String data = ele.getText();
			list3.add(data);
		}
		subpeopleData.add(new ArrayList<>(list3));
		return subpeopleData;
	}

	// Created different methods to print all the headers

	// This method will print data inside the Company header
	public void printCompanyData() {
		List<String> companyData = getCompanyData();
		System.out.println("\nAll features present in Company header :");
		for (int i = 0; i < companyData.size(); i++) {
			System.out.println((i + 1) + ". " + companyData.get(i));
		}
	}

	// This method will print data inside the Service Lines header
	public void printServiceLinesData() throws InterruptedException {

		List<String> serviceLinesData = getServiceLinesData();
		List<List<String>> subserviceLinesdata = getSubServiceLinesData();

		System.out.println("\nAll features present in Service Lines header :");
		for (int i = 0; i < serviceLinesData.size(); i++) {
			System.out.println((i + 1) + ". " + serviceLinesData.get(i));

			// Adjust indices to prevent array index out of bounds
			if (i == 1) {
				for (int j = 0; j < subserviceLinesdata.get(0).size(); j++) {
					System.out.println("    " + (i + 1) + "." + (j + 1) + ". " + subserviceLinesdata.get(0).get(j));
				}
			} else if (i == 5) {
				for (int j = 0; j < subserviceLinesdata.get(1).size(); j++) {
					System.out.println("    " + (i + 1) + "." + (j + 1) + ". " + subserviceLinesdata.get(1).get(j));
				}
			}
		}
	}

	// This method will print data inside the Sales Resources header
	public void printSalesResourcesData() {
		List<String> salesResourcesData = getSalesResourcesData();
		System.out.println("\nAll features present in Sales Resources header :");
		for (int i = 0; i < salesResourcesData.size(); i++) {
			System.out.println((i + 1) + ". " + salesResourcesData.get(i));
		}
	}

	// This method will print data inside the Market and Countries header
	public void printMarketandCountriesData() throws InterruptedException {
		List<String> marketAndCountriesData = getMarketandCountriesData();
		List<List<String>> subMarketAndCountriesData = getSubMarketandCountriesData();
		System.out.println("\nAll features present in Market and Countries header :");
		for (int i = 0; i < marketAndCountriesData.size(); i++) {
			System.out.println((i + 1) + ". " + marketAndCountriesData.get(i));
			if (i == 0) {
				for (int j = 0; j < subMarketAndCountriesData.get(0).size(); j++) {
					System.out
							.println("    " + (i + 1) + "." + (j + 1) + ". " + subMarketAndCountriesData.get(0).get(j));
					if (j == 0)
						for (int k = 0; k < subMarketAndCountriesData.get(1).size(); k++) {
							System.out.println("      " + (i + 1) + "." + (j + 1) + "." + (k + 1) + ".  "
									+ subMarketAndCountriesData.get(1).get(k));
						}
				}
			} else if (i == 1) {
				for (int j = 0; j < subMarketAndCountriesData.get(2).size(); j++) {
					System.out
							.println("    " + (i + 1) + "." + (j + 1) + ". " + subMarketAndCountriesData.get(2).get(j));
				}
			} else if (i == 2) {
				for (int j = 0; j < subMarketAndCountriesData.get(3).size(); j++) {
					System.out
							.println("    " + (i + 1) + "." + (j + 1) + ". " + subMarketAndCountriesData.get(3).get(j));
					if (j == 0)
						for (int k = 0; k < subMarketAndCountriesData.get(4).size(); k++) {
							System.out.println("      " + (i + 1) + "." + (j + 1) + "." + (k + 1) + ".  "
									+ subMarketAndCountriesData.get(4).get(k));
						}
				}
			}
		}
	}

	// This method will print data inside the Corporate Functions header
	public void printCorporateFunctionsData() throws InterruptedException {
		List<String> corporateFunctionsData = getCorporateFunctionsData();
		List<List<String>> subcorporateFunctionsData = getSubCorporateFunctionsData();
		System.out.println("\nAll features present in Corporate Functions header :");
		for (int i = 0; i < corporateFunctionsData.size(); i++) {
			System.out.println((i + 1) + ". " + corporateFunctionsData.get(i));
			if (i == 0) {
				for (int j = 0; j < subcorporateFunctionsData.get(0).size(); j++) {
					System.out
							.println("    " + (i + 1) + "." + (j + 1) + ". " + subcorporateFunctionsData.get(0).get(j));
				}
			} else if (i == 2) {
				for (int j = 0; j < subcorporateFunctionsData.get(1).size(); j++) {
					System.out
							.println("    " + (i + 1) + "." + (j + 1) + ". " + subcorporateFunctionsData.get(1).get(j));
					if (j == 5) {
						for (int k = 0; k < subcorporateFunctionsData.get(2).size(); k++) {
							System.out.println("       " + (i + 1) + "." + (j + 1) + "." + (k + 1) + ". "
									+ subcorporateFunctionsData.get(2).get(k));
						}
					} else if (j == 6) {
						for (int k = 0; k < subcorporateFunctionsData.get(3).size(); k++) {
							System.out.println("       " + (i + 1) + "." + (j + 1) + "." + (k + 1) + ". "
									+ subcorporateFunctionsData.get(3).get(k));
						}
					}
				}
			} else if (i == 3) {
				for (int j = 0; j < subcorporateFunctionsData.get(4).size(); j++) {
					System.out
							.println("    " + (i + 1) + "." + (j + 1) + ". " + subcorporateFunctionsData.get(4).get(j));
					if (j == 3) {
						for (int k = 0; k < subcorporateFunctionsData.get(5).size(); k++) {
							System.out.println("       " + (i + 1) + "." + (j + 1) + "." + (k + 1) + ". "
									+ subcorporateFunctionsData.get(5).get(k));
						}
					}
				}
			} else if (i == 4) {
				for (int j = 0; j < subcorporateFunctionsData.get(6).size(); j++) {
					System.out
							.println("    " + (i + 1) + "." + (j + 1) + ". " + subcorporateFunctionsData.get(6).get(j));
				}
			}
		}
	}

	// This method will print data inside the People header
	public void printPeopleData() throws InterruptedException {
		List<String> peopleData = getPeopleData();
		List<List<String>> subpeopleData = getSubPeopleData();
		System.out.println("\nAll features present in People header :");
		for (int i = 0; i < peopleData.size(); i++) {
			System.out.println((i + 1) + ". " + peopleData.get(i));
			if (i == 1) {
				for (int j = 0; j < subpeopleData.get(0).size(); j++) {
					System.out.println("    " + (i + 1) + "." + (j + 1) + ". " + subpeopleData.get(0).get(j));
				}
			} else if (i == 2) {
				int j = 0;
				System.out.println("    " + (i + 1) + "." + (j + 1) + ". " + subpeopleData.get(1).get(j));
			} else if (i == 9) {
				for (int j = 0; j < subpeopleData.get(2).size(); j++) {
					System.out.println("    " + (i + 1) + "." + (j + 1) + ". " + subpeopleData.get(2).get(j));
				}
			}
		}
	}

}