package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.autotests.pages.PizzaPage;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maria on 29.04.2017.
 */
public class ProductPageSteps extends ScenarioSteps {

    PizzaPage pizzaPage;

    @Step("выполнен переход к странице - корзина")
    public void goToBasketPage(){
        pizzaPage.getBasketButton().click();
    }

    @Step("заголовок страницы равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = pizzaPage.getTitleButton().getText();
        assertEquals(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), expectedTitle, actualTitle);
    }

    @Step("сохранено значение итоговой суммы")
    public void getAmount(String variable){
        System.setProperty(variable, pizzaPage.getAmountLabel().getText());
    }

    @Step("добавить в корзину")
    public void addToBasket(){
      pizzaPage.getAddToBasketBtn().click();
    }


}
