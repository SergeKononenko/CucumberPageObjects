package com.serge.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

	@FindBy(how = How.LINK_TEXT, using = "buy + sell")
	public WebElement buyPlusSellLink;
	
	@FindBy(how = How.LINK_TEXT, using = "reviews")
	public WebElement reviewsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Search Cars")
	public WebElement searchCarsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Used")
	public WebElement usedLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Sell my car")
	public WebElement sellMyCarLinkLink;
	
	
}
