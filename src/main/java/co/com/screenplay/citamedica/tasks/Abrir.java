package co.com.screenplay.citamedica.tasks;

import co.com.screenplay.citamedica.ui.CitaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private CitaHomePage citaHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Open.browserOn(citaHomePage));
	}

	public static Abrir laPaginaDeCitas() {
		
		return Tasks.instrumented(Abrir.class);
	}

}
