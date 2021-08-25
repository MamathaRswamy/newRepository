package Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_05Test {
@Test(groups="regressionTest")
public void  beforemodifier(){
	
	Reporter.log("from before modifier reg",true);
	
}
}
