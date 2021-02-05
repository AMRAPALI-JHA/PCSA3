package demo.Testng.Demo.qsp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
	@Test(groups="smoke",priority=3)
	public void tc1() {
		Reporter.log("Hi--1", true);
	}
	@Test(groups="Regression",dependsOnGroups="functional")
	public void tc2() {
		Reporter.log("Hi--2", true);
	}
	@Test(groups="functional",dependsOnGroups="smoke")
	public void tc3() {
		Reporter.log("Hi--3", true);
		Assert.fail();
	}
	@Test(groups="smoke",priority=2)
	public void tc4() {
		Reporter.log("Hi--4", true);
	}
	@Test(groups="functional",dependsOnGroups="smoke")
	public void tc5() {
		Reporter.log("Hi--5", true);
	}
	@Test(groups="smoke",priority=1)
	public void tc6() {
		Reporter.log("Hi--6", true);
	}
	@Test(groups="functional",dependsOnGroups="smoke")
	public void tc7() {
		Reporter.log("Hi--7", true);
	}
	
}
