import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class DemoScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File Screenshot=ts.getScreenshotAs(OutputType.FILE);
		File ScreenShotSave=new File("./ScrrenShot/facebook.png");
		Files.copy(Screenshot, ScreenShotSave);*/
		DemoScreenshot ds=new DemoScreenshot();
		screenShot(driver,"facebooki");

	}

	public static void screenShot(WebDriver driver,String name ) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Scrcopy=ts.getScreenshotAs(OutputType.FILE);
		File Scrsave=new File("./ScrrenShot/" +name+ ".png");
		Files.copy(Scrcopy,Scrsave);
	}
}
