package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		//Get URL
		//Get Title
		driver.get("https://demoqa.com/");
		String title1 = driver.getTitle();
		//navigate refresh
		driver.navigate().refresh();
		int length = driver.getTitle().length();
		System.out.println("Title of the page is: " + title1);
		System.out.println("Length of title is:" + length);
		//get current url
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current url of page is :" +  currentURL);
		//get page source
		String pagesource = driver.getPageSource();
		int pagesourcelength = driver.getPageSource().length();
		System.out.println("Current page source is :" +  pagesource + "And length of [age source is: "+ pagesourcelength);
		
		
		
		driver.close();
	
	}

}
