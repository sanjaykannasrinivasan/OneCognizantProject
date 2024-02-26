package stepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	WebDriver driver;
	Properties p;

	@Before
	public void setup() throws IOException {
		p = BaseClass.getProperties();
		driver = BaseClass.initilizeBrowser();
		driver.get(p.getProperty("baseUrl"));
		driver.manage().window().maximize();
	}

	@AfterStep
	public void Screenshot(Scenario scenario) {
		if (!scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
