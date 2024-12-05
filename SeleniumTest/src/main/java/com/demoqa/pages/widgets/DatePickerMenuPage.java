package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;

public class DatePickerMenuPage extends WidgetsPage {
    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    //ayni pathi kullanmamiz gerekiyorsa birden fazla bunu private method icine koyariz

    public void clickDay(String day) {
        click(dayValue(day));
    }

    public void clickSelectDate() {
        click(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getAttribute("value");
        //get Text kullanmadik cunku inspect yaptigimizda text alani
        //gormedik bunun yerine value ve input alanlari vardi
        //burada value date'i iceriyor.
        //class bulmak icin . , id bulmak icin # (CSS)
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month);

    }

    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year);

    }
}
