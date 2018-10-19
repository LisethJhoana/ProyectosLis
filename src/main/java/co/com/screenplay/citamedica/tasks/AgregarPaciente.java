package co.com.screenplay.citamedica.tasks;

import co.com.screenplay.citamedica.model.Persona;
import co.com.screenplay.citamedica.ui.CitaAgregarPaciente;
import co.com.screenplay.citamedica.ui.CitaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AgregarPaciente implements Task{

	private Persona paciente;
	
	public AgregarPaciente(Persona paciente) {
		this.paciente = paciente;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CitaHomePage.BOTON_AGREGAR_PACIENTE));
		actor.attemptsTo(Enter.theValue(paciente.getNombres()).into(CitaAgregarPaciente.TXT_NOMBRES));
		actor.attemptsTo(Enter.theValue(paciente.getApellidos()).into(CitaAgregarPaciente.TXT_APELLIDOS));
		actor.attemptsTo(Enter.theValue(paciente.getTelefono()).into(CitaAgregarPaciente.TXT_TELEFONO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(paciente.getTipoDocumento()).from(CitaAgregarPaciente.LIST_TIPO_DOCUMENTO));
		actor.attemptsTo(Enter.theValue(paciente.getDocumento()).into(CitaAgregarPaciente.TXT_DOCUMENTO));
		actor.attemptsTo(Click.on(CitaAgregarPaciente.CHECK_PREPAGADA));
		actor.attemptsTo(Click.on(CitaAgregarPaciente.BOTON_GUARDAR));
	}

	public static AgregarPaciente nuevoRegistro(Persona paciente) {
		
		return Tasks.instrumented(AgregarPaciente.class, paciente);
	}
	
}
