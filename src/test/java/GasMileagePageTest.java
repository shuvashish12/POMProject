import org.testng.annotations.Test;

public class GasMileagePageTest {

    @Test
    public void test1(){
        PageHelper helper = new PageHelper();
        helper.openBrowser();
        HomePage homePage = new HomePage(helper.driver);
        homePage.searchCalculator("Gas Mileage Calculator");
        GasMileagePage gasMileagePage = new GasMileagePage(helper.driver);
        gasMileagePage.validateGasMileagePage();
    }
}
