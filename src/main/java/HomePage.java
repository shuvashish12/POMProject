import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    WebDriver driver;

    HomePage(WebDriver driver){
        this.driver = driver;
    }

    //WebElement searchElement = driver.findElement(By.id("calcSearchTerm"));

    public void searchCalculator(String searchText){
       WebElement searchElement = driver.findElement(By.id("calcSearchTerm"));
        searchElement.sendKeys(searchText);
        driver.findElement(By.linkText(searchText)).click();
    }
}