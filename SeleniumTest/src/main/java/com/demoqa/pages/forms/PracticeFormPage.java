package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementsJS;

public class PracticeFormPage extends FormsPage{
    private By femaleRadioButton = By.id("gender-radio-2");

    public void clickFemaleRadioButton() {
        scrollToElementsJS(femaleRadioButton);
        clickJS(femaleRadioButton); // genelde click calisir ama bazi
        //web pagelerde calismayabiliyor bu nedenle farkli bir metod kullanilir

    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }
}
