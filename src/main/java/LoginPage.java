import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(css = "[ng-click='customer()']") private WebElement customerLogin;
    @FindBy(css = "[ng-click='manager()']") private WebElement managerLogin;

    public CustomerPage clickOnCustomerLoginButton(){
        customerLogin.click();
        return PageFactory.initElements(Browser.driver, CustomerPage.class);

    }

}
