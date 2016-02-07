package SomeOrganization.enterAplication;

import SomeOrganization.pageObject.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ${Nazar_Kosar} on 06.02.16.
 */
public class SearchPage extends Page {
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class = 'b_search big_searh']/input[@class = 'form-text']")
    public WebElement inputData;

    public SearchResultPage clickOnInputField() throws InterruptedException {
        inputData.click();
        inputData.sendKeys("Топ");
        inputData.sendKeys(Keys.ENTER);
        return PageFactory.initElements(webDriver, SearchResultPage.class);
    }

    public SearchResultPage inputTitleValue() throws InterruptedException{
        inputData.click();
        inputData.sendKeys("Порошенко");
        inputData.sendKeys(Keys.ENTER);
        return PageFactory.initElements(webDriver, SearchResultPage.class);
    }
}
