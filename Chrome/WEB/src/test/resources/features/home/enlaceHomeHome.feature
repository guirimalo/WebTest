@PROYEC-206
@REQ_PROYEC-35
Feature: WEB

	#COMPROBAR que al estar en la página Home al pulsar el enlace de la página Home te redirige a la página de Home 
	#*#Validación*
	#
	#*#Acciones Realizadas*
	#
	#*#Resultado Esperado y Actual*
	@TEST_PROYEC-165 @REQ_PROYEC-38 @TESTSET_PROYEC-162 @13 @13.2 @13.2.1 @Enlaces
	Scenario: HU 13 | TS 13.2 | TC 13.2.1| Enlace "Home" de la página Home funciona
		Given El usuario accede a la pagina Home desde chrome
		When el usuario hace click en el enlace "Home"
		Then al usuario se le muestra la pagina "LucAPI - Home"
