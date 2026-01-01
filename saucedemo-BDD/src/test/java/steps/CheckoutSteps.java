package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;
import page.CheckoutCompletePage;
import page.CheckoutInformationPage;
import page.CheckoutOverviewPage;
import page.InventoryPage;
import utils.Log;
import utils.LoginHelper;

public class CheckoutSteps {

	private InventoryPage inventoryPage;
	private CartPage cartPage;
	private CheckoutInformationPage checkoutInfoPage;
	private CheckoutOverviewPage checkoutOverviewPage;
	private CheckoutCompletePage checkoutCompletePage;

	@Given("user has items in the cart and is on checkout information page")
	public void user_has_items_in_cart_and_is_on_checkout_information_page() {

		// Login
		 LoginHelper.loginAsStandardUser();

		// Add product & go to cart
		inventoryPage = new InventoryPage();
		inventoryPage.addProductToCart(0);
		inventoryPage.goToCart();
		Log.info("Product added to cart");

		// Go to checkout
		cartPage = new CartPage();
		cartPage.clickCheckout();
		Log.info("Navigated to Checkout Information page");

		checkoutInfoPage = new CheckoutInformationPage();
	}

	@When("user enters checkout information")
	public void user_enters_checkout_information() {
		checkoutInfoPage.fillInformation("John", "Doe", "400001");
		Log.info("Checkout information entered");
	}

	@And("user continues to checkout overview")
	public void user_continues_to_checkout_overview() {
		checkoutOverviewPage = new CheckoutOverviewPage();
		Assert.assertTrue(checkoutOverviewPage.getNumberOfItems() > 0, "No items present on checkout overview page");
		Log.info("User is on Checkout Overview page with items");
	}

	@Then("checkout overview should display selected items")
	public void checkout_overview_should_display_selected_items() {
		Assert.assertTrue(checkoutOverviewPage.getNumberOfItems() > 0,
				"Checkout overview does not show selected items");
		Log.info("Checkout overview displays selected items");
	}

	@When("user confirms the order")
	public void user_confirms_the_order() {
		checkoutOverviewPage.clickFinish();
		checkoutCompletePage = new CheckoutCompletePage();
		Log.info("User clicked Finish to confirm order");
	}

	@Then("order should be placed successfully")
	public void order_should_be_placed_successfully() {
		Assert.assertTrue(checkoutCompletePage.getCompleteHeader().contains("Thank you for your order!"),
				"Order was not placed successfully");
		Log.info("Order placed successfully");
	}

	@Then("thank you message should be displayed")
	public void thank_you_message_should_be_displayed() {
		Assert.assertTrue(checkoutCompletePage.getCompleteText().length() > 0, "Thank you message not displayed");
		Log.info("Thank you message displayed on order completion page");
	}
}
