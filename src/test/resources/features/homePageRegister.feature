Feature: Home Page

  Scenario: Validar que la pagina me permite registrar un usuario nuevo con el email

    Given abro la pagina de la tienda en el navegador
    When el boton de signIn se cargue le hago clic
    Then valido que me redirige a la pagina de autenticacion
    And Valido que el campo de ingresar email se muestra
    And Ingreso un email nuevo
    And Hago clic en el boton crateAccount
    And Valido que me redirige al formulario de informacion personal


