package com.testrealpage.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.testrealpage.Userinterface.RealPageHome.BTN_BLOUSES;

public class SeleccionarBlouses implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN_BLOUSES));

    }

    public static SeleccionarBlouses page(){
        return Tasks.instrumented(SeleccionarBlouses.class);
    }
}
