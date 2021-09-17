package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com//");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how stuff works"); 	 	
		//handle auto suggestions
		/*
		
		WebElement AllSuggestions= driver.findElement(By.xpath("//*[@role='listbox']"));
		
		Can be done in two ways
		1. List<WebElement> AllSearch = AllSuggestionsfindElement(By.tagName("li"));
		2nd is below
		*/
		List<WebElement> AllSearch = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		System.out.println(AllSearch.size());
		
		for(int i=0 ; i < AllSearch.size(); i++) {
			
			String AllSuggestinList=AllSearch.get(i).getText();
			String FinalReult="how stuff works book";
			if(AllSuggestinList.equalsIgnoreCase(FinalReult))
					{
				AllSearch.get(i).click();
				System.out.println(AllSearch.get(i));
				System.out.println("you have selected:" +FinalReult);
				break;
				
			}
	
				
			
		}
		
		
}
}
