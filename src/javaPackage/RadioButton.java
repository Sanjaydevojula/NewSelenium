package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		List <WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radio.size());
		System.out.println(radio.get(1).isEnabled());
		radio.get(2).click();
				
		List <WebElement> radio1= driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
				String str= "Female";
		for(int i=0; i< radio1.size();i++) {
			if(radio1.get(i).getText().equalsIgnoreCase(str)) {
				radio1.get(i).click();
				break;
				
			}
		}
	}

}
