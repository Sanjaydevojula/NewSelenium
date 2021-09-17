package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_upload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
	driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\sanjaydevojula\\Desktop\\Manual Preparation.docx");
	Thread.sleep(3000);
	System.out.println("Upload succesfull");
	
		
	}

}
