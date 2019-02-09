import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FirstTestStepDef {
    @Given("^login page is testing$")
    public void login_page_is_testing() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("surendra","surendra");
    }

    @When("^enters username as \"([^\"]*)\" And password as \"([^\"]*)\"$")
    public void enters_username_as_And_password_as(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1+"---"+arg2);
        Assert.assertEquals(arg1,"surendra");
        Assert.assertEquals(arg2,"surendra");
    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("surendra","surendra");
    }

}
