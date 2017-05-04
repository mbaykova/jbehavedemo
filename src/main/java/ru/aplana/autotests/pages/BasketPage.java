package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Maria on 29.04.2017.
 */
public class BasketPage extends PageObject {

    @FindBy(xpath = "//table//td[@class='maybeAds']")
     WebElement title;

    @FindBy(xpath = ".//*[text()='Оформить']")
     WebElement submitButton;

    @FindBy(xpath = "//*[@class='subtotal-sum']")
     WebElement amountLabel;

    public WebElement getTitleButton() {
        return title;
    }

    public WebElement getAmountLabel() {
        return amountLabel;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
