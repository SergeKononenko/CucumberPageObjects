package com.serge.steps;

import java.util.List;

import org.testng.Assert;

import com.serge.pages.actions.HomePageActions;
import com.serge.pages.actions.SearchPageActions;
import com.serge.utils.SeleniumDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchCarsSteps {

	HomePageActions homePageActions = new HomePageActions();
	SearchPageActions searchPageActions;
	
	
	
	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void i_am_on_the_Home_Page_of_CarsGuide_Website(String url) throws Throwable {
	    
		SeleniumDriver.openPage(url);
		
	}

	@When("^I move to the Menu$")
	public void i_move_to_the_Menu(List<String> list) throws Throwable {
	    
		String menu = list.get(1);
		homePageActions.moveToBuyPlusSellMenu();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
	    searchPageActions = homePageActions.clickSearchCarsLink();
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_from_AnyMake_dropdown(String carMake) throws Throwable {
	    
		searchPageActions.selectCarMake(carMake);
		
	}

	@And("^select \"([^\"]*)\" as car model$")
	public void select_as_car_model(String carModel) throws Throwable {
		searchPageActions.selectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_from_SelectLocation_dropdown(String carLocation) throws Throwable {
		searchPageActions.selectCarLocation(carLocation);
	}

	@And("^select \"([^\"]*)\" as price$")
	public void select_as_price(String carMaxPrice) throws Throwable {
		searchPageActions.selectCarMaxPrice(carMaxPrice);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		searchPageActions.clickFindMyNextCarButton();
	}

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable {
	    
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
	    
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
}
