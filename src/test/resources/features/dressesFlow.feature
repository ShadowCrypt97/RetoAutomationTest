Feature: Seleccionar una subcategoria dentro de la categoria Dresses

  Scenario: Como usuario logueado/no logueado quiero entrar a la subcategoria de productos Casual Dresses al hacer clic sobre el titulo de la subcategoria.

    Given En el navegador abro la pagina de la tienda en la categoria Dresses
    When Valido que existan las subcaegorias correspondientes
    Then Hago clic sobre la subcategoria casual dresses en el menu de navegacion
    Then Valido que estoy dentro de la pagina casual dresses
    And Valido que el producto Printed Dress se encuentra dentro de la subcategoria