package SomeOrganization.testCases.SerachTests;

import SomeOrganization.testCases.TestBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ${Nazar_Kosar} on 06.02.16.
 */
public class TestCases extends TestBase {
    @Test
    public void containsTextTest() throws Exception {
        Assert.assertEquals(searchPage.inputTitleValue().isWordPresent().getTitle().contains("Порошенко"), true);
    }

    @Test
    public void testTitleContainText() throws Exception {
        Assert.assertEquals(searchPage.clickOnInputField().clickOnResult().getTitle().contains("Топ"), true);
    }
}
