package CucumberProject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = ",@register,@emailAfriend,@registeruserbuyproduct,@Guestuserbuyproduct")
//@register,@emailAfriend,@registeruserbuyproduct,@Guestuserbuyproduct
public class RunTest {


}
