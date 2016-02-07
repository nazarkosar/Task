package SomeOrganization.testCases.TestBase;

import SomeOrganization.enterAplication.SearchPage;
import SomeOrganization.webDriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by ${Nazar_Kosar} on 06.02.16.
 */
public class TestBase {
    protected WebDriver webDriver;
    protected SearchPage searchPage;

    @BeforeMethod
    @Parameters({"browserName"})
    public void setup(String browserName) throws Exception {
        webDriver = WebDriverFactory.getInstance(browserName);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        webDriver.get("http://24tv.ua/search/search.do");
        searchPage = PageFactory.initElements(webDriver, SearchPage.class);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (webDriver != null) {
            WebDriverFactory.killDriverInstance();
        }
    }
}
