package listen;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyserImple implements IRetryAnalyzer{
		int count=0;
		int retry=3;
		public boolean retry(ITestResult result) {
			if(count<retry) {
				System.out.println("retry count is"+count+"times");
				count++;
				return true;
			}
			return false;
		}
	}


