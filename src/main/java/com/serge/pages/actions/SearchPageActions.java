package com.serge.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.serge.pages.locators.SearchPageLocators;
import com.serge.utils.SeleniumDriver;

public class SearchPageActions {

	SearchPageLocators serachPageLocators = null;

	public SearchPageActions() {

		this.serachPageLocators = new SearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), serachPageLocators);
	}

	public void selectCarMake(String carMake) {

		Select make = new Select(serachPageLocators.makeSelect);
		make.selectByVisibleText(carMake);

	}

	public void selectCarModel(String carModel) {

		Select make = new Select(serachPageLocators.modelSelect);
		make.selectByVisibleText(carModel);

	}

	public void selectCarLocation(String carLocation) {

		Select make = new Select(serachPageLocators.locationSelect);
		make.selectByVisibleText(carLocation);

	}

	public void selectCarMaxPrice(String carMaxPrice) {

		Select make = new Select(serachPageLocators.priceMaxSelect);
		make.selectByVisibleText(carMaxPrice);

	}

	public void clickFindMyNextCarButton() {
		
		serachPageLocators.findMyNextCarButton.click();
		
	}
	

}
