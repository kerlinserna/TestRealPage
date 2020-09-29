package com.testrealpage.Tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import com.testrealpage.Userinterface.RealPageHome;

public class Abrir implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new RealPageHome()));
    }

    public static Abrir navegador() {

        return Tasks.instrumented(Abrir.class);
    }
}
