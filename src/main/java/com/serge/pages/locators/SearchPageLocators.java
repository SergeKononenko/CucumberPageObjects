package com.serge.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPageLocators {

	@FindBy( id = "makes" )
	public WebElement makeSelect;
	
	@FindBy( id = "models" )
	public WebElement modelSelect;
	
	@FindBy( how = How.ID, id = "locations" )
	public WebElement locationSelect;
	
	@FindBy( how = How.XPATH, using = "//*[@id='price-max']" )
	public WebElement priceMaxSelect;
	
	@FindBy( how = How.CSS, using = "#search-submit" )
	public WebElement findMyNextCarButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
