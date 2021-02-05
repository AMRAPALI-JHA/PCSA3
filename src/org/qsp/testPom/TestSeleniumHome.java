package org.qsp.testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.com.SeleniumHome;

public class TestSeleniumHome {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		SeleniumHome sh= new SeleniumHome(driver);
		sh.sendText("java");
		driver.navigate().back();
		driver.close();
		
		
	}
}
