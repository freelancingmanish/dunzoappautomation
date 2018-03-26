package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class CreateAnOrderPage extends BasePage {

    @FindBy(id = "task_type_root")
    private List<WebElement> allOrderTypes;
    @FindBy(id = "discovery_item_title")
    private List<WebElement> itemTypes;
    @FindBy(id = "discovery_item_title")
    private List<WebElement> storeNames;
    @FindBy(id = "item_name_edittxt")
    private WebElement itemNameTextBox;
    @FindBy(id = "add_quantity_button")
    private WebElement addQuantityButton;
    @FindBy(id = "continue_btn")
    private WebElement continueButton;
    @FindBy(id = "data")
    private WebElement savedAddressBlock;
    @FindBy(id = "discard_task_btn")
    private WebElement discardTaskButton;

    public CreateAnOrderPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectBuyOption() {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOf(discardTaskButton));
        allOrderTypes.get(1).click();
    }

    public void selectMedicalSuppliesAndSelectFirstResult() {
        sleepInSeconds(5);
        itemTypes.get(2).click();
        sleepInSeconds(2);
        storeNames.get(0).click();
    }

    public void enterMedicineNameAndQuantityAndContinue(String name, int quantity) {
        itemNameTextBox.sendKeys(name);
        for (int i = 0; i < quantity; i++) {
            addQuantityButton.click();
        }
        continueButton.click();
    }

    public void selectSavedAddressAndOrderNow() {
        sleepInSeconds(5);
        savedAddressBlock.click();
        sleepInSeconds(3);
        continueButton.click();
    }
}
