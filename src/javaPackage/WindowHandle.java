package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		Set<String> PopID = driver.getWindowHandles();
		System.out.println(PopID);
		System.out.println(PopID.size());
		
		Iterator<String> it = PopID.iterator();
		
		String Window1= it.next();
		String Window2= it.next();
		String Window3= it.next();
		String Window4= it.next();

		
		driver.switchTo().window(Window1);
		System.out.println(Window1);
		System.out.println(driver.getTitle());
		//driver.quit();
		
		

		driver.switchTo().window(Window2);
		System.out.println(Window2);
		System.out.println(driver.getTitle());
		
		

		driver.switchTo().window(Window3);
		System.out.println(Window3);
		System.out.println(driver.getTitle());
		
		
		
		

		driver.switchTo().window(Window4);
		System.out.println(Window4);
		System.out.println(driver.getTitle());
	}

}
