package demo.Testng.Demo.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo extends DemoParent {
	

	

	@Test
	public void tc_1() {
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.sendKeys("java", Keys.ENTER);
		System.out.println("TC1");

	}

	@Test
	public void tc_2() {

		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.sendKeys("TestNg", Keys.ENTER);
		System.out.println("TC2");

	}
}
