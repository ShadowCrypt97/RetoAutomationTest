Feature: Navegar por todas las subcategorias dentro de la categoria Tops

  Scenario: Como usuario logueado/no logueado quiero entrar a todas las subcategoria de productos Tops.

    Given En el navegador abro la pagina de la tienda en la categoria Top
    When Valide que se muestra la subcategoria T-Shirts
    Then Hago clic en la subcategoria T-shirts
    And Valido que debo ser redirigido a la pagina de la subcategoria T-shirts
    And Valido que el producto Faded Short Sleeve T-shirts se encuentra dentro de T-shirts
    And Hago clic en la categoria Top en la barra de navegacion
    And Valido que se muestra las subcategoria Blouses
    And Hago clic sobre la subcategoria Blouses
    And Valido que soy redirigido a la pagina de Blouses
    And Valido que el producto Blouse se encuentra dentro de Blouses