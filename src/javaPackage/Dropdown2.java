package javaPackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws Exception {

System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com");

driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
Thread.sleep(3000);
List <WebElement>  drop = driver.findElements(By.xpath("//select[@id='month']/option "));
Thread.sleep(3000);
System.out.println("total values are : " +drop.size());
	drop.get(2).click();
	System.out.println(drop.get(1).isEnabled());
	
	WebElement bm= driver.findElement(By.xpath("//select[@id='month']"));
	Select month = new Select(bm);
	
	month.selectByValue("10");
	}
	
	

}
