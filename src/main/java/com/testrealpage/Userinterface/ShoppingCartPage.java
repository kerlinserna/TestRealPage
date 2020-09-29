package com.testrealpage.Userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {
   
	public static final Target BTN__PRODUCTS_QUANTITY= Target.the("usuario").locatedBy("//span[@id='summary_products_quantity']");    

	public static final Target BTN__PROCCED_CHECKOUT= Target.the("usuario").locatedBy("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");    

	
	
}
