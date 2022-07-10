package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AboutPage {

    @FindBy (xpath = "//span[@class='icon-play']")
    public WebElement videoPlayButton;

    @FindBy (xpath = "//div[@class='col-md-3 d-flex align-self-stretch ftco-animate fadeInUp ftco-animated']")
    public List<WebElement> serviceList;

    @FindBy (xpath = "(//section[@class='instagram']//span)")
    public List<WebElement> instagramPics;

    @FindBy (xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement nextButton;

    @FindBy (xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement previousButton;

    @FindBy (xpath = "//button[@title='Close (Esc)']")
    public WebElement instagramPicsCloseButton;


}
