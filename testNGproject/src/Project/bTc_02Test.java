package Project;

import org.testng.annotations.Test;

public class bTc_02Test extends BaseClass {
	@Test
	public void operate() {
		driver.get("https://flipkart.com");
		System.out.println("from tc02");
	}
}
