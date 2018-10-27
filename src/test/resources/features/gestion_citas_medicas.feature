#Author: mphoyos@bancolombia.com.co
#liseth
@tag
Feature: Gestionar Cita Médica
  	Como paciente
		Quiero realizar la solicitud de una cita médica
		A través del sistema de Administración de Hospitales


  @tag1
  Scenario: Realizar el Registro de un Doctor
    Given que Carlos necesita hacer un registro en herokuapp
    When el realiza el registro del Doctor en el aplicativo de Administracion de Hospitales
    |Nombres |Apellidos |Telefono  |TipoDocumento       |Documento|
    |Mauricio|Pinzon    |3001230000|Cédula de ciudadanía|10003000 |
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente
		|Mensaje    |
		|Datos guardados correctamente.|
		
	@tag2
	Scenario: Realizar el Registro de un Paciente
	Given que Carlos necesita hacer un registro en herokuapp
	When el realiza el registro del Paciente en el aplicativo de Administracion de Hospitales
	|Nombres |Apellidos |Telefono  |TipoDocumento       |Documento|
  |Angela  |Agudelo   |3001230000|Pasaportes          |10003000 |
	Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente
	|Mensaje    |
	|Datos guardados correctamente.|
	
	@tag3
	Scenario: Realizar el Agendamiento de una Cita
	Given que Carlos necesita hacer un registro en herokuapp
	When el realiza el agendamiento de una Cita
	|DiaCita     |DocPaciente |DocDoctor  |Observaciones     |
  |10/19/2018  |10003000    |10003000   |Revision mensual  |
	Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente
	|Mensaje    |
	|Datos guardados correctamente.|

	
	
