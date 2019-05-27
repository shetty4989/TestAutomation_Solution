
package testrunner;

import com.relevantcodes.extentreports.ReporterType;
import gherkin.formatter.Reporter;
import managers.FileReaderManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.cucumber.listener.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTest",
        tags = "@valid_emailAddress",
        glue = {"stepdefinition"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html: cucumber-html-reports",
               "json: cucumber-html-reports/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}

)
public class TestRunner {

    @BeforeClass
    public static void writeExtentReport() {
        ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        ExtentCucumberFormatter.loadConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        ExtentCucumberFormatter.addSystemInfo("User Name", System.getProperty("user.name"));
        ExtentCucumberFormatter.addSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentCucumberFormatter.addSystemInfo("Machine", "Windows 10" + "64 Bit");
        ExtentCucumberFormatter.addSystemInfo("Selenium", "3.7.0");
        ExtentCucumberFormatter.addSystemInfo("Maven", "3.5.2");
        ExtentCucumberFormatter.addSystemInfo("Java Version", "1.8.0_151");
        Map<String, String> systemInfo = new HashMap<String, String>();
        systemInfo.put("Cucumber version", "v1.2.5");
        systemInfo.put("Extent Cucumber Reporter version", "2.41.1");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
    }
}