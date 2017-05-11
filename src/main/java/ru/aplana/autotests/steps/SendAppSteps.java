package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import ru.aplana.autotests.pages.SendAppPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by Maria on 06.05.2017.
 */
public class SendAppSteps {

    SendAppPage sendAppPage;

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        sendAppPage.fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = sendAppPage.getFillField(field);
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String field, String value){
        sendAppPage.checkFieldErrorMessage(field, value);
    }

    @Step("заголовок страницы - Отправить заявку равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = sendAppPage.title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }
}
