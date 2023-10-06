Ejercicio 9

Estamos desarrollando un módulo de un software de matemática donde debemos modelar figuras geométricas en 2 y 3 dimensiones. Toda figura geométrica tiene que saber calcular su área y debe retornarla mediante la invocación del método getArea(). Además, solo para el caso de las figuras en 3 dimensiones, tiene sentido solicitar también el volumen de la figura.

El cálculo de área para cada caso es:

Dos dimensiones
Área del círculo: Pi * radio ^ 2
Área del rectángulo: base * altura
Área del cuadrado: lado * lado
Área del triángulo: base * altura / 2
Tres dimensiones
Área de la esfera: 4 * Pi * radio ^ 2
Volumen de la esfera: (4/3) * Pi * radio ^ 3
Área del paralelepipedo: 2 * (arista1 * arista2 + arista1 * arista3 + arista2 * arista3)
Volumen del paralelepipedo: arista1 * arista2 * arista3
Área del cubo: 6 * arista^2
Volumen del cubo: arista^3
Área del tetraedro: (regular): arista^2 * raíz(3)
Volumen del tetraedro: (regular): arista^3 * raíz(2)/12
En todos los casos, se pide:

Generar un diagrama de clases que represente adecuadamente la jerarquía planteada.
Implementar los métodos de área y volumen donde corresponda y aplicar las fórmulas planteadas. Debo poder tener una lista de Formas y pedirles el área a todas sin importar el Subtipo. Además, de un listado de Formas en 3D tengo que poder pedirles el volumen.
Generar una clase que utilice varias de las clases construidas para mostrar su funcionamiento.
