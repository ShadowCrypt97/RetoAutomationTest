Feature: Realizar el flujo por todas las categorias y subcategorias de la seccion Women

  Scenario: Como usuario logueado/no logueado quiero entrar a todas las subcategorias de productos de women al hacer mouseover sobre el titulo de la categoria
            women en el home.

    Given En el navegador abro la pagina de la tienda en el home
    When Realice mouseover sobre la categoria woman en el menu de navegacion
    Then Hago clic en la subcategoria Top
    And Valido que debo ser redirigido a la pagina de la subcategoria Top
    And Valido que el nombre de la subcategoria se muestra en la barra de navegacion
    And Hago clic en la barra de navegacion en la categoria women
    And Valido que puedo ver las subcategorias de women
    And Hago clic en la subcategoria Dresses
    And Valido que debo ser redirigido a la pagina de la subcategoria Dresses
    And Valido que el nombre de la subcategoria se muestra en la barra de navegacion

