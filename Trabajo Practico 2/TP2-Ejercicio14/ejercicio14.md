Ejercicio 14

La agencia de turismo SunBeach decide contratar un equipo de profesionales en sistemas para encarar una solución a sus problemas de gestión a través del desarrollo de un software a medida.

SunBeach tiene 3 tipos de proveedores: de transporte, guías turísticos y hospedaje. Continuamente se comunica con los mismos y de acuerdo a las distintas ofertas disponibles diseña y arma paquetes de turismo.

Cada paquete de turismo requiere de 3 proveedores de los cuales solo resulta interesante obtener el dinero a pagarles por el paquete, ya que ese dato es necesario para calcular el precio final por persona (no es necesario saber de qué tipo son los proveedores), además el paquete debe contener un destino.

Cada proveedor cobra un importe base por sus servicios. Además, según el tipo de proveedor se le agrega un importe extra al valor total que cobra el proveedor por sus servicios según la cantidad de clientes máxima que tenga el paquete, entonces:

El proveedor de hospedaje calcula el valor extra de la siguiente manera:

Si la cantidad de clientes máxima del paquete supera la cantidad mínima de clientes que acepta el proveedor (MaxPaq > MinProv), este último hace una rebaja del 0.5% del valor total del servicio base por cada cliente que supere la cantidad mínima de clientes que acepte el proveedor.
Si la cantidad máxima del paquete es igual a la mínima del proveedor (MaxPaq = MinProv), el valor extra es $0.
Si la cantidad máxima del paquete es menor (MaxPaq < MinProv) a la mínima del proveedor, el valor extra es $0.
El de transporte lo calcula así: Por cada cliente, se agrega un precio extra de 0.3% del precio base por los servicios de catering durante el viaje.

El guía turístico nunca agrega valor extra, salvo que la cantidad de clientes sea mayor a 200, en ese caso solo aumenta $90 el servicio.

Los clientes que se acercan a la agencia pueden elegir entre los distintos paquetes de turismo vigentes, los cuales abonan en efectivo.

El sistema debe permitir llevar un registro de los distintos proveedores y su clasificación (medios de transporte, hospedajes o guías turísticos), los paquetes de turismo y cómo están compuestos, los clientes de la agencia y las compras que realiza cada cliente.

A fin de mes el administrador de SunBeach necesita un informe que contenga un listado de todas las ventas realizadas, organizadas por destino.

También quiere conocer cuál es el destino favorito por sus clientes. SunBeach también requiere de un informe que contenga los datos de todos los proveedores para poder ubicarlos al momento de realizar los paquetes.

Nota: SunBeach siempre espera a completar con la cantidad de clientes máxima el paquete turístico.

Actividades

Dada la especificación funcional anterior, construir un diagrama de clases donde quede claro que clases componen el sistema, asociaciones, herencia, atributos y métodos que hagan posible cumplir con los requisitos del sistema.
Una vez armado el diagrama de clases, implemente su solución y genere código para probar que se cumplen las reglas de la especificación funcional.
