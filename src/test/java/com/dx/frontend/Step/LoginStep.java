package com.dx.frontend.Step;

import com.dx.frontend.Hooks;
import com.dx.frontend.pageObj.searchPgaeObject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;

/**
 * Created by coco.lee on 7/06/2018.
 */

public class LoginStep {

    private WebDriver driver;

    private searchPgaeObject searchPgaeObject;

  
    public LoginStep() {
        driver = Hooks.driver;        
        searchPgaeObject = new searchPgaeObject(driver);
    }

    @SuppressWarnings("deprecation")
	@Given("^navigate to search page by \"([^\"]*)\"$")
    public void navigate_to_search_page_by(String link) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.get(link);
    }

    @SuppressWarnings("deprecation")
	@When("^I input \"([^\"]*)\" in search box and click search button$")
    public void i_input_in_search_box_and_click_search_button(String text) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.switchTo().alert().accept();
    	driver.switchTo().frame(0);
    	searchPgaeObject.waitSearchPageIsDisplay();
    	searchPgaeObject.enterTextInSearchBox(text);
    	searchPgaeObject.clickSearchIcon();
    }

    @SuppressWarnings("deprecation")
	@Then("^The search results is display$")
    public void the_search_results_is_display() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchPgaeObject.resultList();
    }

    @When("^I skip to the second page$")
    public void i_skip_to_the_second_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchPgaeObject.scrollToViewPort(searchPgaeObject.nextBottn());
        searchPgaeObject.clickNextButton();
    }

    @Then("^Print the title and link of the result$")
    public void print_the_title_and_link_of_the_result() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        searchPgaeObject.printSearchResults();
//        searchPgaeObject.printSearchLinks();
    }

    @Then("^Count the number of times printed$")
    public void count_the_number_of_times_printed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @SuppressWarnings("deprecation")
   	@When("^I scroll to Top and research \"([^\"]*)\"$")
       public void i_scroll_to_top_and_research(String text) throws Throwable {
           // Write code here that turns the phrase above into concrete actions
       	searchPgaeObject.scrollToTop();
       	searchPgaeObject.clearText();
       	searchPgaeObject.enterTextInSearchBox(text);
       	searchPgaeObject.clickGoIcon();
       }
 
}
