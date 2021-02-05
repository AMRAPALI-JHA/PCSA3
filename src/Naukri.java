import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("parent"+parent);
		Set<String>winhandle=driver.getWindowHandles();
		System.out.println(winhandle.getClass());
		/*winhandle.remove(parent);
		for (String win:winhandle) {
			System.out.println("child"+win);
			driver.switchTo().window(win);
			driver.close();
		}*/
		ArrayList<String>Al=new ArrayList<>(winhandle);	
		for (int i= Al.size()-1;i>=0;i--)
		{
			driver.switchTo().window(Al.get(i));
			driver.close();
			Thread.sleep(2000);
		}
		
	}

}


