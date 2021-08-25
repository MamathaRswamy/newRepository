package Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04Test {
@Test(groups="smokeTest",dependsOnGroups="regressionTest")
public void modifier() {
	Reporter.log("from modifier method",true);
}
}
