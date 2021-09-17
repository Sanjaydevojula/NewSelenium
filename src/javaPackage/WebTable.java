package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
	
	List <WebElement> wt= driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]/a"));
	String str = "Ruby Mills";
	for( int i=1; i< wt.size();i++) {
		if(wt.get(i).getText().equalsIgnoreCase(str))
		{
		System.out.println("value: " +wt.get(i).getText());
		wt.get(i).click();
		}
	}
	}
	
	

}
