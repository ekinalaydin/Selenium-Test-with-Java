package com.saucedemo.page;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
    private final By productsHeader = By.xpath("//span[text()='Products']");
    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }
}

