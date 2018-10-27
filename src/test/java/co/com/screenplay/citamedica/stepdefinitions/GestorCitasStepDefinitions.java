package co.com.screenplay.citamedica.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import co.com.screenplay.citamedica.model.Cita;
import co.com.screenplay.citamedica.model.Persona;
import co.com.screenplay.citamedica.questions.MensajeExitoso;
import co.com.screenplay.citamedica.tasks.Abrir;
import co.com.screenplay.citamedica.tasks.AgendarCita;
import co.com.screenplay.citamedica.tasks.AgregarDoctor;
import co.com.screenplay.citamedica.tasks.AgregarPaciente;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GestorCitasStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor mauro = Actor.named("Usuario");
	
	@Before
	public void configuracionInicial() {
		
		mauro.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^que Carlos necesita hacer un registro en herokuapp$")
	public void queCarlosNecesitaHacerUnRegistroEnHerokuapp() throws Exception {

		mauro.wasAbleTo(Abrir.laPaginaDeCitas());
	}
	
	@When("^el realiza el registro del Doctor en el aplicativo de Administracion de Hospitales$")
	public void elRealizaElRegistroDelDoctorEnElAplicativoDeAdministracionDeHospitales(List<List<String>> datos) throws Exception {
		
		mauro.attemptsTo(AgregarDoctor.nuevoRegistro(new Persona(datos.get(1))));
		Thread.sleep(3000);
	}

	@Then("^el verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
	public void elVerificaQueSePresenteEnPantallaElMensajeDatosGuardadosCorrectamente(List<List<String>> palabra) throws Exception {
		
		mauro.should(GivenWhenThen.seeThat(MensajeExitoso.es(), Matchers.equalTo(palabra.get(1).get(0))));
	    Thread.sleep(3000);
	}
	
	
	@When("^el realiza el registro del Paciente en el aplicativo de Administracion de Hospitales$")
	public void elRealizaElRegistroDelPacienteEnElAplicativoDeAdministracionDeHospitales(List<List<String>> datos) throws Exception {
	    
		mauro.attemptsTo(AgregarPaciente.nuevoRegistro(new Persona(datos.get(1))));
		Thread.sleep(3000);
	}

	@When("^el realiza el agendamiento de una Cita$")
	public void elRealizaElAgendamientoDeUnaCita(List<List<String>> datos) throws Exception {
	    
		mauro.attemptsTo(AgendarCita.nueva(new Cita(datos.get(1))));
	}
	
}
