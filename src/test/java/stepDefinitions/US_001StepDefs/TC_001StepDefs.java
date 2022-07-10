package stepDefinitions.US_001StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TC_001StepDefs extends HomePage  {

  //  HomePage homePage= new HomePage();

    @Given("go to concorthotel url")
    public void goToConcorthotelUrl() {
        ReusableMethods.anasayfa();
    }

    @Then("check avaibility of the homeButton")
    public void checkAvaibilityOfTheHomeButton() throws IOException {

      //  List<WebElement> lst=new ArrayList<>(Driver.getDriver().findElements(By.xpath("//*[@class='navbar-nav ml-auto']//li")));

        for (WebElement w: checkpagelinks
             ) {
            System.out.println(w.getText());
            Assert.assertTrue(w.isDisplayed());
        }





    }

    @And("check avaibility of the roomsButton")
    public void checkAvaibilityOfTheRoomsButton() {
        assert  roomsButton.isDisplayed();
    }

    @And("check avaibility of the restaurantButton")
    public void checkAvaibilityOfTheRestaurantButton() {
        assert  restaurantButton.isDisplayed();
    }

    @And("check avaibility of the aboutButton")
    public void checkAvaibilityOfTheAboutButton() {
        assert  aboutButton.isDisplayed();
    }

    @And("check avaibility of the blogButton")
    public void checkAvaibilityOfTheBlogButton() {
        assert  blogButton.isDisplayed();
    }

    @And("check avaibility of the contactButton")
    public void checkAvaibilityOfTheContactButton() {
        assert  contactButton.isDisplayed();
    }

    @And("check avaibility of the loginButton")
    public void checkAvaibilityOfTheLoginButton() {
        assert  loginButton.isDisplayed();
    }
}
