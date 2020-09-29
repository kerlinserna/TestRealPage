package com.testrealpage.Questions;

import static com.testrealpage.Userinterface.ShoppingCartPage.BTN__PRODUCTS_QUANTITY;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTotalProducts implements Question<String> {
 
    
    @Override
    public String answeredBy(Actor actor) {        
        return BTN__PRODUCTS_QUANTITY.resolveFor(actor).getText();
    }
    
    public static ValidarTotalProducts formaResumen() {
        return new ValidarTotalProducts();
    }
}
