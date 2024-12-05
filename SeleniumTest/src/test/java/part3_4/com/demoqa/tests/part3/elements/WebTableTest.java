package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable() {
        var webTablePage = homePage.goToElements().clickWebTables();
        String email = "alden@example.com";
        String expectedAge = "33";
        webTablePage.clickEdit(email);
        webTablePage.setAge("33");
        webTablePage.clickSubmit();

        String actualAge = webTablePage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge, "\n Actual and expected age is different");
    }
}
