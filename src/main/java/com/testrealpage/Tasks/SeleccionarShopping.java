package com.testrealpage.Tasks;

import static com.testrealpage.Userinterface.RealPageHome.BTN_VIEW_SHOPPING;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarShopping implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN_VIEW_SHOPPING));

    }
    public static SeleccionarShopping page(){
        return Tasks.instrumented(SeleccionarShopping.class);
    }
}
