package TestCases;

import Utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webAppFunctions.WebAppFunction;

public class BasicFunctionsTestCase extends BaseClass {

        @Test
        public void basicFunctionsTestCase() throws InterruptedException {

            WebAppFunction webAppFunction = new WebAppFunction(webDriver);
            webAppFunction.basicFunctionsTest();
        }
}
