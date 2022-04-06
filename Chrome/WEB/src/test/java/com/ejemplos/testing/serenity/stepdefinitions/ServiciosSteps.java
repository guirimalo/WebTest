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
		@Given("El {actor} accede a la pagina Servicios desde chrome")
		public void el_usuario_accede_a_la_pagina_home_desde_chrome_servicios(Actor actor) {
			actor.wasAbleTo(
	        		NavigateTo.theServiciosPage()
	        );
		}
		
		@When("el {actor} busca en la pagina Servicios la etiqueta {string}")
		public void el_usuario_busca_en_la_pagina_home_la_etiqueta_servicios(Actor actor, String term) {
			actor.attemptsTo(
					Scroll.to(Servicios.TITLE).andAlignToTop()
	        );
		}
		
		@Then("al {actor} se le muestra el titulo {string} en pagina servicios.")
		public void al_usuario_se_le_muestra_el_titulo_servicios(Actor actor, String term) {
			actor.attemptsTo(
					Ensure.thatTheCurrentPage().title().isEqualToIgnoringCase(term)
	        );
		}
		
		// HU14 COMPROBAR que la página servicios lleve título

		@When("el {actor} busca en la pagina Servicios la etiqueta h1")
		public void el_usuario_busca_en_la_pagina_home_la_etiqueta_titulo_h1_servicios(Actor actor) {
			actor.attemptsTo(
					MoveMouse.to(Servicios.H1)
	        );
		}
		
		@Then("al {actor} se le muestra el titulo h1 {string} en pagina servicios.")
		public void al_usuario_se_le_muestra_el_titulo_h1_servicios(Actor actor, String term) {
			System.out.println(Servicios.H1);
			actor.attemptsTo(
					//Ensure.that(By.xpath("//html/body/header/div/div/div/div/h1")).text().isEqualToIgnoringCase(term)
					Ensure.that(Servicios.H1).text().isEqualToIgnoringCase(term)
	        );
		}
		
		// HU14 Comprobar que el texto de la página es real
		
		@When("el {actor} busca en la pagina Servicios la etiqueta p")
		public void el_usuario_busca_en_la_pagina_home_la_etiqueta_p_servicios(Actor actor, String term) {
			actor.attemptsTo(
					MoveMouse.to(Servicios.P)
	        );
		}
		@Then("el {actor} comprueba que la etiqueta {string} contiene texto real en pagina servicios.")
		public void el_usuario_comprueba_que_la_etiqueta_p_contiene_texto_real_servicios(Actor actor, String term) {
			System.out.println(Servicios.H1);
			actor.attemptsTo(
					//Ensure.that(By.xpath("//html/body/header/div/div/div/div/h1")).text().isEqualToIgnoringCase(term)
					Ensure.that(Servicios.P).text().isNotEqualTo("Lorem Ipsum")
	        );
		}
	
}
