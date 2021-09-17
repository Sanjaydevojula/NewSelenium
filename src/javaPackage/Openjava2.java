package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openjava2 {
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromeDriver.exe");
		//System.setProperty("webdriver.chrome.driver", "E:\\Software\\Chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","E:\\Software\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath ("//input[@id='email']")).sendKeys("9032399573");
		Thread.sleep(3000);
		driver.navigate().to("https://google.com");
		Thread.sleep(3000);
		driver.navigate().back();
	driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]")).sendKeys("sindhu");
	driver.close();
	driver.quit();
	}
	

}
