package co.com.screenplay.citamedica.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CitaAgendar {
	
	public static final Target TXT_DIA = Target.the("Dia de cita").located(By.id("datepicker"));
	public static final Target TXT_DOCUMENTO_PACIENTE = Target.the("Documento del paciente").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
	public static final Target TXT_DOCUMENTO_DOCTOR = Target.the("Documento del doctor").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
	public static final Target TXT_OBSERVACIONES = Target.the("Observaciones").located(By.xpath("//textarea[@class='form-control']"));
	public static final Target BOTON_GUARDAR = Target.the("Boton guardar").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
	public static final Target AREA = Target.the("Area").located(By.id("wrapper"));
	
}
