package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy (id = "UserName")
    public WebElement userNameBox;

    @FindBy (id = "Password")
    public WebElement passwordBox;

    @FindBy (id = "btnSubmit")
    public WebElement logInButton;

    @FindBy (xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public WebElement createAccountButton;

    @FindBy (id = "UserName")
    public WebElement regUserNameBox;

    @FindBy (id = "Password")
    public WebElement regPasswordBox;

    @FindBy (id = "Email")
    public WebElement regEmailBox;

    @FindBy (id = "NameSurname")
    public WebElement regNameSurnameBox;

    @FindBy (id = "PhoneNo")
    public WebElement regPhoneBox;

    @FindBy (id = "SSN")
    public WebElement regSSNBox;

    @FindBy (id = "DrivingLicense")
    public WebElement regDriverLicenceBox;

    @FindBy (id = "IDCountry")
    public WebElement regCountryBox;

    @FindBy (id = "IDState")
    public WebElement regStateBox;

    @FindBy (id = "Address")
    public WebElement regAddressBox;

    @FindBy (id = "WorkingSector")
    public WebElement regWorkingBox;

    @FindBy (id = "BirthDate")
    public WebElement regBirthdateBox;

    @FindBy (id = "btnSubmit")
    public WebElement SaveButton;




























}
