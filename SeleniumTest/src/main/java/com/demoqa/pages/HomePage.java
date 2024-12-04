package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementsJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        scrollToElementsJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
