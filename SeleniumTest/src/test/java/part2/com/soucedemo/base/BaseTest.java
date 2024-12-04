package part2.com.soucedemo.base;

import com.base.BasePage;
import com.saucedemo.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com";

@BeforeClass
    public void setUp() throws Exception {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(url);
    basePage = new BasePage();
    basePage.setDriver(driver);
    loginPage = new LoginPage();
}
@AfterClass
    public void tearDown() throws Exception {
    driver.quit();
}
}
