package javaPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test()
	public void a() {
		
		System.out.println("a method");
		
	}
	@BeforeSuite()
	public void b() {
		System.out.println("b method");
	}
	
	@BeforeTest()
	public void c () {
		System.out.println("C Method");
	}
	
	
}
