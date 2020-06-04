package Practice;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPRactice {

	@BeforeSuite
	public void Setup() {
		System.out.println("before suite");
	}	
	
	@BeforeTest
	public void launchBrowser() {
			System.out.println("before test");
		}
	
	@BeforeClass
public void LoginBrowser() {
		System.out.println("before class");
	}
	
	@BeforeMethod
public void Enterurl() {
		System.out.println("before method");
	}
		
	@Test
public void test1() {
	System.out.println("Google test");
}

	@Test
public void test2() {
	System.out.println("Google test");
}




	@AfterMethod
public void Enterurl1() {
	System.out.println("After method");
	
	}

	@AfterClass
	public void LoginBrowser1() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void launchBrowser1() {
			System.out.println("After test");
		}

	@AfterSuite
	public void Setup1() {
		System.out.println("after suit");
	}	
}
		
		
		
		
	

