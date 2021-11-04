Feature: Register Form without required fields

  Scenario: Validar el mensaje de error al intentar enviar un formulario sin datos obligatorios

    Given me encuentro en el formulario de registro
    When Valido que el boton de registro se muestre correctamente
    Then Hago clic en el boton radial Mr/Mrs
    And Hago clic en el boton de registro
    And Valido que en el mensaje de error se nombren todos los campos obligatorios


