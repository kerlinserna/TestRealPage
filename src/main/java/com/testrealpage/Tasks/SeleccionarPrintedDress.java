package com.testrealpage.Tasks;

import static com.testrealpage.Userinterface.RealPageHome.BTN_QUICK_VIEW_DRESSES;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarPrintedDress implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN_QUICK_VIEW_DRESSES));

    }
    public static SeleccionarPrintedDress page(){
        return Tasks.instrumented(SeleccionarPrintedDress.class);
    }
}
