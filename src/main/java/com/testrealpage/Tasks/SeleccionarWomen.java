package com.testrealpage.Tasks;


import static com.testrealpage.Userinterface.RealPageHome.BTN_WOMEN;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarWomen implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_WOMEN));
    }

    public static SeleccionarWomen page(){
        return Tasks.instrumented(SeleccionarWomen.class);
    }
}
