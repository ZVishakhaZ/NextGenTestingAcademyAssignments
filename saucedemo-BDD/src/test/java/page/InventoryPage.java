package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import utils.DriverFactory;

public class InventoryPage extends BasePage {

	@FindBy(className = "inventory_item_name")
    List<WebElement> products;

    @FindBy(xpath = "//button[starts-with(@id,'add-to-cart')]")
    List<WebElement> addToCartBtns;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public InventoryPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void addProductToCart(int index) {
        addToCartBtns.get(index).click();
    }

    public void goToCart() {
        cartIcon.click();
    }

    public int getNumberOfProducts() {
        return products.size();
    }

}
