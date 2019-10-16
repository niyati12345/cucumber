package CucumberProject;

import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utlis {

    public void verifyUserIsonCheckOutGuestPage(){
        assertUrl("/checkoutasguest");}

    public void checkOutGuestPage() {
        // click on register button
        clickOnLocator(By.xpath("//input[@value=\"Checkout as Guest\"]"));
    }
}
