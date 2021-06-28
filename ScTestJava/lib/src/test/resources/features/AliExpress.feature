Feature: Buscar un producto
  Yo como automatizador quiero buscar un producto

  Scenario Outline: Buscar producto
    Given Debe  ir a la pagina de "https://es.aliexpress.com/"
    When Buscar los productos <producto> 
    Then Mostrar tres articulos con indice <indice>
      | producto   | indice  |
      | echo dot 3 | 2-4-6   |
      | Eeveras    | 3-5-7   |
      | Televisor  | 8-10-12 |
