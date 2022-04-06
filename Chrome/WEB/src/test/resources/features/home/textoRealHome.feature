@PROYEC-186
@REQ_PROYEC-35
Feature: WEB

	#*#Validación*
	#COMPROBAR que el texto sea real (no se puede incluir “lorem ipsum”)
	#*#Acciones Realizadas*
	#
	#*#Resultado Esperado y Actual*
	@TEST_PROYEC-116 @REQ_PROYEC-38 @TESTSET_PROYEC-50 @13 @13.1 @13.1.11 @TextoReal
	Scenario: HU 13 | TS 13.1 | TC 13.1.11 |  Texto real Home
		Given El usuario accede a la pagina Home desde chrome
		When el usuario busca en la pagina Home la etiqueta "p"
		Then el usuario comprueba que la etiqueta "p" contiene texto real
