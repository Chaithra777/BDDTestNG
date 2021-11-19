package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {
	WebDriver driver;

	@Given("I launch google page")
	public void i_launch_google_page() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	}

	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
	    driver.findElement(By.name("q")).sendKeys("Java Tutorial");
	    driver.findElement(By.name("q")).submit();
	}
	@Then("should display java result page")
	public void should_display_java_result_page() {
	    String pageTitle=driver.getTitle();
	    Assert.assertEquals("Java Tutorial - Google Search", pageTitle);
	}
	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
	}
	
	@When("I search Cypress Tutorial")
	public void i_search_cypress_tutorial() {
		driver.findElement(By.name("q")).sendKeys("Cypress Tutorial");
	    driver.findElement(By.name("q")).submit();
	}

	@Then("should display Cypress result page")
	public void should_display_cypress_result_page() {
		String pageTitle=driver.getTitle();
	    Assert.assertEquals("Cypress Tutorial - Google Searc", pageTitle);
	}
}
