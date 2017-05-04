package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Maria on 29.04.2017.
 */
public class CheckOutPage extends PageObject {

    @FindBy(xpath = "//div[contains(@class,'mainForm')]//h2")
     WebElement title;

    @FindBy(id = "custumerName")
     WebElement name;

    @FindBy(id = "custumerPhone")
     WebElement phone;

    @FindBy(id = "custumerStreet")
     WebElement street;

    @FindBy(id = "custumerHome")
     WebElement home;

    @FindBy(name = "custumer[building]")
     WebElement building;

    @FindBy(name = "custumer[structure]")
     WebElement corpus;

    @FindBy(id = "custumerPorch")
     WebElement entrance;

    @FindBy(id = "custumerFloor")
     WebElement floor;

    @FindBy(id = "custumerNumber")
     WebElement apartment;

    @FindBy(id = "custumerCode")
     WebElement intercom;

    public CheckOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }




    public CheckOutPage fillField(String field, String value) {
        switch (field) {
            case "Имя":
                fillField(name, value);
                break;
            case "Телефон":
                fillField(phone, value);
                break;
            case "Улица":
                fillField(street, value);
                break;
            case "Дом":
                fillField(home, value);
                break;
            case "Корпус":
                fillField(corpus, value);
                break;
            case "Подъезд":
                fillField(entrance, value);
                break;
            case "Строение":
                fillField(building, value);
                break;
            case "Этаж":
                fillField(floor, value);
                break;
            case "Квартира":
                fillField(apartment, value);
                break;
            case "Домофон":
                fillField(intercom, value);
                break;
        }
        return this;
    }

    public String getFillField(String field){
        switch (field) {
            case "Имя":
                return getFillField(name);
            case "Телефон":
                return getFillField(phone);
            case "Улица":
                return getFillField(street);
            case "Дом":
                return getFillField(home);
            case "Корпус":
                return getFillField(corpus);
            case "Подъезд":
                return getFillField(entrance);
            case "Строение":
                return getFillField(building);
            case "Этаж":
                return getFillField(floor);
            case "Квартира":
                return getFillField(apartment);
            case "Домофон":
                return getFillField(intercom);
        }
        throw new AssertionError("Поле " + field + "не объявлено на странице");
    }

    private void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    private String getFillField(WebElement element){
        return element.getAttribute("value");
    }

}
