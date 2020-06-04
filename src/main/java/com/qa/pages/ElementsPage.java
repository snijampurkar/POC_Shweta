package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ElementsPage extends TestBase{
	
@FindBy(xpath = "//div[@Class = 'main-header']")
WebElement pageheader;

@FindBy(xpath = "//div[@class='header-text'][contains(text(),'Elements')]")
WebElement openElements;

	@FindBy(xpath = "//span[@class='text'][contains(text(),'Text Box')]")
	WebElement TextBox;
		@FindBy(id = "userName")
		WebElement userName;
		@FindBy(id = "userEmail")
		WebElement userEmail;
		@FindBy(id = "currentAddress")
		WebElement currentAddress;
		@FindBy(id = "permanentAddress")
		WebElement permanentAddress;
		@FindBy(id = "submit")
		WebElement submit;

	
	@FindBy(xpath = "//span[@class='text'][contains(text(),'Check Box')]")
	WebElement CheckBox;	
	
		@FindBy(xpath = "//button[@title='Collapse all']")
		WebElement collapseAll;
		
		@FindBy(xpath = "//button[@title='Expand all']")
		WebElement expandAll;
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ElementsPage() {
		PageFactory.initElements(driver, this);
	}

}
