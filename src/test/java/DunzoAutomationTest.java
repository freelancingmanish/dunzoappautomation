import org.testng.annotations.Test;
import pages.CreateAnOrderPage;
import pages.LoginPage;
import utils.TestManager;


public class DunzoAutomationTest extends TestManager {

    @Test
    public void loginTest() {
        new LoginPage().enterContactNumberAndContinue("3000000000");
        new LoginPage().provideMyNumConsent();
        new LoginPage().enterOtp(0, 0, 0, 0);
        new LoginPage().enterUserName("Automation Wiz");
    }

    @Test
    public void orderTest() {
        new CreateAnOrderPage().selectBuyOption();
        new CreateAnOrderPage().selectMedicalSuppliesAndSelectFirstResult();
        new CreateAnOrderPage().enterMedicineNameAndQuantityAndContinue("PARACETAMOL", 6);
        new CreateAnOrderPage().selectSavedAddress();
    }
}
