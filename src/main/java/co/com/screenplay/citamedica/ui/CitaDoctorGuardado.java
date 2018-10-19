package co.com.screenplay.citamedica.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CitaDoctorGuardado {

	public static final Target LBL_MENSAJE = Target.the("Mensaje de guardado").located(By.xpath("//p[contains(text(),'Datos guardados correctamente')]"));
}
