package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import utilities.ReusableMethods;

import java.util.List;

public class HomePage {


    @FindBy (xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homePageButton;

    @FindBy (id = "navRooms")
    public WebElement roomsButton;

    @FindBy (id = "navRestaurant")
    public WebElement restaurantButton;

    @FindBy (id = "navAbout")
    public WebElement aboutButton;

    @FindBy (id = "navBlog")
    public WebElement blogButton;

    @FindBy (id = "navContact")
    public WebElement contactButton;

    @FindBy (id = "navLogon")
    public WebElement loginButton;

    @FindBy (xpath = "//*[@class='row']//label")
    public List<WebElement>  checkElements;

    @FindBy (xpath = "(//*[@class='row']//input)[1]")
    public  WebElement  checkInDate;

    @FindBy (xpath = "(//*[@class='row']//input)[2]")
    public WebElement  checkOutDate;

    @FindBy (xpath = "(//*[@class='form-field'])[1]")
    public WebElement  selectRoom;

    @FindBy (xpath = "(//*[@class='form-field'])[2]")
    public WebElement  selectAdult;

    @FindBy (xpath = "(//*[@class='row']//input)[3]")
    public  WebElement  checkAvailabilityButton;

    @FindBy (xpath = "//*[@class='ml-md-0']")
    public  WebElement  welcomeMessage;

    @FindBy (xpath = "(//*[@class='owl-stage-outer'])[2]")
    public  WebElement  customerMessage;

    @FindBy (xpath = "(//h2)[10]")
    public  WebElement  recentBlogText;

    @FindBy (xpath = "//*[@class='row d-flex']//h3//a")
    public List<WebElement>  recentBlogList;

    @FindBy (xpath = "//*[@class='row mb-5']//h2")
    public List<WebElement>  footerList;

}
