package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ru.aplana.autotests.pages.CheckOutPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by Maria on 29.04.2017.
 */
public class CheckOutPageSteps extends ScenarioSteps {

    CheckOutPage checkOutPage;

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        checkOutPage.fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = checkOutPage.getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));

    }
}
