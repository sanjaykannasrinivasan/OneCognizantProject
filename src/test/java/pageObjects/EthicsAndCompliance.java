package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EthicsAndCompliance extends BasePage {
	public EthicsAndCompliance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Initialising list to store the data of beCognizant Ethics and Compliance
	// features
	String ethicsComplianceHeading;

	List<String> resourcesLinks = new ArrayList<>();
	List<String> ethicsCompliancFocusAreas = new ArrayList<>();
	List<String> headingDetails = new ArrayList<>();
	List<String> ethicsRisk = new ArrayList<>();
	List<String> buSpecificRisk = new ArrayList<>();
	List<String> ethicsAndComplianceRisk = new ArrayList<>();
	List<String> complianceProgramData = new ArrayList<>();

	// Storing WEebElement of Corporate function
	@FindBy(xpath = "//span[contains(text(),\"Corporate Functions\")] ")
	WebElement corporate;

	// Storing WebElement of Legal&Corporate Affairs
	@FindBy(xpath = "//span[contains(text(),'Legal & Corporate Affairs')]")
	WebElement legal;

	// Storing WebElement of Ethics and Compliance
	@FindBy(xpath = "//span[contains(text(),'Ethics and Compliance')]")
	WebElement ethicsHeader;

	// Storing the links in Ethics and Compliance page
	@FindBy(xpath = "//a[starts-with(@class,'ButtonCard')]/div/div[2]/div")
	List<WebElement> resourcesLink;

	@FindBy(xpath = "//div[@id=\"title_text\"]")
	WebElement ethicsHeading;

	@FindBy(xpath = "//div[@data-automation-id=\"personaDetails\"]")
	List<WebElement> directorlist;

	@FindBy(xpath = "(//figcaption[@data-automation-id=\"captionElement-imageRead\"]/span)[1]")
	WebElement chiefOfficer;

	@FindBy(xpath = "//*[@id='8428faf2-1a3a-4f0a-9e89-19ee589a426d']//p[1]")
	WebElement text1;

	@FindBy(xpath = "//*[@id='8428faf2-1a3a-4f0a-9e89-19ee589a426d']//p[2]")
	WebElement text2;

	@FindBy(xpath = "//*[@id=\"8428faf2-1a3a-4f0a-9e89-19ee589a426d\"]//li")
	List<WebElement> fivecontent;

	@FindBy(xpath = "//div[@id=\"8428faf2-1a3a-4f0a-9e89-19ee589a426d\"]//p[3]")
	WebElement text3;

	// Storing WebElement for scrolling
	@FindBy(xpath = "(//p[starts-with(text(),'We foster')])")
	WebElement scroll;

	@FindBy(xpath = "//div[starts-with(@id,\"a8b4ad54\")]")
	WebElement scrollfocusarea;

	// Storing WebElement of Ethics & Compliance Risks
	@FindBy(xpath = "(//h2[text()='Ethics & Compliance Risks'])")
	WebElement element;

	@FindBy(xpath = "//p[starts-with(text(),'Risk')]")
	WebElement ethicsRiskText;

	@FindBy(xpath = "//div[starts-with(@id,'c103d685')]//li")
	List<WebElement> buSpecificRiskList;

	@FindBy(xpath = "//div[starts-with(@id,'72c8bd9f')]//li")
	List<WebElement> ethicsComlianceRiskList;

	public void clickCorporateAndFunction() throws InterruptedException {
		corporate.click();
	}

	public void getLegalCorporateAffairs() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(legal).build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void clickEthicsAndCompliance() throws InterruptedException {
		Thread.sleep(3000);
		ethicsHeader.click();
	}

	public boolean checkEthicsAndComplianceHeading() {
		return ethicsHeading.isDisplayed();
	}

	public void printDirectorDetails() {

		System.out.println("\nDirector details are displayed below: ");
		for (WebElement ele : directorlist) {
			String data = ele.getText();
			System.out.println(data);
		}
	}

	public List<String> getResourcesLink() {
		resourcesLinks.clear();
		for (WebElement ele : resourcesLink) {
			String link = ele.getText();
			resourcesLinks.add(link);
		}
		return resourcesLinks;
	}

	public void printResourcesLink() {
		List<String> resoureceLink = getResourcesLink();
		System.out.println("\nAll resources links are displayed below: ");
		for (int i = 0; i < resoureceLink.size(); i++) {
			System.out.println((i + 1) + ". " + resoureceLink.get(i));
		}
	}

	public void scrollToCompliance() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = scroll;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public List<String> getComplianceProgramData() {
		complianceProgramData.clear();

		complianceProgramData.add(chiefOfficer.getText());
		complianceProgramData.add(text1.getText());
		complianceProgramData.add(text2.getText());
		for (WebElement ele : fivecontent) {
			String data = ele.getText();
			complianceProgramData.add(data);
		}
		complianceProgramData.add(text3.getText());

		return complianceProgramData;
	}

	public void printComplianceProgramData() {
		List<String> complianceData = getComplianceProgramData();
		System.out.println("\nAll details of compliance Program");
		for (int i = 0; i < complianceData.size(); i++) {
			System.out.println((i + 1) + ". " + complianceData.get(i));
		}
	}

	public void scrollToFocusAreas() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = scrollfocusarea;
		js.executeScript("arguments[0].scrollIntoView();", scroll);
	}

	public void scrollToRisk() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = element;
		js.executeScript("arguments[0].scrollIntoView();", scroll);
	}

	public void clickComplianceRisks() throws InterruptedException {
		Thread.sleep(3000);
		element.click();
	}

	public void printEthicsComplianceRiskText() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("\nEthics & Compliance");
		System.out.println(ethicsRiskText.getText());
	}

	public List<String> getBUSpecificRisk() {
		buSpecificRisk.clear();
		for (WebElement ele : buSpecificRiskList) {
			String data = ele.getText();
			buSpecificRisk.add(data);
		}
		return buSpecificRisk;
	}

	public void printBUSpecificRisk() {
		List<String> buSpeceficRisks = getBUSpecificRisk();
		System.out.println("\nIndustry / BU-Specific Compliance Risks");
		for (int i = 0; i < buSpeceficRisks.size(); i++) {
			System.out.println((i + 1) + ". " + buSpeceficRisks.get(i));
		}
	}

	public List<String> getEthicsComplianceRisk() {
		ethicsAndComplianceRisk.clear();
		for (WebElement ele : ethicsComlianceRiskList) {
			String data = ele.getText();
			ethicsAndComplianceRisk.add(data);
		}
		return ethicsAndComplianceRisk;
	}

	public void printEthicsComplianceRisk() {
		List<String> ethicsComplianceRisk = getEthicsComplianceRisk();
		System.out.println("\nEthics & Compliance Risks");
		for (int i = 0; i < ethicsComplianceRisk.size(); i++) {
			System.out.println((i + 1) + ". " + ethicsComplianceRisk.get(i));
		}
	}

}
