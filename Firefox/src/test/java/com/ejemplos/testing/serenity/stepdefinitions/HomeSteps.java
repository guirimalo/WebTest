package com.ejemplos.testing.serenity.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import org.openqa.selenium.By;

import com.ejemplos.testing.serenity.tasks.navigation.NavigateTo;
import com.ejemplos.testing.serenity.tasks.search.Home;
import com.ejemplos.testing.serenity.tasks.search.LookForInformation;

public class HomeSteps {

	
	// HU13 Comprobar existe titulo H1 y verificar contenido
	@Given("El {actor} accede a la pagina Home")
	public void el_usuario_accede_a_la_pagina_home(Actor actor) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		actor.wasAbleTo(
        		NavigateTo.theHomePage()
        );
	}
	
	@When("el {actor} busca en la pagina Home la etiqueta titulo {string}")
	public void el_usuario_busca_en_la_pagina_home_la_etiqueta_titulo(Actor actor, String term) {
		actor.attemptsTo(
				MoveMouse.to(Home.H1)
        );
	}
	
	@Then("al {actor} se le muestra el titulo h1 {string}.")
	public void al_usuario_se_le_muestra_el_titulo_h1(Actor actor, String term) {
		System.out.println(Home.H1);
		actor.attemptsTo(
				//Ensure.that(By.xpath("//html/body/header/div/div/div/div/h1")).text().isEqualToIgnoringCase(term)
				Ensure.that(Home.H1).text().isEqualToIgnoringCase(term)
        );
	}
	
	// HU13 Acceder a página home y verificar title desde firefox
	@Given("El {actor} accede a la pagina Home desde firefox")
	public void el_usuario_accede_a_la_pagina_home_desde_firefox(Actor actor) {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		actor.wasAbleTo(
        		NavigateTo.theHomePage()
        );
	}
	
	@When("el {actor} busca en la pagina Home etiqueta {string}")
	public void el_usuario_busca_en_la_pagina_home_etiqueta(Actor actor, String term) {
		actor.attemptsTo(
				Scroll.to(Home.TITLE).andAlignToTop()
        );
	}
	
	@Then("al {actor} se le muestra titulo {string}.")
	public void al_usuario_se_le_muestra_titulo(Actor actor, String term) {
		actor.attemptsTo(
				Ensure.thatTheCurrentPage().title().isEqualToIgnoringCase(term)
		);
	}
}
