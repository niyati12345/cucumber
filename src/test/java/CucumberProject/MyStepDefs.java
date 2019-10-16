package CucumberProject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    RegistrationPage registrationPage=new RegistrationPage();
    HomePage homePage=new HomePage();
    AppleMacBookProductPage appleMacBookProductPage=new AppleMacBookProductPage();
    EmailAFreindPage emailAFreindPage=new EmailAFreindPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    CheckoutPage checkoutPage=new CheckoutPage();
    CheckOutCompleted checkOutCompleted=new CheckOutCompleted();
    CheckOutAsGuest checkOutAsGuest =new CheckOutAsGuest();

    @Given("^user is on home page$")
    public void user_is_on_home_page() {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegistraionPage();

    }

    @When("^user should able to  fill all details$")
    public void user_should_able_to_fill_all_details() {

        registrationPage.userEnterRegistrationDetails();
    }

    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()  {
        registrationPage.verifyUserRegistersuccessfully();
    }

    @Given("^User is on homepage$")
    public void userIsOnHomepage()
    {
        homePage.clickOnRegisterButton();

    }

    @And("^User registered successfully$")
    public void userRegisteredSuccessfully()
    {
        registrationPage.verifyUserIsOnRegistraionPage();
        registrationPage.userEnterRegistrationDetails();
        registrationPage.verifyUserRegistersuccessfully();
        registrationPage.clickOnContinueButton();

    }

    @When("^Click on any product from homepage$")
    public void clickOnAnyProductFromHomepage() {
        homePage.clickOnMacbbokProduct();

    }

    @Then("^User should send email a friend Successfully$")
    public void userShouldSendEmailAFriendSuccessfully()
    {

        appleMacBookProductPage.verifyUserIsOnMacbbokPage();
        appleMacBookProductPage.applemacbookpage();
        emailAFreindPage.verifyUserIsOnEmailAFreiendPage();
        emailAFreindPage.EmailAFriendPage();
        emailAFreindPage.verifyUserSendEmailToFreindSuccessfully();

    }

    @Given("^user is on a homepage already$")
    public void userIsOnAHomepageAlready() {
        homePage.clickOnMacbbokProduct();
    }

    @When("^click on product from homepage$")
    public void clickOnProductFromHomepage() {
        appleMacBookProductPage.verifyUserIsOnMacbbokPage();
        appleMacBookProductPage.applemacbookpage();
    }

    @Then("^unregister user should not able to refer a product$")
    public void unregisterUserShouldNotAbleToReferAProduct()
    {
        emailAFreindPage.verifyUserIsOnEmailAFreiendPage();
        emailAFreindPage.UnregesiterUserEmailAFriendPage();
        emailAFreindPage.verifyUnRegisterUserNotAbleToSendEmailToFreindSuccessfully();

    }

    @Given("^user register successfully$")
    public void userRegisterSuccessfully() {
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegistraionPage();
        registrationPage.userEnterRegistrationDetails();
        registrationPage.verifyUserRegistersuccessfully();
        registrationPage.clickOnContinueButton();

    }

    @And("^user choose a product Add product To Add to Cart$")
    public void userChooseAProductAddProductToAddToCart() {
        homePage.clickOncomputer();
        buildYourOwnComputerPage.verifyUserIsonBuildComputerPage();
        buildYourOwnComputerPage.clickOnAddToCartForcomputer();
        shoppingCartPage.shoppingCart();

        
    }
    @And("^user is on checkoutpage$")
    public void userIsOnCheckoutpage() {
        checkoutPage.verifyUserIsOnCheckOutPage();
    }

    @When("^user enters all shipping address details$")
    public void userEntersAllShippingAddressDetails()
    {
        checkoutPage.shippingAddress();
    }

    @And("^successfully complete checkout$")
    public void successfullyCompleteCheckout()
    {
        checkOutCompleted.verifyUserIsOnCheckOutComple();
    }

    @Then("^user should place an order successfully$")
    public void userShouldPlaceAnOrderSuccessfully()
    {
        checkOutCompleted.verifyUserOrderSuccessfullyPlaced();
    }


    @And("^user is on checkout as guest page$")
    public void userIsOnCheckoutAsGuestPage()
    {
        checkOutAsGuest.verifyUserIsonCheckOutGuestPage();
        checkOutAsGuest.checkOutGuestPage();
        checkoutPage.verifyUserIsOnCheckOutPage();
        checkoutPage.shippingAddressWithFullDetilas();
    }
}


