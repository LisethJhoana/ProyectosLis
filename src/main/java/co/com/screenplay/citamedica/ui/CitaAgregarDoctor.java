package co.com.screenplay.citamedica.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CitaAgregarDoctor {
	
	public static final Target TXT_NOMBRES = Target.the("Caja texto nombres").located(By.id("name"));
	public static final Target TXT_APELLIDOS = Target.the("Caja texto apellidos").located(By.id("last_name"));
	public static final Target TXT_TELEFONO = Target.the("Caja texto telefono").located(By.id("telephone"));
	public static final Target LIST_TIPO_DOCUMENTO = Target.the("Lista tipo documento").located(By.id("identification_type"));
	public static final Target TXT_DOCUMENTO = Target.the("Caja texto documento").located(By.id("identification"));
	public static final Target BOTON_GUARDAR = Target.the("Boton guardar").located(By.xpath("//a[@class='btn btn-primary pull-right']"));

}
