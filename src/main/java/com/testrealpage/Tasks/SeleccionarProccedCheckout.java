package com.testrealpage.Tasks;

import static com.testrealpage.Userinterface.ShoppingCartPage.BTN__PROCCED_CHECKOUT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProccedCheckout  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Click.on(BTN__PROCCED_CHECKOUT));

    }
    public static SeleccionarProccedCheckout page(){
        return Tasks.instrumented(SeleccionarProccedCheckout.class);
    }
}
