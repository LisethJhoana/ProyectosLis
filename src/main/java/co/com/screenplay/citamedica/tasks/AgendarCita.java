package co.com.screenplay.citamedica.tasks;

import co.com.screenplay.citamedica.model.Cita;
import co.com.screenplay.citamedica.ui.CitaAgendar;
import co.com.screenplay.citamedica.ui.CitaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgendarCita implements Task{

	private Cita cita;
	
	public AgendarCita(Cita cita) {
		
		this.cita = cita;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(CitaHomePage.BOTON_AGENDAR_CITA));
		actor.attemptsTo(Enter.theValue(cita.getFecha()).into(CitaAgendar.TXT_DIA));
		actor.attemptsTo(Click.on(CitaAgendar.AREA));
		actor.attemptsTo(Enter.theValue(cita.getDocumentoPaciente()).into(CitaAgendar.TXT_DOCUMENTO_PACIENTE));
		actor.attemptsTo(Enter.theValue(cita.getDocumentoDoctor()).into(CitaAgendar.TXT_DOCUMENTO_DOCTOR));
		actor.attemptsTo(Enter.theValue(cita.getObservaciones()).into(CitaAgendar.TXT_OBSERVACIONES));
		actor.attemptsTo(Click.on(CitaAgendar.BOTON_GUARDAR));
		
	}

	public static AgendarCita nueva(Cita cita) {
		
		return Tasks.instrumented(AgendarCita.class, cita);
	}
	
	
}
