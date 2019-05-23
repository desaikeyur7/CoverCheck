package CoverCheckTest;


import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;

public class Utils extends BasePage {

    //Reusable method for click
    public static void clickElementBy(By by) {
        driver.findElement(by).click();

    }

    public static void enterUrl(String text)
    {
        driver.get(text);
    }

    // Element is displayed reusable method
    public static void elementDisplayed(By by)
    {
        driver.findElement(by).isDisplayed();
    }

    //Reusable method for entering any text/string (eg: entering name/password/email)
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    //Reusable method to clear the text from input box
    public static void textClear(By by) {
        driver.findElement(by).clear();
    }

    //Reusable method to check if element is present and element is not present
    public static void webElementPresent(By by) {
        if (driver.findElement(by).isDisplayed()) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }
    }

    //Reusable method to check if element is displayed and element is not displayed
    public static void webElementDisplayed(By by) {
        if (driver.findElement(by).isDisplayed()) {
            System.out.println("Element is Displayed");
        } else {
            System.out.println("Element is not Displayed");
        }
    }

    //Reusable method to try to click element three times if not available in first go
    public static void elementThreeTimes(By by) {
        if (driver.findElement(by).isDisplayed()) {
            driver.findElement(by).click();
        } else if (driver.findElement(by).isDisplayed()) {
            driver.findElement(by).click();
        } else if (driver.findElement(by).isDisplayed()) {
            driver.findElement(by).click();
        } else {
            System.out.println("Element is not Visible");
        }
    }

    //Method for Explicit wait for element to be displayed/visible
    public static void waitForElementDisplay(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //Reusable method for Explicit wait for element to be clickable
    public static void waitForElementClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //Method for Explicit wait for locator to be clickable
    public static void waitForLocatorClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }


    //Get text reusable method
    public static String getText(By by)
    {
        String text = driver.findElement(by).getText();
        System.out.println("The text in element is " +text);
        return text;
    }

    // Assert equals reusable method
    public static void assertEquals(By by, String expected)
    {
        String actual = driver.findElement(by).getText();
        Assert.assertEquals(expected, actual);
    }

    //Cucumber screenshot method
    public static void screenshotOfTheBrowserUsingCucumber(Scenario scenario)
    {
        String timeStamp = new SimpleDateFormat("dd.MM.yy.HH.mm.ss").format(new Date());
        String screenshotName = scenario.getName().replaceAll("[.,;:?!]", "")+timeStamp+".png";
        try
        {
            //This takes a screenshot from the driver at save it to the specified location
            File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            //Building up the destination path for the screenshot to save
            //Also make sure to create a folder 'screenshots' within the cucumber-reports folder
            File destinationPath = new File(System.getProperty("user.dir")+
                    "/target/cucumber-reports/extent-reports/screenshots/"+screenshotName+".png");
            //Copy taken screenshot from source location to the destination location
            copyFile(sourcePath,destinationPath );
            scenario.write("!!-----------.......Scenario Failed......----------!! Please see attached screenshot for the error/issue");
            //attach the screenshot to our report
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}


