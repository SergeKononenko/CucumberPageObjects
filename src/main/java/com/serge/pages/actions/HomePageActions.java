package com.serge.pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.serge.pages.locators.HomePageLocators;
import com.serge.utils.SeleniumDriver;

public class HomePageActions {

	HomePageLocators homePageLocators = null;

	public HomePageActions() {

		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}

	public void moveToBuyPlusSellMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.buyPlusSellLink).perform();
		SeleniumDriver.getWait().until(ExpectedConditions.visibilityOf(homePageLocators.buyPlusSellLink));
	}

	public SearchPageActions clickSearchCarsLink() {

		//moveToBuyPlusSellMenu();
		homePageLocators.searchCarsLink.click();
		return new SearchPageActions();
	}

	public void clickUsedLink() {

		//moveToBuyPlusSellMenu();
		homePageLocators.usedLink.click();
	}

	public void clickSellMyCarLink() {

		//moveToBuyPlusSellMenu();
		homePageLocators.sellMyCarLinkLink.click();
	}

}
