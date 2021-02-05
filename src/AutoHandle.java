import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoHandle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("java",Keys.ENTER);
		
		/*List<WebElement>menu= driver.findElements(By.xpath("//span[text()='java']"));
		Actions a =new Actions(driver);
		for(WebElement sMenu:menu) {
			//a.moveToElement(sMenu).build().perform();
			//SysoString sText= sMenu.getText();
			System.out.println(sMenu.getText());
		}
		menu.get(2).click();*/
	Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.)
}
}
