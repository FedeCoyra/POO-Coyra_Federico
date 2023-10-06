Ejercicio 13

Se dispone del siguiente diagrama de clases UML, que representa una parte de un sistema de gestión de una empresa de vuelos comerciales.

Diagrama de sistema de vuelos

Luego de varios meses de uso, un analista detecta que si un miembro de la Tripulación desea subir a un vuelo como pasajero, entonces debe ser dado de alta 2 veces en el sistema (una como Pasajero y otra como Tripulante).

Reflexiones acerca de lo anterior:

¿Por qué ocurre esto?
¿Este problema se debe a un diseño mal realizado o es una limitación del mecanismo de herencia?
¿Existe un modelo alternativo que permita superar la limitación planteada en el modelo actual?

- Esto ocurre ya que un tripulante tiene un cargo dentro del vuelo y el pasajero posee un numero de pasajero. Pero si al tripulante antes de asignarle un lugar dentro del avion con un cargo, se le asigna un lugar como pasajero, estaria resuelto el problema pero habria que cargarlo de antemano como pasajero.


Actividades:

Implemente mínimamente las clases del modelo original e intente reproducir el escenario planteado.
Genere un modelo alternativo, planteando el diagrama de clases UML modificado.
Implementar el nuevo modelo a partir del anterior y verificar que se resuelve el problema.
