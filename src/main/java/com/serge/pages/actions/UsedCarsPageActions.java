package com.serge.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.serge.pages.locators.UsedCarsSearchPageLocators;
import com.serge.utils.SeleniumDriver;

public class UsedCarsPageActions {

	UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;
	
	public UsedCarsPageActions() {
		
		this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}
	
	public void selectCarModel(String carModel) {

		Select make = new Select(usedCarsSearchPageLocators.modelSelect);
		make.selectByVisibleText(carModel);

	}
	
	
}
