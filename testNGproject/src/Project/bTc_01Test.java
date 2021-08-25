package Project;

import org.testng.annotations.Test;

public class bTc_01Test extends BaseClass {
@Test
public void operate() {
	driver.get("https://facebook.com");
	System.out.println("from tc01");
}
}
