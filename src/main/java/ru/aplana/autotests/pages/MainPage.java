package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainPage extends PageObject{

    @FindBy(xpath = "//ul[@class='pNav btn redshdw']")
     WebElement menuItems;

    @FindBy(xpath = "//center[@class='first-center']")
     WebElementFacade productCollection;

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//a[@title='"+ itemName +"']")).click();
    }

    public void selectProduct(String productName){
        menuItems.findElement(By.xpath("//*[text()='"+productName +"']")).click();
    }
}
