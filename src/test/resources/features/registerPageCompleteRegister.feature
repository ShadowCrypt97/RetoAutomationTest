Feature: Register Form completing required fields

  Scenario: Validar que al completar los campos obligatorios me registra un usuario nuevo

    Given me arrojo los campos obligatorios en el mensaje de error
    When Valido que los campos requeridos se muestren
    Then Comparo el numero de campos marcados como obligatorios con el que nos muestra en el mensaje de error
    Then Completo los campos obligatorios
    And Realizo clic en el boton de registro
    And Valido que el nombre registrado aparezca en el boton arriba superior derecha
