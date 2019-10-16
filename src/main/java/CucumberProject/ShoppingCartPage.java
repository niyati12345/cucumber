package CucumberProject;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utlis {



    public void shoppingCart(){
        waitforClickable(By.id("termsofservice"),30);
        clickOnLocator(By.id("termsofservice"));
        clickOnLocator(By.id("checkout"));
    }
//    LoadProps loadProps=new LoadProps();
//
//
//    public void verifyUserIsOnCheckOutComple()
//    {
//        // assertUrl("completed");
//    }
//    public void verifyUserOrderSuccessfullyPlaced(){
//        asserttextmessage(loadProps.getProperty("expectedorderplace"),gettext(By.xpath("//div[@class=\"section order-completed\"] //div[@class='title']")));
//        // asserttextmessage(loadProps.getProperty("expectedorderplace"),gettext(By.linkText("Your order has been successfully processed!")));
//    }
}
