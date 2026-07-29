package apk.automation.hymnal;

import framework.base.DriverFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

    @Override
    public void onTestFailure(ITestResult result) {
        var driver = DriverFactory.getDriver();
        if (driver != null) {
            AllureUtils.takeScreenshot(driver);
        }
    }
}
