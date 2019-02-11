package com.serge.steps;

import java.util.List;

import com.serge.pages.actions.HomePageActions;
import com.serge.pages.actions.UsedCarsPageActions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class UsedCarsSteps {

	HomePageActions homePageActions = new HomePageActions();
	UsedCarsPageActions usedCarsPageActions = new UsedCarsPageActions();
	//SearchPageActions searchPageActions = new SearchPageActions();
	
	@And("^click \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
	    homePageActions.clickUsedLink();
	}
	
	@When("^select car model$")
	public void select_car_model(List<String> list) throws Throwable {
	   
		String carModel = list.get(1);
		usedCarsPageActions.selectCarModel(carModel);
	}
	
}
