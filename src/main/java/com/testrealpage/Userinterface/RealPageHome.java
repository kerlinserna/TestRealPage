package com.testrealpage.Userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


// declaracion de las User interface
@DefaultUrl("http://automationpractice.com/")

public class RealPageHome extends PageObject {

    public static final Target BTN_WOMEN= Target.the("usuario").locatedBy("//a[@title='Women']");

    public static final Target BTN_TOPS= Target.the("usuario").locatedBy("//a[@class='subcategory-name' and contains(text(),'Tops')]");

    public static final Target BTN_BLOUSES= Target.the("usuario").locatedBy("//a[@class='subcategory-name' and contains(text(),'Blouses')]");

    public static final Target BTN_ADDTOCART= Target.the("usuario").locatedBy("//span[contains(text(),'Add to cart')]");

    public static final Target BTN_CONTINUESHOPPING= Target.the("usuario").locatedBy("//i[@class='icon-chevron-left left']");

    public static final Target BTN_HOMEPAGE= Target.the("usuario").locatedBy("//i[@class='icon-home']");

    public static final Target BTN_DRESSES= Target.the("usuario").locatedBy("//a[@class='subcategory-name' and contains(text(),'Dresses')]");

    public static final Target BTN_EVENING_DRESSES= Target.the("usuario").locatedBy("//a[@class='subcategory-name' and contains(text(),'Evening Dresses')]");

    public static final Target BTN_QUICK_VIEW_DRESSES= Target.the("usuario").locatedBy("//a[@class='product-name'and contains(text(),'Printed Dress')]"); 

    public static final Target BTN_QUICK_VIEW_BLOUSE= Target.the("usuario").locatedBy("//a[@class='product-name'and contains(text(),'Blouse')]"); 
    
    public static final Target BTN_VIEW_SHOPPING= Target.the("usuario").locatedBy("//a[@title='View my shopping cart']");    

    
    
  
}
