package CoverCheckTest;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Utils extends BasePage {

    //Click an element reusable method
    public static void myClick(By by)
    {
        driver.findElement(by).click();
    }

    // Enter text reusable method
    public static void myEnterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //Get text reusable method
    public static String getText(By by)
    {
        String text = driver.findElement(by).getText();
        System.out.println("The text in element is " +text);
        return text;
    }

    // Assert equals reusable method
    public static void assertEquals(By by, String expectedElement)
    {
        String actual = driver.findElement(by).getText();
        String expected = expectedElement;
        Assert.assertEquals(expectedElement, actual);
    }

    // Element is displayed reusable method
    public static void elementIsDisplayed(By by)
    {
       driver.findElement(by).isDisplayed();
    }
}


