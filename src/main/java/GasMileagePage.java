import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GasMileagePage {
    WebDriver driver;
    GasMileagePage(WebDriver driver){
        this.driver = driver;
    }

    public void validateGasMileagePage(){
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("gas"));
        String header = driver.findElement(By.tagName("h1")).getText();
        System.out.println("*********  "+header);
        Assert.assertTrue(header.contains("Gas"));
    }
}
