Feature: Seleccionar una subcategoria dentro de la categoria woman

  Scenario: Como usuario logueado/no logueado quiero entrar a una subcategoria de productos al hacer mouseover sobre el titulo de la categoria
            woman en el home.

    Given En el navegador abro la pagina de la tienda en el home
    When Realice mouseover sobre la categoria woman en el menu de navegacion
    Then Hago clic en la subcategoria Top
    And Valido que debo ser redirigido a la pagina de la subcategoria seleccionada
