package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Practice {
	
	 @Test
  public void f() {
		 System.setProperty( "webdriver.chrome.driver" ,"E:\\Software\\chrome driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/");
			  String expectedTitle = "Welcome: Mercury Tours";
		      String actualTitle = driver.getTitle();
		      Assert.assertEquals(actualTitle, expectedTitle);
		      System.out.println("Passed");
		      
			
		 
  }
}
