package Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01Test {
@Test(groups="smokeTest",priority=1)
public void sample() {
	Reporter.log("from sample method ",true);
}
}
