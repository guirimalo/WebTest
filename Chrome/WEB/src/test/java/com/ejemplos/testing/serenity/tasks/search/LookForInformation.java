package com.ejemplos.testing.serenity.tasks.search;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
//import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LookForInformation {
    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(Home.TITLE)
                        
        );
        //Si hubiera habido un boton seria
        //   Enter.theValue(searchTerm).into(SearchForm.SEARCH_FIELD),
        //   Click.on(SeachForm.SEARCH_BUTTON)
    }
}
