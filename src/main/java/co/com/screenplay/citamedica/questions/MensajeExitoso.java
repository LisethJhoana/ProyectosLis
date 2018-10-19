package co.com.screenplay.citamedica.questions;

import co.com.screenplay.citamedica.ui.CitaDoctorGuardado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeExitoso implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(CitaDoctorGuardado.LBL_MENSAJE).viewedBy(actor).asString();
	}

	public static MensajeExitoso es() {
		
		return new MensajeExitoso();
	}

	
}
