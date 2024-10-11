import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.AddToCartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTests {
    private SHAFT.GUI.WebDriver driver;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate first & second products are in cart")
    private void validateAddToCart() {
        new AddToCartPage(driver).navigateToURL("https://automationexercise.com/")
                .ValidateHomePage().clickOnProductButton().clickOnFirstAddToCartButton()
                .clickOnContinueShoppingButton().clickOnSecondAddToCartButton()
                .clickOnViewCardButton().ValidateFirstProductInCart().ValidateSecondProductInCart()
                .ValidatePrice1().ValidatePrice2().ValidateQuantity1().ValidateQuantity2()
                .ValidateTotalPrice1().ValidateTotalPrice2();
    }
}