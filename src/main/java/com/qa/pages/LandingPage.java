package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LandingPage extends TestBase{
	//Page factory OR
	@FindBy(xpath = "//div[@class = 'card-body']/h5[contains(text(),'Elements')]")
	WebElement Elements;
	
	@FindBy(xpath = "//div[@class = 'card-body']/h5[contains(text(),'Forms')]")
	WebElement Forms;
	
	@FindBy(xpath = "//div[@class = 'card-body']/h5[contains(text(),'Alerts, Frame & Windows')]")
	WebElement Alerts;
	
	@FindBy(xpath = "//div[@class = 'card-body']/h5[contains(text(),'Widgets')]")
	WebElement Widgets;
	
	@FindBy(xpath = "//div[@class = 'card-body']/h5[contains(text(),'Interactions')]")
	WebElement Interaction;
	
	@FindBy(xpath = "//img[contains(@src, '/images/Toolsqa.jpg')]")
	WebElement logo;
	
public LandingPage() {
	PageFactory.initElements(driver, this);
}
	
public String validateLandingPageTitle() {
	return driver.getTitle();
}

public boolean validateLogo() {
	return logo.isDisplayed();
	
}


public ElementsPage openElementsPage() {
	Elements.click();
	return new ElementsPage();
}

public AlertsWindowsPage openAlertsWindowsPage() {
	Alerts.click();
	return new AlertsWindowsPage();
}

public FormsPage openFormsPage() {
	Forms.click();
	return new FormsPage();
}

public InteractionPage openInteractionPage() {
	Interaction.click();
	return new InteractionPage();
}

public WidgetsPage openWidgetsPage() {
	Elements.click();
	return new WidgetsPage();
}



}
