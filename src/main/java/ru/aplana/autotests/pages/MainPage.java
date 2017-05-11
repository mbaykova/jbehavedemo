package ru.aplana.autotests.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Created by Maria on 29.04.2017.
 */
public class MainPage extends BasePageObject{


    @FindBy(xpath = "//ol[contains(@class,'rgs-menu pull-left')]")
     WebElement menuItems;

    @FindBy(xpath = "//div[contains(@class,'grid rgs-main-menu')]")
    WebElement menuInsurance;

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//li[contains(@class,'current')]/*[contains(text(),'"+itemName+"')]")).click();
    }

    public void selectInsuranceItem(String itemName){
        menuInsurance.findElement(By.xpath(".//li[contains(@class,'line3-link')]//a[contains(text(),'"+itemName+"')]")).click();
    }

}


