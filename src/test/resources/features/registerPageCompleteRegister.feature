Feature: Register Form completing required fields

  Scenario: Validar que al completar los campos obligatorios me registra un usuario nuevo

    Given me encuentro en la pagina create account
    When Ingreso un email nuevo
    When Hago clic en el boton crateAccount
    Then Valido que el boton de registro se muestre correctamente
    Then Hago clic en el boton radial Mr/Mrs
    Then Hago clic en el boton de registro
    When me arroje los campos obligatorios en el mensaje de error
    Then Valido que los campos requeridos se muestren
    And Comparo el numero de campos marcados como obligatorios con el que nos muestra en el mensaje de error
    And Completo los campos obligatorios
    And Hago clic nuevamente en el boton de registro
    And Valido que el nombre registrado aparezca en el boton arriba superior derecha
