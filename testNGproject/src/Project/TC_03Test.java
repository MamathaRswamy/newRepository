package Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_03Test {
@Test(groups="smokeTest")
public static void application(){
	Reporter.log("hello from application", true);
}
}
