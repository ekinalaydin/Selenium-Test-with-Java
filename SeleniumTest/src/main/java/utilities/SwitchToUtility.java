package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {
    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();

    }

    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
        // our code switch to the alert
        //accept amaci otomatik olarak ok a basmasi

    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }
}
