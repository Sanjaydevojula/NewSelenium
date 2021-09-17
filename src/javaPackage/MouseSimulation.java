package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com");
Thread.sleep(3000);

driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

WebElement electronics= driver.findElement(By.xpath("//*[text()='Electronics']"));

WebElement home = driver.findElement(By.xpath("//*[text()='Home']"));

Actions act = new Actions(driver);

act.moveToElement(electronics).build().perform();
Thread.sleep(3000);
act.release(electronics).build().perform();

act.sendKeys(home,Keys.ENTER).build().perform();
System.out.println("home button entered");

	
	}

}
