package stepdefinition;

import cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Hooks {

    TestContext testContext;

    public Hooks(TestContext testContextUpdate) {
        this.testContext=testContextUpdate;
    }

    @Before
    public void before(Scenario scenario) {
        System.out.println("------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("------------------------------");
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/output/" + screenshotName + ".png");

                //Copy taken screenshot from source location to destination location
                Files.copy(sourcePath.toPath(), destinationPath.toPath(), StandardCopyOption.REPLACE_EXISTING);

                //This attach the specified screenshot to the test
//                Reporter.addScreenCaptureFromPath(destinationPath.toString());
            } catch (IOException e) {
            }
        }
    }

    @After(order = 0)
    public void afterScenario(){
        System.out.println("------------------------------");
        System.out.println("Scenario End. ");
        System.out.println("------------------------------");
        testContext.getWebDriverManager().closeDriver();

    }
}