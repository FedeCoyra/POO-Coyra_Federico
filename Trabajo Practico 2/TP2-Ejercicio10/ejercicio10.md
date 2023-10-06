Ejercicio 10

Una organización mantiene su lista de empleados, donde tiene los siguientes tipos identificados:

Empleado asalariado o full-time: Empleado que tiene una relación laboral de tiempo completo con la organización
Empleado por comisión: Son empleados que trabajan y cobran porcentaje por el bruto de las ventas. Se estipula de antemano, pero su sueldo se calcula según el monto total de ventas y el porcentaje estipulado.
Empleados por comisión con salario base: son empleados que tienen trabajo por comisión, pero su salario tiene una suma fija.
Empleados por hora: Cobran un monto fijo por hora que se multiplica a la cantidad de horas que tienen estipulada por contrato.
Todo empleado tiene un nombre, apellido, teléfono y CUIT.

Cada empleado debe responder al mensaje de calcularSueldo, teniendo en cuenta las siguientes reglas:

Los empleados asalariados tienen una suma fija mensual.
Los empleados por comisión tienen una cantidad de ventas que realizaron y un porcentaje fijo por el bruto de esas ventas.
Los empleados por comisión con salario base, son similares a los empleados por comisión, pero además tienen un monto fijo de base.
Los empleados por hora cobran por una cantidad de horas fijas de antemano, una suma estipulada por hora.
Se tiene un proceso que desea obtener, para cada tipo de empleado, el sueldo correspondiente al mes en curso a partir de los atributos mencionados.

Se le solicita:

Generar un diagrama de clases UML con la jerarquía de clases, haciendo uso de herencia de forma conveniente.

Desarrollar el cálculo de sueldo para todos los tipos de empleados.

Desarrollar una aplicación que calcule el sueldo para ejemplos de al menos uno de cada tipo de empleado.

Existe un tipo de empleado que es pasante, y cuyo sueldo no depende de la organización. En dichos casos, el cálculo de sueldo debe dar cero. Agregar este tipo a la jerarquía y, desarrolle el cálculo de sueldo.

En el caso de empleado por hora, aparece un nuevo convenio que estipula que en caso de trabajar más de 40 horas en ese mes, el sueldo se calcula igual pero con un extra a favor del empleado del 20 por ciento. Agregar esta lógica al desarrollo que haya realizado.

La organización decide darle un premio por cumpleaños a cada empleado. Entonces le solicita que se pueda registrar dicho dato en el sistema, y que para el mes del cumpleaños se le agregue el bono correspondiente. Se le solicita desarrollar la funcionalidad teniendo en cuenta que los extras por cumpleaños se manejan de la manera que se explica a continuación:

Cualquier empleado cobra $2000 por su cumpleaños.
Si es empleado asalariado, además, cobrará $1000 extra por cumpleaños.
Si es empleado por comisión, cobrará el 0.5 % del bruto de ventas.
Si es empleado por comisión con salario base, cobrará $1000 extra más el 0.5 % del bruto de ventas.
Los empleados por hora no cobran nada extra sobre los $2000.
