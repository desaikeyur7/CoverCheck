package PageObjects;

import CoverCheckTest.LoadProp;
import CoverCheckTest.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class HomePage extends Utils {

    LoadProp loadProp = new LoadProp();
    boolean present;

    // create all locators and
    private By _pageTitle = By.cssSelector("img[title='Volkswagen Financial Services']");
    private By _enterReg = By.id("vehicleReg");
    private By _findVehicle = By.cssSelector("button[name='btnfind']");
    private By _carRegRequired = By.cssSelector("div[class='error-required']");
    private By _result = By.xpath("//*[contains(text(),'Result for')]");
    private By _coverStart = By.xpath("//*[contains(text(),'Cover start')]");
    private By _coverStartDate = By.xpath("//*[@class='resultDate'][1]");
    private By _coverEnd = By.xpath("//*[contains(text(),'Cover end')]");
    private By _coverEndDate = By.xpath("(//*[@class='resultDate'])[2]");

    public void userShouldBeAbleToFindCarRegistrationNumber() {

        Utils.elementDisplayed(_pageTitle);
        Utils.clickElementBy(_findVehicle);
        Utils.elementDisplayed(_carRegRequired);
        Utils.enterText(_enterReg, loadProp.getProperty("enterReg"));
        Utils.clickElementBy(_findVehicle);

        try
        {
            Utils.assertEquals(_result, loadProp.getProperty("result"));
            Utils.elementDisplayed(_coverStart);
            Utils.getText(_coverStartDate);
            Utils.elementDisplayed(_coverEnd);
            Utils.getText(_coverEndDate);
            System.out.println("Vehicle with registration " + loadProp.getProperty("enterReg") + " is covered.");
            present = true;
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Record for vehicle with registration " + loadProp.getProperty("enterReg") + " is not found." +e.toString());
            present = false;
        }
    }
}
