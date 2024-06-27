package xyz_tests;

import org.testng.annotations.Test;
import xyz_pages.Browser;
import xyz_pages.LoginPage;
import xyz_pages.ManagerPage;

public class ManagerPageTest {
    @Test
    public void test1(){
        Browser browser = new Browser();
        browser.startDriver();
        LoginPage loginPage = new LoginPage(browser.getDriver());
        loginPage.clickOnBankManagerLoginButton();
        ManagerPage managerPage = new ManagerPage(browser.getDriver());
        managerPage.validateButtonPresent();

        

    }
}
