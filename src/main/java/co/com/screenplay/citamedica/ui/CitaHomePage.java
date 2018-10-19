package co.com.screenplay.citamedica.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/aagudelo/")
public class CitaHomePage extends PageObject{
	
	public static final Target BOTON_AGREGAR_DOCTOR = Target.the("Boton agregar doctor").located(By.xpath("//div[@class='list-group']//a[contains(text(),'Doctor')]"));
	public static final Target BOTON_AGREGAR_PACIENTE = Target.the("Boton agregar paciente").located(By.xpath("//div[@class='list-group']//a[contains(text(),'Paciente')]"));
	public static final Target BOTON_AGENDAR_CITA = Target.the("Boton agendar cita").located(By.xpath("//div[@class='list-group']//a[contains(text(),'Agendar')]"));

}
