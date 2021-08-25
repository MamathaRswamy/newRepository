package Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06Test {
@Test(groups="regressionTest")
public void beforedemo() {
	Reporter.log("from before method reg",true);
}
}
