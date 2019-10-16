package CucumberProject;

import org.openqa.selenium.By;

public class HomePage extends Utlis {


    private By _clickOnRegister = By.xpath("//a[@class='ico-register']");
    private By _clickOnMacbookProduct=By.linkText("Apple MacBook Pro 13-inch");
    private By _clickOnComputer=By.linkText("Build your own computer");

    public void clickOnRegisterButton() {
        // click on register button
        clickOnLocator(_clickOnRegister);

    }
    public void clickOnMacbbokProduct() {
        //click on apple macbook
        clickOnLocator(_clickOnMacbookProduct);
    }
    public void clickOncomputer() {
        //click on apple macbook
        clickOnLocator(_clickOnComputer);
    }
}
