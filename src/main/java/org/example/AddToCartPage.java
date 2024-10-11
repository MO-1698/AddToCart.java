package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AddToCartPage {
    private SHAFT.GUI.WebDriver driver;

    public AddToCartPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By ProductButton = By.xpath("//a[@href=\"/products\"]//i[@class=\"material-icons card_travel\"]");
    private By FirstAddToCartButton = By.xpath("//div[@class='features_items']//div[contains(@class, 'single-products')][1]//div[@class='productinfo text-center']//a[contains(@class, 'add-to-cart') and @data-product-id='1' and contains(text(), 'Add to cart')]");
    private By ContinueShoppingButton = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");
    private By SecondAddToCartButton = By.xpath("//div[@class='features_items']//div[contains(@class, 'single-products')][1]//div[@class='productinfo text-center']//a[contains(@class, 'add-to-cart') and @data-product-id='2' and contains(text(), 'Add to cart')]");
    private By ViewCardButton = By.xpath("//a[@href=\"/view_cart\"]//u");
    private By FirstProductInCart = By.xpath("//a[@href=\"/product_details/1\"]");
    private By SecondProductInCart = By.xpath("//a[@href=\"/product_details/2\"]");
    private By Price1 = By.xpath("//tr[@id=\"product-1\"]//td[@class=\"cart_price\"]//p");
    private By Price2 = By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_price\"]//p");
    private By Quantity1 = By.xpath("//tr[@id=\"product-1\"]//button[@class=\"disabled\"]");
    private By Quantity2 = By.xpath("//tr[@id=\"product-2\"]//button[@class=\"disabled\"]");
    private By TotalPrice1 = By.xpath("//tr[@id=\"product-1\"]//p[@class=\"cart_total_price\"]");
    private By TotalPrice2 = By.xpath("//tr[@id=\"product-2\"]//p[@class=\"cart_total_price\"]");

    public AddToCartPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public AddToCartPage clickOnProductButton() {
        driver.element().click(ProductButton);
        return this;
    }

    public AddToCartPage clickOnFirstAddToCartButton() {
        driver.element().click(FirstAddToCartButton);
        return this;
    }

    public AddToCartPage clickOnContinueShoppingButton() {
        driver.element().click(ContinueShoppingButton);
        return this;
    }

    public AddToCartPage clickOnSecondAddToCartButton() {
        driver.element().click(SecondAddToCartButton);
        return this;
    }

    public AddToCartPage clickOnViewCardButton() {
        driver.element().click(ViewCardButton);
        return this;
    }

    @Step("Validate that the user is on Home Page")
    public AddToCartPage ValidateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that the First Product In Cart")
    public AddToCartPage ValidateFirstProductInCart() {
        driver.element().verifyThat(FirstProductInCart).text().contains("Blue Top");
        return this;
    }

    @Step("Validate that the Second Product In Cart")
    public AddToCartPage ValidateSecondProductInCart() {
        driver.element().verifyThat(SecondProductInCart).text().contains("Men Tshirt");
        return this;
    }

    @Step("Validate that the First Product Price")
    public AddToCartPage ValidatePrice1() {
        driver.element().verifyThat(Price1).text().contains("Rs. 500");
        return this;
    }

    @Step("Validate that the Second Product Price")
    public AddToCartPage ValidatePrice2() {
        driver.element().verifyThat(Price2).text().contains("Rs. 400");
        return this;
    }

    @Step("Validate that the First Product Quantity")
    public AddToCartPage ValidateQuantity1() {
        driver.element().verifyThat(Quantity1).text().contains("1");
        return this;
    }

    @Step("Validate that the Second Product Quantity")
    public AddToCartPage ValidateQuantity2() {
        driver.element().verifyThat(Quantity2).text().contains("1");
        return this;
    }

    @Step("Validate that the First Product TotalPrice")
    public AddToCartPage ValidateTotalPrice1() {
        driver.element().verifyThat(TotalPrice1).text().contains("Rs. 500");
        return this;
    }

    @Step("Validate that the Second Product TotalPrice")
    public AddToCartPage ValidateTotalPrice2() {
        driver.element().verifyThat(TotalPrice2).text().contains("Rs. 400");
        return this;
    }















}