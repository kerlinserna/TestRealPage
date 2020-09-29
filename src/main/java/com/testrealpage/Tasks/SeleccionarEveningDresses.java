package com.testrealpage.Tasks;

import static com.testrealpage.Userinterface.RealPageHome.BTN_EVENING_DRESSES;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarEveningDresses implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN_EVENING_DRESSES));

    }

    public static SeleccionarEveningDresses page()
    {
        return Tasks.instrumented(SeleccionarEveningDresses.class);
    }
}
