package Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login ')]")).click();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver,15);
		w.until(ExpectedConditions.titleContains("Enter"));
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}}
		
					/*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
					driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
					driver.findElement(By.xpath("//a[@id='loginButton']/div[contains(.,'Login ')]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/descendant::div[@class='dropdownButton']")).click();;
				//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']
					//driver.findElement(By.xpath("//div[contains(.,'- Select Customer -')]/parent::div[@class='selectedItem']")).click();
					driver.findElement(By.xpath("//div[@class='searchItemList']/descendant::div[contains(.,'- New Customer -')]")).click();
					
					driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("Volvo");
					driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("Analytics");
					driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']/div[@class='components_button_label']")).click();
					Thread.sleep(2000);
					WebElement error= driver.findElement(By.xpath("//span[contains(.,'Please correct all errors in the fields highlighted in red.')]"));
					System.out.println(error.getText());*/

	


