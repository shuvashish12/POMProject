package xyz_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ManagerPage {
    WebDriver driver;
    public ManagerPage(WebDriver driver){
        this.driver = driver;
    }
    public void validateButtonPresent(){
        Assert.assertTrue(driver.findElement(By.cssSelector("[ng-click='addCust()']")).isDisplayed());

        WebElement element1 = driver.findElement(By.cssSelector("[ng-click='openAccount()']"));
        Assert.assertTrue(element1.isDisplayed());

        Assert.assertTrue(driver.findElement(By.cssSelector("[ng-click='showCust()']")).isDisplayed());
    }
}
