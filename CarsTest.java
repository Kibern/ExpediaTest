package Tests;

import Pages.CarsPage;
import TestNG_Intro.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CarsTest extends TestBase {
    CarsPage page=new CarsPage();

    @Test
    public void Test1() throws InterruptedException {


        driver.get("https://www.expedia.com/");
        page.carsButton.click();

        page.pickUpLocation.sendKeys(Keys.BACK_SPACE);

        page.pickUpLocation.sendKeys("Chicago");
        Thread.sleep(3000);
        page.pickUpLocation.sendKeys(Keys.ARROW_DOWN);
        page.pickUpLocation.click();
        page.dropOffLocation.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
        page.dropOffLocation.sendKeys("Los Angeles");
        page.dropOffLocation.sendKeys(Keys.ARROW_DOWN);
        page.dropOffLocation.click();
        page.dropOffDate.sendKeys(Keys.BACK_SPACE);
        page.dropOffDate.sendKeys("5/2/2019");
        page.pickUpDateSearchBox.sendKeys("6/7/2019");
         Select select=new Select(page.pickUpTime);
         select.selectByValue("1030PM");


        page.submitButton.click();
         String expected ="Please correct the errors below.\n" +
                 "Dates must be between 6/27/2019 and 5/21/2020.\n" +
                 "The date must be 6/27/2019 or after.";
         String actual=page.actualTest1.getText();
        Assert.assertEquals(expected,actual);
    }




    @Test
    public void Test2() throws InterruptedException {
        driver.navigate().to("https://www.expedia.com/");
        page.carsButton.click();
        Thread.sleep(3000);
        page.pickUpLocation.sendKeys("Chicago");
        page.pickUpLocation.sendKeys(Keys.ARROW_DOWN);
        page.pickUpLocation.click();
        page.dropOffLocation.sendKeys(Keys.BACK_SPACE);
        page.dropOffLocation.sendKeys("Dfdgg");
        page.dropOffDate.sendKeys(Keys.BACK_SPACE);
        page.dropOffDate.sendKeys("09/01/2019");
        page.pickUpDateSearchBox.sendKeys("08/20/2019");
        Select select2=new Select(page.pickUpTime);
        select2.selectByValue("0500AM");

        Select select3 =new Select(page.dropOffTime);
        select3.selectByValue("0100AM");
        Thread.sleep(3000);
        page.submitButton.click();

        String expected1="Adjust your pick-up to a nearby location.\n" +
                "Sorry, we're unable to find any cars in Chicago (and vicinity) for the selected dates.\n" +
                "Try a different pick-up location to find your ideal car.";
        String expected2="We didn't quite get that; please try a different search.";
        String actual=page.actualTest2.getText();
        boolean match=false;

        if(expected1.equals(actual)||expected2.equals(actual)){
            match=true;

        }
        Assert.assertTrue(match);

    }
        @Test
    public void Test3() throws InterruptedException {
        driver.get("https://www.expedia.com/");
        page.carsButton.click();
        page.pickUpLocation.sendKeys("Sdfgg");
        page.dropOffLocation.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
        page.dropOffLocation.sendKeys("Los Angeles");
        page.dropOffLocation.sendKeys(Keys.ARROW_DOWN);
        page.dropOffLocation.click();
        page.dropOffDate.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
        page.dropOffDate.sendKeys("09/01/2019");
        page.pickUpDateSearchBox.sendKeys(Keys.BACK_SPACE);
        page.pickUpDateSearchBox.sendKeys("08/20/2019");
        Select select3=new Select(page.pickUpTime);
        select3.selectByValue("1030PM");
        Thread.sleep(3000);

        page.submitButton.click();
        String expected="We didn't quite get that; please try a different search.";
        String actual=page.actualTest3.getText();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  Test4() throws InterruptedException {
        driver.navigate().to("https://www.expedia.com/");
        page.carsButton.click();
        page.pickUpLocation.sendKeys("Sdfgg");
        page.dropOffLocation.sendKeys("fhhdsdjk");
        page.dropOffDate.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        page.dropOffDate.sendKeys("09/01/2019");
        page.pickUpDateSearchBox.sendKeys(Keys.BACK_SPACE);
        page.pickUpDateSearchBox.sendKeys("08/20/2019");
        Select select4=new Select(page.pickUpTime);
        select4.selectByValue("1030PM");
        Thread.sleep(3000);
        page.submitButton.click();


        String expected1="We didn't quite get that; please try a different search.";
        String expected2="Sorry, there are no available cars at this location for your preferred date or time." +
                " Please adjust your search and try again.";
        String expected3="Adjust your pick-up to a nearby location.\n" +
                "Sorry, we're unable to find any cars at Louisville, KY (SDF-Louisville Intl.) for the selected dates.\n" +
                "Try a different pick-up location to find your ideal car.";
        String actual=page.actualTest4.getText();

boolean match=false;
        if(expected1.equals(actual)||(expected2.equals(actual)||(expected3.equals(actual)))){

match=true;
        }
        Assert.assertTrue(match);
        Thread.sleep(3000);




    }


}
