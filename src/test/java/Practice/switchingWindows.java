package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchingWindows {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demoqa.com/");
	String title1 = driver.getTitle();
	System.out.println("Original main window's title is ====> " + title1);
	
	driver.findElement(By.xpath("//a[contains(@href, 'https://demoqa.com/automation-practice-switch-windows-2/')]")).click();
	//1. new tab
	driver.findElement(By.xpath("//a[contains(@href, 'http://www.demoqa.com')]/descendant::em/strong[contains(text(), 'Demo Website for Practice Automation')]")).click();
	
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(0));
	System.out.println(driver.getTitle());
	driver.switchTo().window(tabs.get(1));	
	System.out.println(driver.getTitle());
	/*	
	//2. new window after button click
	
	driver.findElement(By.xpath("//button[@id = 'button1']")).click();	
	ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(win.get(0));
	System.out.println(driver.getTitle());
	driver.switchTo().window(win.get(1));	
	System.out.println(driver.getTitle());

	
	
	//3 new message window
	
	driver.findElement(By.xpath("//button[text() = 'New Message Window']")).click();
	Set <String> handler= driver.getWindowHandles();
	Iterator<String> it = handler.iterator();
	String parent =  it.next();
	System.out.println("parent window id:"+ parent);
	String child = it.next();
	System.out.println("Child window id:"+  child);
	driver.switchTo().window(parent);
	System.out.println("Now control is on ====> " + driver.getTitle());
		
//  JavaScript Alert
	
	driver.findElement(By.id("alert")).click();
	System.out.println(driver.switchTo().alert().getText());			
	driver.switchTo().alert().accept();

	
//  JavaScript Alert after 10 sec
	
	driver.findElement(By.id("timingAlert")).click();
	

	WebDriverWait wait = new WebDriverWait(driver, 15); // another deprecated way
	wait.until(ExpectedConditions.alertIsPresent());
	
	System.out.println(driver.switchTo().alert().getText());			
	driver.switchTo().alert().accept();
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
