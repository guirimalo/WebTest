@PROYEC-186
@REQ_PROYEC-35
Feature: WEB

	#COMPROBAR que la página se pueda acceder y mostrar su contenido desde Chrome
	#
	#*#Validación*
	#
	#Mostrar Home desde Chrome
	#
	#*#Acciones Realizadas*
	#
	#Ir a Clase CucumberTestSuite.java
	#
	#Botón derecho → Run As → Junit Test
	#
	#*#Resultado Esperado y Actual*
	#
	#*Resultado esperado:* Muestra página Home en navegador Chrome.
	#
	#*Resultado actual:* OK.
	@TEST_PROYEC-106 @REQ_PROYEC-38 @TESTSET_PROYEC-50 @13 @13.1 @13.1.14 @Chrome @Navegadores
	Scenario: HU 13 | TS 13.1 | TC 13.1.14 | mostrar Home desde Chrome
		Given El usuario accede a la pagina Home desde chrome
		When el usuario busca en la pagina Home la etiqueta "title"
		Then al usuario se le muestra el titulo "LucApi - Home".
