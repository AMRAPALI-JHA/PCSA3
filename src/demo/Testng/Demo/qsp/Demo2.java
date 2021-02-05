package demo.Testng.Demo.qsp;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	
	@BeforeSuite
	public void beforeS() {
		System.out.println("before suite------");
	}
	
	@BeforeTest
	
	public void test() {
		System.out.println("befor test--------");
	}
	@BeforeClass
	
	public void beforC() {
		System.out.println("Before class----");
	}
	@BeforeMethod
	public void BeforM() {
		System.out.println("Before method------");
		
		}
	@Test
	public void TC1() {
		System.out.println("TC1");
	}
	@Test
	public void TC2() {
		System.out.println("TC2");
	}
	
	@AfterMethod
	public void afterM() {
		System.out.println("After method------");
		
		}
@AfterClass
	
	public void afterC() {
		System.out.println("After class----");
	}
@AfterTest

public void aftertest() {
	System.out.println("After test--------");
}
	@AfterSuite
	public void afterS() {
		System.out.println("Aftersuite------");
	}
	
	
	
	
}
