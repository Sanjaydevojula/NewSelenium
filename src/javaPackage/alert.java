package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	driver.manage().window().maximize();
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.switchTo().alert().accept();
	driver.close();
	
}

}
