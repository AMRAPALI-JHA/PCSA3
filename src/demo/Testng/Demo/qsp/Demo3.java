package demo.Testng.Demo.qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	//@Test(invocationCount=5)
	@Test
	public void tc1() {
		Reporter.log("Hiiii----", true);
		
	}
	@Test(enabled=false)
	public void tc2() {
		Reporter.log("2Hiiii----", true);
		
	}
	@Test(priority=-2)
	public void tc3() {
		Reporter.log("3Hiiii----", true);
		
	}

}
