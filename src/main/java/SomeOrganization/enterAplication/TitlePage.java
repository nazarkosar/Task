package SomeOrganization.enterAplication;

import SomeOrganization.pageObject.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by ${Nazar_Kosar} on 06.02.16.
 */
public class TitlePage extends Page {
    public TitlePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='newsName']")
    public WebElement textOfTitle;

    public String titleText() {
        return textOfTitle.getText();
    }
}
