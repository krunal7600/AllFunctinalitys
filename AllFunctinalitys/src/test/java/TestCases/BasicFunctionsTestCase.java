package TestCases;

import Utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webAppFunctions.WebAppFunction;

public class BasicFunctionsTestCase extends BaseClass {

    public ExtentReports extentReports;
    public ExtentTest extentTest;

//    @BeforeTest
//    public void generate()
//    {
//        extentReports = new ExtentReports(System.getProperty("user.dir") + "./Reports/TestResult.html",true);
//        extentTest = extentReports.startTest("BasicFunctionalities");
//        extentTest.log(LogStatus.PASS,"Basic Functionalities Execute Pass");
//        extentTest.log(LogStatus.FAIL,"Basic Functionalities Execute Fail");
//        extentTest.log(LogStatus.SKIP,"Basic Functionalities Execute Skip");
//        extentReports.endTest(extentTest);
//        extentReports.flush();
//    }
        @Test
        public void basicFunctionsTestCase() throws InterruptedException {

            WebAppFunction webAppFunction = new WebAppFunction(webDriver);
            webAppFunction.basicFunctionsTest();
        }
}
