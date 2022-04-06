@PROYEC-186
@REQ_PROYEC-35
Feature: WEB

	#COMPROBAR que la página se pueda acceder y mostrar su contenido desde firefox
	#
	#*#Validación*
	#Mostrar Home desde Firefox
	#
	#*#Acciones Realizadas*
	#
	#Ir a Clase CucumberTestSuite.java
	#
	#Botón derecho → Run As → Junit Test
	#
	#*#Resultado Esperado y Actual*
	#
	#*Resultado esperado:* Muestra página Home en navegador Firefox.
	#
	#*Resultado actual:* OK.
	@TEST_PROYEC-113 @REQ_PROYEC-38 @TESTSET_PROYEC-50 @13 @13.1 @13.1.17 @Firefox @Navegadores
	Scenario: HU 13 | TS 13.1 | TC 13.1.17 | mostrar Home desde Firefox
		Given El usuario accede a la pagina Home desde firefox
		When el usuario busca en la pagina Home etiqueta "title"
		Then al usuario se le muestra titulo "LucApi - Home".
