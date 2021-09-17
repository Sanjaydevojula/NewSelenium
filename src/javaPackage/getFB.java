package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getFB {
	public static void main(String[] args) throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//driver.wait().implicit(3000,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
	Thread.sleep(3000);
	}

	
}
