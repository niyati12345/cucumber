package CucumberProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utlis {
    LoadProps loadProps=new LoadProps();

    public void SetUpBrowser(){
        String browser=loadProps.getProperty("Browser");
      //  //String browser=System.getProperty("Browser");
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserSelector\\geckodriver.exe");
            driver=new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserSelector\\chromedriver.exe");
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resources\\BrowserSelector\\IEDriverServer.exe");
            driver= new InternetExplorerDriver();
        }else
        {
            System.out.println("Your driver is empty or testdata is incorrect" + browser);
        }

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loadProps.getProperty("Url"));
    }
}
