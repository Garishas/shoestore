package com.shoestore.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.shoestore.tests.HomePageTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class HomePage  
{
	@Given("^user is logged onto the shoestore home page$")
	public void open_Application_and_Enter_url_1() throws Throwable {
		HomePageTest.driver.get("http://shoe-store-july.herokuapp.com/");
	  
	}
	
/*	@When("^I open shoestore website$")
	public void open_Application() throws Throwable {
		HomePageTest.driver.get("http://shoe-store-july.herokuapp.com/");
	  
	}*/
	
	@Then("^I find Home button and print the html$")
	public void find_Browse_By_Home() throws Throwable {
		WebElement browseByMake = HomePageTest.driver.findElement(By.xpath("//a[text()='Home']"));
		System.out.println("Browse Home Link ="+browseByMake.getAttribute("outerHTML"));
	}
	

	@Then("^I find January link and print the html$")
	public void find_Browse_By_Januaury() throws Throwable {
		WebElement browseByJanuary = HomePageTest.driver.findElement(By.xpath("//a[text()='January']"));
		System.out.println("Browse January Link ="+browseByJanuary.getAttribute("outerHTML"));
	}
	
	@Then("^I find February Link and print the html$")
	public void find_Browse_By_February() throws Throwable {
		WebElement browseByFebruary = HomePageTest.driver.findElement(By.xpath("//a[text()='February']"));
		System.out.println("Browse February Link ="+browseByFebruary.getText());
	}
	
	@Then("^I find March Link and print the html$")
	public void find_Browse_By_March() throws Throwable {
		WebElement browseByMarch = HomePageTest.driver.findElement(By.xpath("//a[text()='March']"));
		System.out.println("Browse March Link ="+browseByMarch.getText());
	}
	
	@Then("^I find April Link and print the html$")
	public void find_Browse_By_April() throws Throwable {
		WebElement browseByApril = HomePageTest.driver.findElement(By.xpath("//a[text()='April']"));
		System.out.println("Browse April Link ="+browseByApril.getText());
	}
	
	@Then("^I find May Link and print the html$")
	public void find_Browse_By_May() throws Throwable {
		WebElement browseByMay = HomePageTest.driver.findElement(By.xpath("//a[text()='May']"));
		System.out.println("Browse May Link ="+browseByMay.getText());
	}
	
	
	@Then("^I find June Link and print the html$")
	public void find_Browse_By_June() throws Throwable {
		WebElement browseByJune = HomePageTest.driver.findElement(By.xpath("//a[text()='June']"));
		System.out.println("Browse June Link ="+browseByJune.getText());
	}
	
	@Then("^I find July Link and print the html$")
	public void find_Browse_By_July() throws Throwable {
		WebElement browseByJuly = HomePageTest.driver.findElement(By.xpath("//a[text()='July']"));
		System.out.println("Browse July Link ="+browseByJuly.getText());
	}

	@Then("^I find August Link and print the html$")
	public void find_Browse_By_August() throws Throwable {
		WebElement browseByAugust = HomePageTest.driver.findElement(By.xpath("//a[text()='July']"));
		System.out.println("Browse August Link ="+browseByAugust.getText());
	}
	
	@Then("^I find September Link and print the html$")
	public void find_Browse_By_September() throws Throwable {
		WebElement browseBySeptember = HomePageTest.driver.findElement(By.xpath("//a[text()='September']"));
		System.out.println("Browse September Link ="+browseBySeptember.getText());
	}
	
	@Then("^I find October Link and print the html$")
	public void find_Browse_By_October() throws Throwable {
		WebElement browseByOctober = HomePageTest.driver.findElement(By.xpath("//a[text()='October']"));
		System.out.println("Browse October Link ="+browseByOctober.getText());
	}
	
	
	@Then("^I find November Link and print the html$")
	public void find_Browse_By_November() throws Throwable {
		WebElement browseByNovember = HomePageTest.driver.findElement(By.xpath("//a[text()='November']"));
		System.out.println("Browse November Link ="+browseByNovember.getText());
	}
	
	@Then("^I find December Link and print the html$")
	public void find_Browse_By_December() throws Throwable {
		WebElement browseByDecember = HomePageTest.driver.findElement(By.xpath("//a[text()='December']"));
		System.out.println("Browse December Link ="+browseByDecember.getText());
	}
	
	@Then("^I find All Shoes Link and print the html$")
	public void find_Browse_By_All_Shoes() throws Throwable {
		WebElement browseByAllShoes = HomePageTest.driver.findElement(By.xpath("//a[text()='All Shoes']"));
		System.out.println("Browse All Shoes Link ="+browseByAllShoes.getText());
	}
	
	@Then("^I find remind email input and print the html$")
	public void find_remindEmailInput() throws Throwable {
		WebElement remindEmailInput = HomePageTest.driver.findElement(By.xpath("//input[@id='remind_email_input']"));
		System.out.println("Browse remind email input ="+remindEmailInput.getAttribute("id"));
	}
	
	@Then("^I find remind email submit button and print the html$")
	public void find_remindEmailSubmitButton() throws Throwable {
		WebElement remindEmailSubmitButton = HomePageTest.driver.findElement(By.xpath("//input[@id='remind_email_submit']"));
		System.out.println("Browse remind email submit Button ="+remindEmailSubmitButton.getAttribute("id"));
	}
	
	@Then("^I find promo code input and print the html$")
	public void find_promoCodeInput() throws Throwable {
		WebElement promoCodeInput = HomePageTest.driver.findElement(By.xpath("//input[@id='promo_code_input']"));
		System.out.println("Browse promo code input ="+promoCodeInput.getAttribute("id"));
	}
	
	@Then("^I find promo code submit button and print the html$")
	public void find_promoCodeSubmitButton() throws Throwable {
		WebElement promoCodeSubmitButton = HomePageTest.driver.findElement(By.xpath("//input[@id='promo_code_submit']"));
		System.out.println("Browse promo code submit button ="+promoCodeSubmitButton.getAttribute("id"));
	}
	
	@Then("^I find choose a brand select and print the html$")
	public void find_chooseaBrandSelect() throws Throwable {
		WebElement chooseaBrandSelect = HomePageTest.driver.findElement(By.xpath("//select[@id='brand']"));
		System.out.println("Browse choose a brand select ="+chooseaBrandSelect.getAttribute("value"));
	}
	
	@Then("^I find choose a brand search button and print the html$")
	public void find_chooseaBrandSearchButton() throws Throwable {
		WebElement chooseaBrandSearchButton = HomePageTest.driver.findElement(By.xpath("//input[@id='search_button']"));
		System.out.println("Browse choose a brand search button ="+chooseaBrandSearchButton.getAttribute("value"));
	}
	
	
	
	
	
	

	@When("^enter username$")
	public void enter_username() throws Throwable {
		HomePageTest.driver.findElement(By.xpath("//button[@data-qaid='lnk-browseByMake']")).isDisplayed();
		//Boolean isPresent = driver.findElements(By.yourLocator).size() > 0
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		HomePageTest.driver.findElement(By.id("password")).sendKeys("Admin123");
		HomePageTest.driver.findElement(By.id("Inpatient Ward")).click();
		HomePageTest.driver.findElement(By.id("loginButton")).click();
	}

	@Then("^verify Msg$")
	public void verify_Msg() throws Throwable {
	   boolean result =  HomePageTest.driver.findElement(By.tagName("h4")).getText().contains("Logged");
	   Assert.assertTrue(result);
	}
	
	
}