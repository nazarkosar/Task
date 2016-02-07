package SomeOrganization.enterAplication;

import SomeOrganization.pageObject.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ${Nazar_Kosar} on 06.02.16.
 */
public class SearchResultPage extends Page {

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    List<WebElement> links = new ArrayList<WebElement>(webDriver.findElements
            (By.xpath("//a[contains(., 'Топ')]")));
    Random generate = new Random();

    public TitlePage clickOnResult() throws InterruptedException {
        links.get(generate.nextInt(links.size())).click();
        return PageFactory.initElements(webDriver, TitlePage.class);
    }

    List<WebElement> titels = new ArrayList<WebElement>(webDriver.findElements
            (By.xpath("//a[contains(., 'Порошенко')]")));

    public SearchResultPage isWordPresent() throws InterruptedException {
        titels.get(generate.nextInt(titels.size())).click();
        return PageFactory.initElements(webDriver, SearchResultPage.class);
    }
}