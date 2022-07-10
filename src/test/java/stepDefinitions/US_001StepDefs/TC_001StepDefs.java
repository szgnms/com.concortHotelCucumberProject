package stepDefinitions.US_001StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_001StepDefs  {

    HomePage homePage= new HomePage();

    @Given("go to concorthotel url")
    public void goToConcorthotelUrl() {
        ReusableMethods.anasayfa();
    }

    @Then("check avaibility of the homeButton")
    public void checkAvaibilityOfTheHomeButton() {
       // ReusableMethods.waitForVisibility(homePage.homePageButton,15);
        ReusableMethods.waitFor(5);
        System.out.println(homePage.homePageButton.getText());
      //  Assert.assertTrue(homePage.homePageButton.isDisplayed());


    }

    @And("check avaibility of the roomsButton")
    public void checkAvaibilityOfTheRoomsButton() {
        assert homePage.roomsButton.isDisplayed();
    }

    @And("check avaibility of the restaurantButton")
    public void checkAvaibilityOfTheRestaurantButton() {
        assert homePage.restaurantButton.isDisplayed();
    }

    @And("check avaibility of the aboutButton")
    public void checkAvaibilityOfTheAboutButton() {
        assert homePage.aboutButton.isDisplayed();
    }

    @And("check avaibility of the blogButton")
    public void checkAvaibilityOfTheBlogButton() {
        assert homePage.blogButton.isDisplayed();
    }

    @And("check avaibility of the contactButton")
    public void checkAvaibilityOfTheContactButton() {
        assert homePage.contactButton.isDisplayed();
    }

    @And("check avaibility of the loginButton")
    public void checkAvaibilityOfTheLoginButton() {
        assert homePage.loginButton.isDisplayed();
    }
}
