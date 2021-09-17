package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Sanjay");

	List <WebElement> date = driver.findElements(By.xpath("//select[@aria-label='Day']/option"));
	System.out.println("no of values in date" +date.size());
	date.get(2).click();
	Thread.sleep(3000);
	
		
List <WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
System.out.println(""+radios.size());
radios.get(1).click();

String str = "Custom";

for(int i= 0; i< radios.size(); i++) {
	if(radios.get(i).getText().equalsIgnoreCase(str)) {
		radios.get(i).click();
	}
}
	}

}
