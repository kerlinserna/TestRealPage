package com.testrealpage.Tasks;

import static com.testrealpage.Userinterface.RealPageHome.BTN_DRESSES;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarDresses implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN_DRESSES));

    }
    public static SeleccionarDresses page(){
        return Tasks.instrumented(SeleccionarDresses.class);
    }
}
