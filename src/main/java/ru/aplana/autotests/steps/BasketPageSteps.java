package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.autotests.pages.BasketPage;
import ru.aplana.autotests.pages.PizzaPage;

import static org.junit.Assert.assertTrue;


/**
 * Created by Maria on 29.04.2017.
 */
public class BasketPageSteps extends ScenarioSteps{

    BasketPage basketPage;

    @Step("заголовок страницы равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = basketPage.getTitleButton().getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("итоговая сумма равна {0}")
    public void checkAmount(String expectedValue){
        String actualAmount = basketPage.getAmountLabel().getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]", actualAmount, expectedValue), actualAmount.contains(expectedValue));
    }

    @Step("выполнен переход к странице - офрмление заказа")
    public void goToCheckOutPage(){
        basketPage.getSubmitButton().click();
    }

}
