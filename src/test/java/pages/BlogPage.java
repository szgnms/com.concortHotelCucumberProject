package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlogPage {

    @FindBy (xpath = "//div[@class='row d-flex']//h3")
    public List<WebElement> blogTexts;

    @FindBy (xpath = "(//section[@class='instagram']//span)")
    public List<WebElement> instagramPics;

    @FindBy (xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement nextButton;

   @FindBy (xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement previousButton;

   @FindBy (xpath = "//button[@title='Close (Esc)']")
    public WebElement instagramPicsCloseButton;


}
