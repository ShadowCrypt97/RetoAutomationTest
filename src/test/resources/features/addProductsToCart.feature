Feature: Agregar productos al carrito de compras

  Scenario: Como usuario no logueado quiero añadir varios productos al carrito de compras y
  verificar que el total mostrado sea la suma del precio de los productos mas el costo de envío.

    Given En el navegador abro la pagina en la página principal
    When selecciono la categoria women
    Then Valido que me encuentro en la categoria correspondiente
    Then Hago clic en Add to Cart en 3 productos
    And Hago mouseover sobre el carrito de compras
    And Valido que se despliega la lista con los productos añadidos
    And Valido el precio total
    And Hago clic en el carrito
    And Valido que me muestra el detalle de la compra en la seccion summary
    And Hago clic en el boton para aumentar la cantidad de uno de los productos
    And Valido que se incrementa el numero del carrito
    And elimino un producto
    And Valido que se decrementa el contador de productos en el carrito
    And Valido que un producto con descuento tenga correctamente calculado el descuento
