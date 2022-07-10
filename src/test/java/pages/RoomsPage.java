package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RoomsPage {

    @FindBy (xpath = "//*[@class='mb-3']")
    public List<WebElement> roomsList;

}
