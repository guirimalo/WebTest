@PROYEC-193
@REQ_PROYEC-35
Feature: WEB

	#*COMPROBAR* que la página se pueda acceder y mostrar su contenido desde chrome
	#
	#*#Validación*
	#
	#
	#*#Acciones Realizadas*
	#
	#*#Resultado Esperado y Actual*
	@TEST_PROYEC-75 @REQ_PROYEC-39 @TESTSET_PROYEC-52 @14 @14.1 @14.1.14 @Chrome @MostrarInfoServicios @Navegadores
	Scenario: HU 14 | TS 14.1 | TC 14.1.14 La página se visualiza desde Chrome
		Given El usuario accede a la pagina Servicios desde chrome
		When el usuario busca en la pagina Servicios la etiqueta "title"
		Then al usuario se le muestra el titulo "LucAPI - Servicios" en pagina servicios.
