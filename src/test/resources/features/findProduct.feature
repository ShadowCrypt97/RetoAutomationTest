Feature: Realizar el proceso de compra de un producto

  Scenario: Como usuario logueado quiero finalizar el proceso de compra de un producto.

    Given En el navegador abro la pagina de la tienda en el index
    When Ingreso la palabra summer
    Then Hago clic sobre la subcategoria casual dresses
    Then Valido que estoy dentro de la pagina casual dresses
    And Valido que casual dresses se encuentra en la barra de navegacion
    And Valido que el producto Printed Dress se encuentra dentro de casual dresses
    And Hago clic en dresses en la barra de navegacion
    And Valido que exista la subcategoria evening dresses
    Then Hago clic sobre la subcategoria evening dresses
    Then Valido que estoy dentro de la pagina evening dresses
    And Valido que evening dresses se encuentra en la barra de navegacion
    And Valido que el producto Printed Dress se encuentra dentro de evening dresses
    And Hago clic en dresses en la barra de navegacion
    And Hago clic en dresses en la barra de navegacion
    And Valido que exista la subcategoria summer dresses
    Then Hago clic sobre la subcategoria summerv dresses
    Then Valido que estoy dentro de la pagina summer dresses
    And Valido que summer dresses se encuentra en la barra de navegacion
    And Valido que el producto Printed Summer Dress se encuentra 2 veces dentro de summer dresses
    And Valido que el producto Printed Chiffon Dress se encuentra dentro de summer dresses