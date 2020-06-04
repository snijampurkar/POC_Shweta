package com.qa.tests;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ElementsPage;
import com.qa.pages.LandingPage;

public class LandingPageTest extends TestBase {
	LandingPage LandingPage;
	ElementsPage ElementsPage;
	
	public LandingPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		LandingPage = new LandingPage();
	}
	
	@Test
	public void LandingpageTitleTest() {
		String title = LandingPage.validateLandingPageTitle();
		Assert.assertEquals(title, "ToolsQA");
	}
	
	@Test
	public void LandingpageLogTest() {
	boolean flag = LandingPage.validateLogo();
	Assert.assertTrue(flag);
	}
	
	@Test
	public void openElementsPageTest() {
	
	}
	
	@AfterMethod
	public void teardown() {
	driver.quit();
	
	}
	
	
}
