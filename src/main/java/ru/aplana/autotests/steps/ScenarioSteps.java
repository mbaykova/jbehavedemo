package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

/**
 * Created by Maria on 01.05.2017.
 */
public class ScenarioSteps {

    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    ProductPageSteps productPageSteps;

    @Steps
    BasketPageSteps basketPageSteps;

    @Steps
    CheckOutPageSteps checkOutPageSteps;

    @When("выбран пункт меню \"$menuName\"")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("выбран продукт с наименованием \"$productName\"")
    public void selectProduct(String productName){
        mainPageSteps.selectProductItem(productName);
    }

    @When("выполнен переход к старнице - корзина")
    public void goToBasketPage(){
        productPageSteps.goToBasketPage();
    }

    @Then("заголвок страницы - продукт равен \"$productName\"")
    public void checkTitleProductPage(String productName){
        productPageSteps.checkPageTitle(productName);
    }

    @When("сохранено значение итоговой суммы в переменную \"$variable\"")
    public void saveTotalAmount(String variable){
        productPageSteps.getAmount(variable);
    }

    @When("выполнено нажатие на кнопку - Добавить в корзину")
    public void addToBasket(){
        productPageSteps.addToBasket();
    }

    @Then("заголвок страницы - корзина равен \"$title\"")
    public void checkTitleBasketPage(String title){
        basketPageSteps.checkPageTitle(title);
    }

    @Then("итоговая сумма равна \"$variable\"")
    public void checkTotalAmount(String variable){
        variable = System.getProperty(variable);
        basketPageSteps.checkAmount(variable);
    }

    @When("выполнен переход к старнице - оформление заказа")
    public void goToCheckOutPage(){
        basketPageSteps.goToCheckOutPage();
    }

    @When("заполняются поля: $fields")
    public void fillForm(ExamplesTable fields){
        for (Map<String, String> row : fields.getRows()) {
            String field = row.get("field");
            String value = row.get("value");
            checkOutPageSteps.fillField(field, value);
        }
    }


    @Then("значения полей равны: $fields")
    public void checkFillForm(ExamplesTable fields){
        for (Map<String, String> row : fields.getRows()) {
            String field = row.get("field");
            String value = row.get("value");
            checkOutPageSteps.checkFillField(field, value);
        }
    }


}
