package cucumberStepDefination;

import io.cucumber.java.en.Given;
import testBase.BaseClass;

public class StepDefination extends BaseClass {
    @Given("I landed to home page")
    public void I_landed_to_home_page(){
        driver.close();
    }

    @Given("^name of the user (.+) and (.+)$")
    public void name_of_the_user_address(String user,String password){

    }
}
