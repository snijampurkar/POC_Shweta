package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class xpathPractice {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	/*	//1. finding dynamic xpath of first tab
		
		driver.findElement(By.xpath("//a[text ()='Interactions' and @title = 'Interactions']")).click();
		System.out.println("Found dynamic xpath of first tab Interactions");
		
		//2. finding the list of all link elements under Interactions tab using xpath Axis
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class= 'demo-frame']/child::ul/child::li"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("List of all the options available in this tab are==>" + list.get(i).getText());
				
		}	
				

		//3. Selecting one child 
		
		driver.findElement(By.xpath("//div[@class= 'demo-frame']/child::ul/child::li[4]")).click();
	//	clickOn(driver, driver.findElement(By.xpath("//div[@class= 'demo-frame']/child::ul/child::li[4]")), 20);
		String title2 = driver.getTitle();
		boolean value1 = driver.findElement(By.xpath("//h1[@class= 'entry-title']")).isDisplayed();
		System.out.println(value1);
		
		//4 Drag and drop
		driver.findElement(By.xpath("//ul/li/a[@href = 'https://demoqa.com/droppable/']")).click();
		Actions action = new Actions(driver);
	    action.clickAndHold(driver.findElement(By.xpath("//div[@id= 'draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@class= 'ui-widget-header ui-droppable']"))).release()
		.build()
		.perform();
	    
	  
			//4 Resize
			driver.findElement(By.xpath("//ul/li/a[@href = 'https://demoqa.com/resizable/']")).click();
			Actions action = new Actions(driver);
		    action.clickAndHold(driver.findElement(By.xpath("//div[@id = 'resizable']/div[@class = 'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"))).moveByOffset(100, 100)
	        .release()
			.build()
			.perform();
	
		
		//Datepicker https://demoqa.com/datepicker/
		    
			
			driver.findElement(By.xpath("//ul/li/a[@href = 'https://demoqa.com/datepicker/']")).click();
			 WebElement datePicker;
			 
			 datePicker = driver.findElement(By.id("datepicker"));
			 datePicker.click();
				  // Enter Date directly into the field
			  driver.findElement(By.xpath("//input[@class='hasDatepicker']")).sendKeys("03/05/2020");  
		 	
		//frame switching https://demoqa.com/iframe-practice-page/
			  
				driver.findElement(By.xpath("//ul/li/a[@href = 'https://demoqa.com/iframe-practice-page/']")).click();
				driver.switchTo().frame("iframe1");
			String Text1 =	driver.findElement(By.xpath("//a[@class='skip-link screen-reader-text']")).getText();

		
	// randon ID generator
		
		driver.findElement(By.xpath("//a[contains(@href, 'https://demoqa.com/automation-practice-switch-windows-2/')]")).click();

		WebElement id1 = driver.findElement(By.xpath("//a[contains(text(), 'Find me I have nothing in me!!')]/following-sibling::p[contains(text(), 'I will have random ID')]"));
		System.out.println(id1.getTagName());
	
			System.out.println(Text1);
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame("iframe2");
			
			String Text2 =	driver.findElement(By.id("logo-events")).getText();
			System.out.println(Text2);
		
		*/ 	
		
				
	//driver.quit();	
		
	}

	
	@SuppressWarnings("deprecation")
	public void Static  (WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
