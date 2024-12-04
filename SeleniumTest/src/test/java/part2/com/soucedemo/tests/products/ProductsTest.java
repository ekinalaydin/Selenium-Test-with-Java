package part2.com.soucedemo.tests.products;

import com.saucedemo.page.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.soucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "Product header is not displayed");
    }

}
