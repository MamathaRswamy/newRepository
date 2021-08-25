package Project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02Test {//TestNG class
	@Test(dependsOnMethods= "demo",groups="regressionTest")
	public void sample() //Test case
	{
		Reporter.log("from sample method reg",true);//Test Step
	}
	@Test
public void demo() {
	Reporter.log("from  demo",true);
}

}
