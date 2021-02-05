import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UbanLadder {
	
		public static void main(String[] args) throws InterruptedException  {
				
				System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.urbanladder.com/");
				Thread.sleep(10000);
				driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
			WebElement store= driver.findElement(By.xpath("//div[@id=\"topnav_wrapper\"]"));
Actions a= new Actions()
			for ( WebElement newLink:store) {
	System.out.println(newLink.getText());
	
}

	
	
}
}

