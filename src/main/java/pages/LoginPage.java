package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage {

    @FindBy(id = "user_contact_number")
    private WebElement contactNumTextBox;
    @FindBy(id = "mobile_number_next_button")
    private WebElement continueButton;
    @FindBy(id = "mob_confirm_option")
    private WebElement confirmMobileButton;
    @FindBy(id = "otp_screen_title")
    private WebElement otpTitle;
    @FindBy(id = "edit_text1")
    private WebElement otpTextBoxOne;
    @FindBy(id = "edit_text2")
    private WebElement otpTextBoxTwo;
    @FindBy(id = "edit_text3")
    private WebElement otpTextBoxThree;
    @FindBy(id = "user_name")
    private WebElement userNameTextBox;
    @FindBy(id = "edit_text4")
    private WebElement otpTextBoxFour;
    @FindBy(id = "ok")
    private WebElement okButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterContactNumberAndContinue(String contactNum) {
        sleepInSeconds(2);
        contactNumTextBox.sendKeys(contactNum);
        continueButton.click();
    }

    public void provideMyNumConsent() {
        confirmMobileButton.click();
    }

    public void enterOtp(int i, int j, int k, int l) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(otpTitle));
        otpTextBoxOne.sendKeys(String.valueOf(i));
        otpTextBoxTwo.sendKeys(String.valueOf(j));
        otpTextBoxThree.sendKeys(String.valueOf(k));
        otpTextBoxFour.sendKeys(String.valueOf(l));
    }

    public void enterUserName(String userName) {
        userNameTextBox.clear();
        userNameTextBox.sendKeys(userName);
        okButton.click();
    }
}
