package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RestaurantPage {

    @FindBy (xpath = "//*[@class='ml-md-0']")
    public WebElement ourRestorantsText;

    @FindBy (xpath = "(//*[@class='container']//h2)[2]")
    public WebElement ourMenuText;

    @FindBy (xpath = "//div[@class='desc pl-3']")
    public WebElement MenuItems;
}
