import org.testng.annotations.Test;

public class XYXBankTest {
    @Test
    public void loginTest(){
        Browser browser = new Browser();

        browser.startBrowser()
                .clickOnCustomerLoginButton()
                .validateCustomerPage();
    }
}
