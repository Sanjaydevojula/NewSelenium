package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpicitWait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Software\\chrome driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.google.com");
 	driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("How Stuff Works");
 	//WebElement Suggestions =driver.findElement(By.xpath("//*[@role='listbox']"));
 	//List<WebElement> Search = Suggestions.findElements(By.tagName("li"));
 	List<WebElement> Search = driver.findElements(By.xpath("//*[@role='listbox']/li"));
 	
System.out.println("total no of searches:" +Search.size());

for (int i=0; i<=Search.size(); i++)
{
	String ExpectedString = Search.get(i).getText();
	String FinalString = "How Stuff Works Book";
	
	if(ExpectedString.equalsIgnoreCase(FinalString))
	{
		Search.get(i).click();
		System.out.println("you have selected :" +FinalString);
		break;
	}
}
}
}