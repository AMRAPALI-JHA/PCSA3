import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1000)");
		//Thread.sleep(2000);
		/*js.executeScript("window.scrollBy(0,-500)");
        js.executeScript("window.scrollBy(300,0)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(-300,0)");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");*/
		WebElement SFH= driver.findElement(By.xpath("h2[text()='Stand for Handmade']"));
		js.executeScript("argument[0].scrollIntoView()",SFH);
	}

}
