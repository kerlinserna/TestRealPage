package com.testrealpage.Tasks;

import static com.testrealpage.Userinterface.RealPageHome.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RealizarBuy implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) 
    {
       	actor.attemptsTo(Click.on(BTN_WOMEN),
    				Click.on(BTN_DRESSES),
    				Click.on(BTN_EVENING_DRESSES),
    				Click.on(BTN_QUICK_VIEW_DRESSES),
    				Click.on(BTN_ADDTOCART),
    				Click.on(BTN_CONTINUESHOPPING));
       	
    	actor.attemptsTo(Click.on(BTN_WOMEN),
    					Click.on(BTN_TOPS),
    					Click.on(BTN_BLOUSES),
    					Click.on(BTN_QUICK_VIEW_BLOUSE),
    					Click.on(BTN_ADDTOCART),
    					Click.on(BTN_CONTINUESHOPPING));
    
    }

    public static RealizarBuy page()
    {
        return Tasks.instrumented(RealizarBuy.class);
    }
}
