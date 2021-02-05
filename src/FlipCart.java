

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class FlipCart {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	   List<WebElement>menu= driver.findElements(By.xpath("//div[@class='_1kidPb']/span[@class='_2I9KP_']"));
	   Thread.sleep(3000);
	   Actions a= new Actions(driver);
	   for ( WebElement menuName:menu){
		   a.moveToElement(menuName).build().perform();
		   String mName=menuName.getText();
		   System.err.println(mName);
		   Thread.sleep(3000);
}
	}
	}
