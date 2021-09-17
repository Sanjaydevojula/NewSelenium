package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		List<WebElement> month= driver.findElements(By.xpath("//select[@aria-label='Month']/option"));
		System.out.println("No of dropdown values are" +month.size());
		month.get(5).click();
		month.get(8).click();
		
		
		WebElement bm = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select mn=new Select(bm);
		mn.selectByVisibleText("Oct");
		mn.selectByIndex(9);
		System.out.println(mn.getFirstSelectedOption().getText());

		List<WebElement> dropdown = mn.getOptions();
		System.out.println("No of dropdons are" +dropdown.size());
		for(int i=0;i<dropdown.size();i++) {
			String drop= dropdown.get(i).getText();
			if(drop.equalsIgnoreCase("Aug"))
			{
				dropdown.get(i).click();
			}
				
		}
}
}
