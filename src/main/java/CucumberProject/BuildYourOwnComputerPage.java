package CucumberProject;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utlis {

    public void verifyUserIsonBuildComputerPage(){
        assertUrl("build-your-own-computer");
    }
    public void clickOnAddToCartForcomputer(){
        clickOnLocator(By.id("add-to-cart-button-1"));
        clickOnLocator(By.className("close"));
        clickOnLocator(By.xpath("//input[@value='6']"));
        clickOnLocator(By.className("close"));
        waitforClickable(By.id("add-to-cart-button-1"),20);
        clickOnLocator(By.id("add-to-cart-button-1"));
        clickOnLocator(By.linkText("Shopping cart"));
        //clickOnLocator(By.xpath("//input[@value='Go to cart']"));
    }
}
