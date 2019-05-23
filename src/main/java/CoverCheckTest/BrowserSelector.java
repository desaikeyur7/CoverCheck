package CoverCheckTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserSelector extends BasePage {

    /*Using LoadProp will enable to type a browserName in TestDataConfig.properties
    file so that we do not touch the code whenever we want to test on a different browser*/

    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    //open Firefox or Chrome or Internet Explorer browser
    public void launchBrowser(){

        if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserFactory\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserFactory\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserFactory\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("Invalid browser or wrong browser typed");
        }
    }
}


