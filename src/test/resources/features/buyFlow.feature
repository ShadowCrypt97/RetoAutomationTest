Feature: Realizar una compra de un producto

  Scenario: Como usuario logueado quiero realizar la compra de un producto desde que entro a la página principal hasta validar el mensaje de compra exitosa.

    Given En el navegador abro la pagina en la pagina principal del index
    When selecciono la categoria Dresses
    Then Valido que me encuentro en la categoria correspondiente
    Then Hago clic en Add to Cart en el producto
    And Valido que se muestre el mensaje de prodcuto added succesfully
    And Hago clic en el boton continuar comprando
    And Hago mouseover sobre el carrito de compras
    And Valido que se despliega la lista con los productos added
    And Valido el precio total
    And Hago clic en el carrito
    And Valido que me muestra el detalle de la compra en la seccion summary
    And Valido que el boton de proceed to checkout exista
    And Hago clic en el boton proceed to checkout
    And valido que me dirigio a la seccion sign in
    And Valido que el campo email es clickeable
    And Valido que el campo password es clickeable
    And Ingreso un email registrado
    And Ingreso un password registrado
    And Hago clic en el boton de sign in
    And valido que me dirigio a la seccion address
    And Valido la informacion personal alli consignada
    And Hago clic en el boton para continuar
    And Valido que estoy en la seccion de shipping
    And marco la casilla de verificacion
    And Hago clic en el boton para continuar la transaccion
    And valido que me encuentro en la seccion de payment
    And hago clic en el boton pay by bank wire
    And valido el mensaje mostrado que corresponda con el metodo de pago pay by bank wire
    And Hago clic en el boton Other payment methods
    And hago clic en el boton pay by check
    And valido el mensaje mostrado que corresponda con el metodo de pago pay by check
    And Hago clic en el boton I confirm my order
    And valido que el mensaje de transaccion exitosa se muestra
    And hago clic en el boton back to my orders
    And valido la fecha de la transaccion y el order reference
    And Hago clic en el boton deails
    And valido la informacion de la compra realizada
