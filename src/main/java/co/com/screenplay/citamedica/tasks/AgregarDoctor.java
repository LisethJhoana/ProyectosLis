package co.com.screenplay.citamedica.tasks;

import co.com.screenplay.citamedica.model.Persona;
import co.com.screenplay.citamedica.ui.CitaAgregarDoctor;
import co.com.screenplay.citamedica.ui.CitaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AgregarDoctor implements Task{

	private Persona doctor;
	
	public AgregarDoctor(Persona doctor) {
		this.doctor = doctor;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(CitaHomePage.BOTON_AGREGAR_DOCTOR));
		actor.attemptsTo(Enter.theValue(doctor.getNombres()).into(CitaAgregarDoctor.TXT_NOMBRES));	
		actor.attemptsTo(Enter.theValue(doctor.getApellidos()).into(CitaAgregarDoctor.TXT_APELLIDOS));
		actor.attemptsTo(Enter.theValue(doctor.getTelefono()).into(CitaAgregarDoctor.TXT_TELEFONO));
		actor.attemptsTo(SelectFromOptions.byVisibleText(doctor.getTipoDocumento()).from(CitaAgregarDoctor.LIST_TIPO_DOCUMENTO));
		actor.attemptsTo(Enter.theValue(doctor.getDocumento()).into(CitaAgregarDoctor.TXT_DOCUMENTO));
		actor.attemptsTo(Click.on(CitaAgregarDoctor.BOTON_GUARDAR));
	}

	public static AgregarDoctor nuevoRegistro(Persona doctor) {
		
		return Tasks.instrumented(AgregarDoctor.class, doctor);
	}
	
	

}
