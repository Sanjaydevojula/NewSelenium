package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	
@Test()
public void AssertionCheck() {

String Expected= "User.";
String Actual= "User";
Assert.assertEquals(Expected,Actual);
}
}