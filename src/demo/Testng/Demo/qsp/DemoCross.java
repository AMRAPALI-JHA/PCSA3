package demo.Testng.Demo.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoCross {
@Test
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.close();

}
