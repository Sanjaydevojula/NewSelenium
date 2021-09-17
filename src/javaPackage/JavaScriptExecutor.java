package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	//public static void main(String[] args) {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","E:\\Software\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
			
			//jse.executeScript("document.getElementById('u_0_d_MO').click()");
			jse.executeScript("window.scrollBy(0,400)");

			jse.executeScript("window.scrollBy(0,-400)");
		}
		

}
