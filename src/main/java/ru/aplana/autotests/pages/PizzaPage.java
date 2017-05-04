package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maria on 29.04.2017.
 */
public class PizzaPage extends PageObject {

    @FindBy(xpath = "//h1[@class='myRed']")
     WebElement title;

    @FindBy(xpath = ".//*[text()='ЗАКАЗАТЬ']")
     WebElement addToBasketBtn;

    @FindBy(xpath = "//div[contains(text(),'итого')]/b")
     WebElement amountLabel;

    @FindBy(xpath = ".//div[text()='КОРЗИНА']")
     WebElement basketButton;


    public WebElement getAddToBasketBtn() {
        return addToBasketBtn;
    }

    public WebElement getAmountLabel() {
        return amountLabel;
    }

    public WebElement getBasketButton() {
        return basketButton;
    }

    public WebElement getTitleButton() {
        return title;
    }
}
