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
        WaitUtils.waitFor(1);

//        select a car
        RentalHomePage rentalHomePage = new RentalHomePage();
        Select select = new Select(rentalHomePage.selectACar);
        select.selectByIndex(9);

//        select a place to pick up
        rentalHomePage.pickUpPlace.sendKeys("Oklahoma Oklahoma City");

//        select a place to drop off
        rentalHomePage.dropOffPlace.sendKeys("Oklahoma Woodward");

//        select a date to pick up

//        select time to pick up

//        select a date to drop off

//        select time to drop off


    }
}
