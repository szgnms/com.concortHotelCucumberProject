package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
    @FindBy (id = "NameSurname")
    public WebElement nameSurnameBox;

    @FindBy (id = "Email")
    public WebElement emailBox;

    @FindBy (id = "PhoneNo")
    public WebElement phoneBox;

    @FindBy (id = "Subject")
    public WebElement subjectBox;

    @FindBy (id = "Message")
    public WebElement messageBox;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement sendMessageButton;



}
