package myapp.homework;

import myapp.pages.RentalHomePage;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;


public class HW05_BookACar {
//        Name:
//        Require user to login for reservation
//        Description:
//        User should see a message when user tries to book a car while not logged in
//        Acceptance Criteria:
//        As customer, I should be able to see error message, when I try to book a car while not logged in
//        Message: Please first login
//        Given user is on the login page
//        And tries to book a car
//        And click continue reservation
//        Then user see the warning message: Please first login
    @Test
    public void bookACar(){
//        go to https://www.bluerentalcars.com/
        Driver.getDriver().get("https://www.bluerentalcars.com/");
//        select a car
        RentalHomePage rentalHomePage = new RentalHomePage();
        Select select = new Select(rentalHomePage.selectACar);
        select.selectByIndex(1);
//        select a place to pick up
        rentalHomePage.pickUpPlace.sendKeys("Oklahoma Seminole");
        WaitUtils.waitFor(1);
//        select a place to drop off
        rentalHomePage.dropOffPlace.sendKeys("Oklahoma Coweta");
        WaitUtils.waitFor(1);
//        select a date to pick up
        rentalHomePage.pickUpDate.sendKeys("26102023");
        WaitUtils.waitFor(1);
//        select time to pick up
        rentalHomePage.pickUpTime.sendKeys("0900AM");
        WaitUtils.waitFor(1);
//        select a date to drop off
        rentalHomePage.dropOffDate.sendKeys("05112023");
        WaitUtils.waitFor(1);
//        select time to drop off
        rentalHomePage.dropOffTime.sendKeys("1000PM");
        WaitUtils.waitFor(1);

    }
}