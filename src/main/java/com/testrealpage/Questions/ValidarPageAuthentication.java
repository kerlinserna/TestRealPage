package com.testrealpage.Questions;

import static com.testrealpage.Userinterface.AuthenticationPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarPageAuthentication implements Question<String> {
 
    
    @Override
    public String answeredBy(Actor actor) {        
        return BTN__AUTHENTICATION.resolveFor(actor).getText();
    }
    
    public static ValidarPageAuthentication formaResumen() {
        return new ValidarPageAuthentication();
    }
}
