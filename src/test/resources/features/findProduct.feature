Feature: Realizar la busqueda de un producto colocando una palabra con mas de 3 caracteres en el buscador de la pagina

  Scenario: Como usuario no logueado quiero buscar un producto con la palabra summ y me debe mostrar unicamente las opciones que contengan la palabra.

    Given En el navegador abro la pagina de la tienda en el index
    When Ingreso la palabra summ en el buscador
    Then Valido que los resultados mostrados contienen la palabra buscada
