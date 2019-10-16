package CucumberProject;

import org.openqa.selenium.By;

public class RegistrationPage extends Utlis {
    LoadProps loadProps=new LoadProps();
    private By _firstname=By.id("FirstName");
    private By _lastname=By.xpath("//input[@name='LastName']");
    private By _birthdate=By.xpath("//select[@name='DateOfBirthDay']");
    private By _birthmonth=By.xpath("//select[@name='DateOfBirthMonth']");
    private By _birthyear=By.xpath("//select[@name='DateOfBirthYear']");

    public void verifyUserIsOnRegistraionPage()
    {
        assertUrl("register");
    }
    public void userEnterRegistrationDetails()
    {
        //enter Firstname
        entertext(_firstname, loadProps.getProperty("FirstName"));
        entertext(_lastname, loadProps.getProperty("LastName"));
        // entertext(By.name("Email"),);
        selectByValue(_birthdate, "2");
        selectByVisibleText(_birthmonth, "February");
        selectbyindex(_birthyear, 4);
        //enter email
        entertext(By.name("Email"),loadProps.getProperty("EmailName1") +randomDate()+ loadProps.getProperty("EmailFormat1"));
        //enter password
        entertext(By.id("Password"), loadProps.getProperty("password"));
        //re-enter same password to confirm
        entertext(By.id("ConfirmPassword"), loadProps.getProperty("password"));
        //click on register
        clickOnLocator(By.name("register-button"));
    }
    public void verifyUserRegistersuccessfully()
    {
        // String actual= gettext(By.xpath("//div[@class='result']"));
        asserttextmessage(loadProps.getProperty("expectedregmsg"),gettext(By.xpath("//div[@class='result']")));
    }
    public void clickOnContinueButton()
    {
        clickOnLocator(By.name("register-continue"));
    }


}
