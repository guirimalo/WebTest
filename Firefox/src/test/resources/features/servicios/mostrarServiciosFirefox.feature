@PROYEC-186
@REQ_PROYEC-35
Feature: WEB

	#COMPROBAR que la página Servicios se pueda acceder y mostrar su contenido desde firefox
	#
	#*#Validación*
	#Mostrar Servicios desde Firefox
	#
	#*#Acciones Realizadas*
	#
	#Ir a Clase CucumberTestSuite.java
	#
	#Botón derecho → Run As → Junit Test
	#
	#*#Resultado Esperado y Actual*
	#
	#*Resultado esperado:* Muestra página Servicios en navegador Firefox.
	#
	#*Resultado actual:* OK.
	@TEST_PROYEC-81 @REQ_PROYEC-39 @TESTSET_PROYEC-52 @14 @14.1 @14.1.17 @Firefox @MostrarInfoServicios @Navegadores
	Scenario: HU 14 | TS 14.1 | TC 14.1.17 La página se visualiza desde Firefox
		Given El usuario accede a la pagina Servicios desde firefox
		When el usuario busca en la pagina Servicios etiqueta "title"
		Then al usuario se le muestra titulo "LucApi - Servicios".