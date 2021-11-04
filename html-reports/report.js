$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/MACC/OneDrive - ESCUELA COLOMBIANA DE INGENIERIA JULIO GARAVITO/Documentos/Proyectos Automatizacion pruebas/RetoAutomationTest/src/test/resources/features/registerPageCompleteRegister.feature");
formatter.feature({
  "line": 1,
  "name": "Register Form completing required fields",
  "description": "",
  "id": "register-form-completing-required-fields",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validar que al completar los campos obligatorios me registra un usuario nuevo",
  "description": "",
  "id": "register-form-completing-required-fields;validar-que-al-completar-los-campos-obligatorios-me-registra-un-usuario-nuevo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "me arrojo los campos obligatorios en el mensaje de error",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Valido que los campos requeridos se muestren",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Comparo el numero de campos marcados como obligatorios con el que nos muestra en el mensaje de error",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Completo los campos obligatorios",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Realizo clic en el boton de registro",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Valido que el nombre registrado aparezca en el boton arriba superior derecha",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition_registerPageFormComplete.me_arrojo_los_campos_obligatorios_en_el_mensaje_de_error()"
});
formatter.result({
  "duration": 254919100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormComplete.valido_que_los_campos_requeridos_se_muestren()"
});
formatter.result({
  "duration": 246944000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormComplete.comparo_el_numero_de_campos_marcados_como_obligatorios_con_el_que_nos_muestra_en_el_mensaje_de_error()"
});
formatter.result({
  "duration": 419270300,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormComplete.completo_los_campos_obligatorios()"
});
formatter.result({
  "duration": 580906100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormComplete.hago_clic_en_el_boton_de_registro()"
});
formatter.result({
  "duration": 1491742000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormComplete.valido_que_el_nombre_registrado_aparezca_en_el_boton_arriba_superior_derecha()"
});
formatter.result({
  "duration": 66548500,
  "status": "passed"
});
});