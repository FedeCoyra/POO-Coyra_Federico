Ejercicio 8

Se requiere diseñar un objeto que dando de parámetro una longitud determinada genera un password aleatorio. Por defecto, la longitud será de 8, pero existe la posibilidad que se requiera una longitud más larga. En ambos casos, genera una contraseña aleatoria con esa longitud automáticamente ante su creación. Además, se requiere saber si el password es fuerte. Considere que una contraseña fuerte es aquella que tiene más de 2 mayúsculas, más de 1 minúscula y al menos dos números. En caso de que la contraseña no sea fuerte, debe existir alguna forma de regenerarla y asegurarse de que el password sea fuerte. En cualquier caso, debo poder obtener la contraseña y su longitud, y poder cambiar su longitud.
Objetivos:

Definir estructura y comportamiento.
Ahora, crear una clase que la use y que:


Crea una colección de Passwords con el tamaño que se indique por teclado.


Muestra todas las claves generadas y si es o no fuerte. Usa este simple formato:
<la_contraseña> - Fuerte
<la_contraseña> - Débil
