@PROYEC-186
@REQ_PROYEC-35
Feature: WEB

	#COMPROBAR que en la página Home existe un título h1 y es: {{Las Voces del Cambio}}
	#
	#*#Validación*
	#
	#Comprobar título h1 página Home y verificarlo.
	#*#Acciones Realizadas*
	#
	#Ir a Clase CucumberTestSuite.java
	#
	#Botón derecho → Run As → Junit Test
	#
	#*#Resultado Esperado y Actual*
	#
	#*Resultado esperado:* Muestra página Home, comprueba que exista título h1 y verificarlo.
	#
	#*Resultado actual:* OK.
	@TEST_PROYEC-115 @REQ_PROYEC-38 @TESTSET_PROYEC-50 @13 @13.1 @13.1.10 @Título
	Scenario: HU 13 | TS 13.1 | TC 13.1.10 | Título Home
		Given El usuario accede a la pagina Home
		When el usuario busca en la pagina Home la etiqueta titulo "h1"
		Then al usuario se le muestra el titulo h1 "Las Voces del Cambio".
