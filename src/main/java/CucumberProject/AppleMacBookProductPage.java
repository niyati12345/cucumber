package CucumberProject;

import org.openqa.selenium.By;

public class AppleMacBookProductPage extends Utlis {

    public void verifyUserIsOnMacbbokPage()
    {
        assertUrl("apple-macbook");
    }

    public void applemacbookpage(){
        //click on send a email
        clickOnLocator(By.xpath("//div[@class='email-a-friend']"));

    }
}
