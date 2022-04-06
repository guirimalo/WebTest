package com.ejemplos.testing.serenity.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theHomePage() {
        return Task.where("Home page",
                Open.browserOn().the(HomePage.class));
    }
    
    public static Performable theServiciosPage() {
        return Task.where("Servicios page",
                Open.browserOn().the(ServiciosPage.class));
    }
    
    public static Performable theCSSPage() {
        return Task.where("CSS page",
                Open.browserOn().the(CSSPage.class));
    }
}
