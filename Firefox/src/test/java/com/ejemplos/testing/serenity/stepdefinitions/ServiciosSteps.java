package com.ejemplos.testing.serenity.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

import com.ejemplos.testing.serenity.tasks.navigation.NavigateTo;
import com.ejemplos.testing.serenity.tasks.search.Home;
import com.ejemplos.testing.serenity.tasks.search.Servicios;

public class ServiciosSteps {
	
	// HU14 Acceder a página servicios y verificar title
		@Given("El {actor} accede a la pagina Servicios desde firefox")
		public void el_usuario_accede_a_la_pagina_servicios_desde_firefox(Actor actor) {
			actor.wasAbleTo(
	        		NavigateTo.theServiciosPage()
	        );
		}
		
		@When("el {actor} busca en la pagina Servicios etiqueta {string}")
		public void el_usuario_busca_en_la_pagina_servicios_etiqueta(Actor actor, String term) {
			actor.attemptsTo(
					Scroll.to(Servicios.TITLE).andAlignToTop()
	        );
		}
		
		@Then("al {actor} se le muestra el titulo {string}.")
		public void al_usuario_se_le_muestra_el_titulo(Actor actor, String term) {
			actor.attemptsTo(
					Ensure.thatTheCurrentPage().title().isEqualToIgnoringCase(term)
	        );
		}
		
		// HU14 COMPROBAR que la página servicios lleve título

		@When("el {actor} busca en la pagina Servicios la etiqueta titulo {string}")
		public void el_usuario_busca_en_la_pagina_servicios_la_etiqueta_titulo(Actor actor, String term) {
			actor.attemptsTo(
					MoveMouse.to(Servicios.H1)
	        );
		}
		
		@Then("al {actor} se le muestra el titulo h1 {string} en pagina servicios.")
		public void al_usuario_se_le_muestra_el_titulo_h1_en_pagina_servicios(Actor actor, String term) {
			System.out.println(Servicios.H1);
			actor.attemptsTo(
					//Ensure.that(By.xpath("//html/body/header/div/div/div/div/h1")).text().isEqualToIgnoringCase(term)
					Ensure.that(Servicios.H1).text().isEqualToIgnoringCase(term)
	        );
		}
}
