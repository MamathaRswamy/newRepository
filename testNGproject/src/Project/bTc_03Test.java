package Project;

import org.testng.annotations.Test;

public class bTc_03Test extends BaseClass {
	@Test
	public void operate() {
		driver.get("https://instagram.com");
		System.out.println("from tc03");
	}
}
