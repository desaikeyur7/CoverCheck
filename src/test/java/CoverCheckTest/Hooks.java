package CoverCheckTest;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

    //A method under @Before will be invoked before any scenario
    @Before

    public void openBrowser(){

        browserSelector.launchBrowser();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loadProp.getProperty("url"));

    }
    //A method under @After will be invoked after a scenario is completed
    @After

    @cucumber.api.java.After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed())
        {
            Utils.screenshotOfTheBrowserUsingCucumber(scenario);
        }
        driver.close();
    }
}
