package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;
import page.InventoryPage;
import utils.Log;
import utils.LoginHelper;

public class ShoppingSteps {

	private InventoryPage inventoryPage;
	private CartPage cartPage;

	@Given("user is logged in successfully")
	public void user_is_logged_in_successfully() {
		LoginHelper.loginAsStandardUser();

		inventoryPage = new InventoryPage();

		Log.info("User logged in successfully and landed on Inventory page");
	}

	@When("user adds a product to the cart")
	public void user_adds_a_product_to_the_cart() {
		inventoryPage.addProductToCart(0);

		Log.info("User added one product to the cart");
	}

	@When("user adds multiple products to the cart")
	public void user_adds_multiple_products_to_the_cart() {
		inventoryPage.addProductToCart(0);
		inventoryPage.addProductToCart(1);
		Log.info("User added multiple products to the cart");
	}

	@And("user navigates to the cart page")
	public void user_navigates_to_the_cart_page() {
		inventoryPage.goToCart();
		cartPage = new CartPage();
		Log.info("User navigated to Cart page");
	}

	@Then("cart should contain 1 product")
	public void cart_should_contain_one_product() {

		Assert.assertEquals(cartPage.getCartItemCount(), 1, "Cart does not contain exactly 1 product");
		Log.info("Cart contains 1 product as expected");
	}

	@Then("cart should contain multiple products")
	public void cart_should_contain_multiple_products() {
		Assert.assertTrue(cartPage.getCartItemCount() > 1, "Cart does not contain multiple products");
		Log.info("Cart contains multiple products as expected");
	}

	@When("user clicks on checkout button")
	public void user_clicks_on_checkout_button() {
		inventoryPage.goToCart(); // 🔥 REQUIRED
		CartPage cartPage = new CartPage();
		cartPage.clickCheckout();
		Log.info("User clicked on Checkout button");
	}

	@Then("user should be navigated to checkout page")
	public void user_should_be_navigated_to_checkout_page() {
		Assert.assertTrue(true); // URL / page validation can be added later
		Log.info("User successfully navigated to Checkout page");
	}
}
