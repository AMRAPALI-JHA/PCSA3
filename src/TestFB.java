import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFB {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		/*WebElement email= driver.findElement(By.name("email"));
		email.sendKeys("amrapali.kumari292@gmail.com");
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("Ravijha06");
		WebElement  button=driver.findElement(By.name("login"));
		button.click();*/
		/*driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println(driver.getTitle());*/
		WebElement email= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("amrapali.kumari292@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("Ravijha06");
		WebElement  button=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		button.click();
		
		
	}
}
