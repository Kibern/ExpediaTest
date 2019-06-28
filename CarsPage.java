package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarsPage {
    public CarsPage(){
        PageFactory.initElements(Driver.getDriver("chrome"), this);
    }

    @FindBy(id="tab-car-tab-hp")
    public WebElement carsButton;

    @FindBy(xpath = "//input[@id='car-pickup-hp-car']")
    public WebElement pickUpLocation;

    @FindBy(xpath = "//input[@id='car-dropoff-hp-car']")
    public WebElement dropOffLocation;

    @FindBy(xpath = "//input[@id='car-pickup-date-hp-car']")
    public  WebElement pickUpDateSearchBox;

    @FindBy(xpath = "//*[@id=\"car-pickup-time-hp-car\"]")
    public WebElement pickUpTime;

    @FindBy(xpath = "//input[@id='car-dropoff-date-hp-car']")
    public WebElement dropOffDate;

    @FindBy(xpath = "//*[@id=\"car-dropoff-time-hp-car\"]")
    public WebElement dropOffTime;

    @FindBy(xpath = "(//button[@type='submit'])[14]")
    public  WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"wizard-tabs\"]")
    public  WebElement random;

    @FindBy(xpath = "//div[@class='alert alert-error validation-alert']")
    public WebElement actualTest1;

    @FindBy(xpath = "//div[@class='alert alert-info']")
    public WebElement actualTest2;

    @FindBy(xpath = "//div[@class='col playback-summary-data ']")
    public WebElement actualTest3;

    @FindBy(xpath = "//h5[@class='alert-message']")
    public WebElement actualTest4;






}
