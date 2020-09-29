package com.testrealpage.StepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.testrealpage.Tasks.*;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.testrealpage.Questions.ValidarPageAuthentication;
import com.testrealpage.Questions.ValidarTotalProducts;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class BuyStepDefinitions {


    @Managed(driver = "Chrome")
    WebDriver driver;

    @Before
    public  void doSomethingBefore(){//actor
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^The user is on Homepage$")
    public void theUserIsOnHomepage() {


        theActorCalled(".doSomethingBefore");

        theActorInTheSpotlight().wasAbleTo(Abrir.navegador());
    }

    @Then("^the user clicks Women$")
    public void theUserClicksWomen() {

        theActorInTheSpotlight().attemptsTo(SeleccionarWomen.page());

    }

    @Then("^user clicks Tops$")
    public void userClicksTops() {
        theActorInTheSpotlight().attemptsTo(SeleccionarTops.page());
    }

    @Then("^User Clicks blouses$")
    public void userClicksBlouses() {
        theActorInTheSpotlight().attemptsTo(SeleccionarBlouses.page());

    }

    @Then("^user clicks on add to cart$")
    public void userClicksOnAddToCart() {

        theActorInTheSpotlight().attemptsTo(SeleccionarViewBlouses.page(),SeleccionarAddToCart.page());
    }

    @Given("^the user clicks on continue shopping$")
    public void theUserClicksOnContinueShopping() {
        theActorInTheSpotlight().wasAbleTo(SeleccionarContinuesShopping.page());
    }

    @Then("^the user is returned to the homepage$")
    public void theUserIsReturnedToTheHomepage() {
        theActorInTheSpotlight().attemptsTo(SeleccionarHomePage.page());
    }

    //Scenario 2


    @Then("^user clicks Dresses$")
    public void user_clicks_Dresses() {
        theActorInTheSpotlight().attemptsTo(SeleccionarDresses.page());

    }

    @Then("^User Clicks evening dresses$")
    public void user_Clicks_evening_dresses() {
        theActorInTheSpotlight().attemptsTo(SeleccionarEveningDresses.page());

    }

    @Then("^user clicks on \\(Quick View\\) printed dress$")
    public void user_clicks_on_Quick_View_printed_dress() {
        theActorInTheSpotlight().attemptsTo(SeleccionarPrintedDress.page());

    }

    @Then("^user clicks on add to cart from Pop up$")
    public void user_clicks_on_add_to_cart_from_Pop_up() {
        theActorInTheSpotlight().attemptsTo(SeleccionarAddToCart.page());
    }

    //scenario 3

    @Then("^the user clicks Cart$")
    public void the_user_clicks_Cart() {
        theActorInTheSpotlight().attemptsTo(RealizarBuy.page());
        
        theActorInTheSpotlight().attemptsTo(SeleccionarShopping.page());
    	
    }

    @Then("^user verifies the total (.*)$")
    public void user_verifies_the_total_products(String text) {
    	theActorInTheSpotlight().should(seeThat(
				ValidarTotalProducts.formaResumen(),
				Matchers.equalTo(text)));
    	
    }

    @Then("^User Clicks checkout$")
    public void user_Clicks_checkout() {
    	 theActorInTheSpotlight().attemptsTo(SeleccionarProccedCheckout.page());
    }

    @Then("^user is taken to the (.*) screen$")
    public void user_is_taken_to_the_Authentication_screen(String text) {
    	theActorInTheSpotlight().should(seeThat(
				ValidarPageAuthentication.formaResumen(),
				Matchers.equalTo(text)));
    }
    




}
