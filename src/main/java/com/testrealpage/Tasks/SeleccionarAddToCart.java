package com.testrealpage.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.testrealpage.Userinterface.RealPageHome.BTN_ADDTOCART;

public class SeleccionarAddToCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN_ADDTOCART));

    }

    public static SeleccionarAddToCart page()
    {
        return Tasks.instrumented(SeleccionarAddToCart.class);
    }
}
