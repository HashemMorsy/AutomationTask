package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.P02_home;
import pages.P03_login;

import static org.example.stepDefs.Hooks.driver;

public class D02_loginStepDef {
    private final P03_login login = new P03_login(driver);
    private final P02_home home = new P02_home(driver);

    @Given("user go to login page")
    public void user_go_to_login_page() {
        home.clickLoginLink();

    }

    @When("user login with {string} and {string}")
    public void loginWithAnd(String arg1, String arg2) {
        login.setEmail(arg1);
        login.setPassword(arg2);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.clickLoginButton();
    }


    @And("user clicks on logout button")
    public void userClicksOnLogoutButton() {
        home.clickLogoutLink();
    }


    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //1
        soft.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

        //2
        soft.assertTrue(home.MyAccountTab().isDisplayed(),
                "my account tab not found");
        soft.assertAll();
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String expected = "Login was unsuccessful";
        String actual = home.getErrorMessage();
        SoftAssert soft = new SoftAssert();
        //1
        soft.assertEquals(actual.contains(expected), true);
        //2
        soft.assertAll();
    }


    @Then("user log out successfully")
    public void userLogOutSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //1
        soft.assertEquals(home.loginButton().isDisplayed(), true);

        //2
        soft.assertEquals(home.registerButton().isEnabled(), true);

        //2
        soft.assertTrue(driver.findElements(By.xpath("//a[@class= 'ico-account']")).size() < 1);

        soft.assertAll();
    }
}

