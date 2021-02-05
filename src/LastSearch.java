import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement Search= driver.findElement(By.xpath("//td[@class='gsib_a']"));
		Search.sendKeys("java");
		Search.clear();
		//WebElement.Search=driver.findElement(By.xpath("//td[@class='gsib_a']"));
		Search.sendKeys("testNg");
		

	}

}
