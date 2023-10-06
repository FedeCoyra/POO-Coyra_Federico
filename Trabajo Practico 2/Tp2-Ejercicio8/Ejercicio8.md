Ejercicio 8
Del Ejercicio 6 de la guía anterior, donde se implementó la clase Libro para un sistema de administración de bibliotecas, ahora nos llega un nuevo requerimiento: En realidad un Libro es un caso particular de una Publicación, dado que además la biblioteca maneja ahora Revistas, Tesis y Diarios. Los 4 tipos de publicaciones comparten un nombre, un editor y un teléfono de contacto con el proveedor que los distribuye. Sin embargo, los libros tienen ISBN, pero las revistas tienen ISSN. Por otro lado, las revistas tienen además un número y año de publicación (los libros solo tienen año de publicación); las Tesis tienen un Autor y un mes y año de publicación (los Libros pueden tener varios autores, siempre al menos uno); y los diarios tienen una fecha de publicación (que además del año, incluye mes y día).

Para el caso particular de los Libros, se desea tener un seguimiento de los préstamos. Para ello, el sistema debe entonces incorporar el concepto de Socio de la Biblioteca y establecer un diseño que permita prestar un ejemplar a un socio. En este caso, es requisito disponer de un método que sepa mostrar los ejemplares en préstamo actualmente. Además, es necesario disponer de otro método que permita contabilizar la cantidad de ejemplares disponibles por cada libro.

Para el relato anterior se precisa:

Definir una jerarquía de tipos aplicando herencia. En la misma debe definirse claramente qué atributos van en el supertipo y cuáles en los tipos específicos.
Para el caso de la clase Libro, debe mantenerse toda la lógica del Ejercicio 6 de la guía anterior. Sin embargo, es importante tener en cuenta que las revistas cuentan con la misma lógica (incluyendo lo de cantidad de ejemplares).
Generar un Diagrama de Clases UML simple de la versión final.
Generar una clase que utilice este modelo y realice algunos préstamos.
Generar un Diagrama de Secuencias UML que permita visualizar la implementación del método que contabiliza la cantidad de ejemplares disponibles por libro.
