package CucumberProject;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage{
    BrowserSelector browserSelector=new BrowserSelector();

    //before method
    @Before
    public void openBrowser()
    {
        browserSelector.SetUpBrowser();
    }
    //after method
    @After
    public void closeBrowser()
    {
        //screenshot
        //takeScreenshot();
        //quit
        //driver.quit();
    }
}
