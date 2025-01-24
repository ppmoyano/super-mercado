Feature: Aplicar ofertas

  Scenario: Aplicar ofertas para productos especificos
    Given un cliente agrega los siguientes productos a la canasta
      | id | nombre  | precio |
      | 1  | azucar  | 12     |
      | 2  | leche   | 15     |
    When calcula el precio total
    Then el total es "21.0"