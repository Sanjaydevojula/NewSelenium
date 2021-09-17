package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_dropdown {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/newtours/register.php");
List<WebElement> dropdown= driver.findElements(By.xpath("//select[@name=\"country\"]/option"));
dropdown.get(3).click();
System.out.println(dropdown.get(3).getText());

	}

}
