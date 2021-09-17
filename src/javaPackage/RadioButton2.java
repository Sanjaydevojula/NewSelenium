package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
Thread.sleep(3000);
List <WebElement>  radios = driver.findElements(By.xpath("//input[@type=\"radio\"]"));


System.out.println("Total no of radios :"+radios.size());
System.out.println(radios.get(0).isDisplayed());

String str= "Female";

for (int i=0; i<=radios.size(); i++)
{
if(radios.get(i).getText().equalsIgnoreCase(str))	{
	radios.get(i).click();
}
}




	}

}
