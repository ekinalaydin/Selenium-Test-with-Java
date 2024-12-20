package part3_4.com.demoqa.tests.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicHobbyCheckbox();
        formsPage.unclickReadingHobbyCheckbox();

        boolean isReadingCheckboxSelected = formsPage.isReadingHobbyCheckboxSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "Checkbox is selected");
    }
}
