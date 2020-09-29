package com.testrealpage.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.testrealpage.Userinterface.RealPageHome.*;

public class SeleccionarViewBlouses implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_QUICK_VIEW_BLOUSE));
    }

    public  static SeleccionarViewBlouses page(){
        return Tasks.instrumented(SeleccionarViewBlouses.class);
    }
}
