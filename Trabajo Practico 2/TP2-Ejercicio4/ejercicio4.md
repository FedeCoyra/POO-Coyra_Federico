Ejercicio 4


Se requiere implementar un sistema que administre cuentas de billeteras virtuales. Cada cliente tiene una cuenta normal y puede tener una cuenta crédito. Las cuentas normales tienen un límite de giro en descubierto. Con este tipo de cuentas se puede invertir parte del dinero del saldo que pasado N días nos dará un interés del 40%. Solo se puede realizar una inversión a la vez. El monto total que puede gastar un usuario es la suma del saldo disponible y el límite de giro en descubierto. Los giros en descubierto se cubren a medida que el usuario va agregando saldo a la cuenta.

Las cuentas de tipo crédito funcionan de la siguiente manera:

Las compras no se dividen en cuotas, solo tienen un recargo fijo del 5% sobre el monto total de la compra. El valor final a pagar de una compra es el monto + el 5%. El usuario paga a medida que puede el monto que quiere.
Existe un límite de gasto que se irá decrementando según la cantidad de compras realizadas. El valor que se decrementa es el monto de la compra.
Cada vez que se realiza el pago se aumenta el límite de compra disponible. El pago de intereses no debería aumentar el límite de compra.
El sistema debe poder mostrarle al usuario:

Saldo de la cuenta, límite de giro en descubierto, monto invertido (si existe inversión), monto disponible para compras a crédito y saldo deudor teniendo en cuenta todas las compras a crédito realizadas.
Debe poder avisarle al usuario cuando un gasto que intenta realizar lo va a hacer girar en descubierto.
Objetivo:

Evaluar calidad de la solución planteada según los 3 conceptos: cohesión, encapsulamiento/contrato y ocultamiento de la información. Determinar si se cumplen o no. En la solución se provee el código documentado (sin implementar) y un diagrama de clases.
Si creen que no se cumple, pensar un nuevo diseño que respete los 3 conceptos antes de avanzar. En cualquier caso, justificar la respuesta.
Implementar la solución.
