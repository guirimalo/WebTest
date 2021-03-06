package com.ejemplos.testing.serenity.tasks.search;

import net.serenitybdd.screenplay.targets.Target;

public class Servicios {
	
	public static final Target TITLE =  
    		Target.the("title").
    		locatedBy("//html/head/title");
    
    public static final Target H1 =  
    		Target.the("titulo h1").
    		locatedBy("//html/body/header/div/div/div/div/h1");
    
    public static final Target P =
    		Target.the("texto").
    		locatedBy("/html/body/article/div/div/div/p");

}
