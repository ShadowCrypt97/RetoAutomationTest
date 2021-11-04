$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/MACC/OneDrive - ESCUELA COLOMBIANA DE INGENIERIA JULIO GARAVITO/Documentos/Proyectos Automatizacion pruebas/RetoAutomationTest/src/test/resources/features/registerPageFormRequiredFieldsError.feature");
formatter.feature({
  "line": 1,
  "name": "Register Form without required fields",
  "description": "",
  "id": "register-form-without-required-fields",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validar el mensaje de error al intentar enviar un formulario sin datos obligatorios",
  "description": "",
  "id": "register-form-without-required-fields;validar-el-mensaje-de-error-al-intentar-enviar-un-formulario-sin-datos-obligatorios",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "me encuentro en el formulario de registro",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Valido que el boton de registro se muestre correctamente",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Hago clic en el boton radial Mr/Mrs",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Hago clic en el boton de registro",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Valido que en el mensaje de error se nombren todos los campos obligatorios",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition_registerPageFormWithoutRequiredFields.me_encuentro_en_el_formulario_de_registro()"
});
formatter.result({
  "duration": 72519400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormWithoutRequiredFields.valido_que_el_boton_de_registro_se_muestre_correctamente()"
});
formatter.result({
  "duration": 43160100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormWithoutRequiredFields.hago_clic_en_el_boton_radial_Mr_Mrs()"
});
formatter.result({
  "duration": 718693700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormWithoutRequiredFields.hago_clic_en_el_boton_de_registro()"
});
formatter.result({
  "duration": 805942000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_registerPageFormWithoutRequiredFields.valido_que_en_el_mensaje_de_error_se_nombren_todos_los_campos_obligatorios()"
});
formatter.result({
  "duration": 270884200,
  "status": "passed"
});
});