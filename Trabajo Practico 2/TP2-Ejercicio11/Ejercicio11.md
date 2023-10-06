Ejercicio 11
Una empresa de renta de automóviles necesita un sistema para realizar presupuestos de alquiler a clientes de forma rápida. Las reglas para calcular el costo de alquilar un vehículo varían según diversas características. Los vehículos se identifican unívocamente por su patente (El sistema no puede tener una misma patente en más de un vehículo).

Al momento, los tipos de vehículos que se alquilan son autos de pasajeros, combis, camionetas de tipo “flete” y camión de carga.

Todo vehículo tiene un precio base de alquiler diario de $3000 pesos. Luego, existen algunas particularidades que se adicionan al precio base según algunas reglas:

En cada auto de pasajero, se suman $300 pesos por cada asiento por día. Ejemplo, existen autos de 4 asientos, pero hay otros de 2 y otros de 5.
En el caso de autos de tipo VIP, la plaza es de $500 pesos.
Para el caso de las combis, el precio base se modifica en $4500.
Para las camionetas tipo flete, se adicionan $600 pesos por un valor conocido como * Peso Autorizado Total (PAT). Este adicional es entonces $600 * PAT de cada camioneta.
Los camiones no tienen el precio base, sino que tienen un costo fijo de alquiler de $100000 (cien mil), salvo que se alquilen más de 30 días, cuyo precio base diario es de $75000.
Además, se quiere modelar los clientes. Un cliente es alguien que solicita un presupuesto, pero que finalmente puede realizar un alquiler. Un alquiler vincula un presupuesto con un cliente. Además, el alquiler puede establecer fechas de inicio y fin y generar el saldo a pagar. Por otro lado, el sistema NO DEBE realizar gestión de pagos.

Dado todo esto, el sistema de la agencia debe poder:

Registrar los vehículos y poder prestarlos. No debe permitirse que dos vehículos se registren con la misma patente.
Emitir un presupuesto. Un presupuesto consta de un vehículo específico y una cantidad de días de alquiler. Debe valorarse el monto final.
De un presupuesto debe poder generarse un alquiler.
De un cliente, mostrar el monto total de todos los alquileres realizados.
El monto total de todos los alquileres generados por el sistema.
