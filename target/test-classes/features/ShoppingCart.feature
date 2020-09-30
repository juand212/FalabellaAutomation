#Autor: juan lopez
#Fecha: 30/09/2020

Feature: Validaciones para proceso de compra en Falabella
  Como un usuario del sistema
  Quiero utilizar el carrito de compras
  Para validar las compras realizadas por los usuarios

  Background:
    Given El Usuario requiere navegar al buscador de google
    And Buscar e ingresar al ecommerce de Falabella

  Scenario: Realizar compra de articulo con garantia extendida
    When El busca y selecciona el articulo Consola PS4 para agregar a la bolsa
    And El define la cantidad 2 agregando garantia extendida de 1 año para comprar
    Then El deberia ver la interfaz de despacho con el resumen de la orden
