package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("All frames: " +allframes.size());
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));

		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(draggable, droppable).build().perform();
		Thread.sleep(3000);
	}

}
