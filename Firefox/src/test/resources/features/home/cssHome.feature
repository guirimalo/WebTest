@PROYEC-186
@REQ_PROYEC-35
Feature: WEB

	#COMPROBAR que la página contiene un link de css.
	#
	#*#Validación*
	#La pagina tiene un archivo css asociado
	#
	#*#Acciones Realizadas*
	#
	#Se accede a la pagina Home y después a la ruta del css para ver si este existe
	#
	#*#Resultado Esperado y Actual*
	@TEST_PROYEC-101 @REQ_PROYEC-38 @TESTSET_PROYEC-50 @13 @13.1 @13.1.12 @CSS
	Scenario: HU 13 | TS 13.1 | TC 13.1.12 |  Link de CSS Home
		Given El usuario accede a la pagina Home desde firefox
		When El usuario accede a la pagina css desde chrome
		Then al usuario se le muestra la pagina css
