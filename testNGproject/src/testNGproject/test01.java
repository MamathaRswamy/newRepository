package testNGproject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test01 {

	@Test
	public void  demo() {
		System.out.println("this is demo");
		Reporter.log("helloo");
	}
	
	@Test
	public void  demo1() {
		System.out.println("this is demo1");
		Reporter.log("helloo");
	}
	
	@Test
	public void  demo2() {
		System.out.println("this is demo2");
		Reporter.log("helloo");
	}
}
