import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomerPage {
    WebDriver driver = Browser.driver;

    public void validateCustomerPage(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("customer"));
    }
}
