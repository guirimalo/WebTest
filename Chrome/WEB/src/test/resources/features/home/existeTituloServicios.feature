@PROYEC-193
@REQ_PROYEC-35
Feature: WEB

	#COMPROBAR que la página servicios lleve título
	#
	#*#Validación*
	#
	#*#Acciones Realizadas*
	#
	#*#Resultado Esperado y Actual*
	@TEST_PROYEC-71 @REQ_PROYEC-39 @TESTSET_PROYEC-52 @14 @14.1 @14.1.10 @MostrarInfoServicios @Titulo
	Scenario: HU 14 | TS 14.1 | TC 14.1.10 La pagina lleva titulo
		Given El usuario accede a la pagina Servicios desde chrome
		When el usuario busca en la pagina Servicios la etiqueta "h1"
		Then al usuario se le muestra el titulo h1 "Servicios" en pagina servicios.
