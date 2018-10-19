package co.com.screenplay.citamedica.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CitaAgregarPaciente {

	public static final Target TXT_NOMBRES = Target.the("Caja texto nombres").located(By.xpath("//input[@placeholder='Ingrese el nombre']"));
	public static final Target TXT_APELLIDOS = Target.the("Caja texto apellidos").located(By.xpath("//input[@placeholder='Ingrese los apellidos']"));
	public static final Target TXT_TELEFONO = Target.the("Caja texto telefono").located(By.xpath("//input[@placeholder='Ingrese el teléfono']"));
	public static final Target LIST_TIPO_DOCUMENTO = Target.the("Lista tipo documento").located(By.name("identification_type"));
	public static final Target TXT_DOCUMENTO = Target.the("Caja texto documento").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad']"));
	public static final Target CHECK_PREPAGADA = Target.the("Checkbox salud prepagada").located(By.name("prepaid"));
	public static final Target BOTON_GUARDAR = Target.the("Boton guardar").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
}
