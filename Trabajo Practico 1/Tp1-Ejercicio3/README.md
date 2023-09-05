Ejercicio 3: Pila

Implemente el TAD Pila. Defina cuál debe ser la interfaz a implementar; cuantos objetos están involucrados en la solución; 
responsabilidades de cada objeto involucrado y ejemplifique el uso.

Para poder ejecutar el codigo correctamente, se necesitan dos clases, más, su implementación, la clase Nodo y Pila.
La Pila, apila estodos objetos nodo, dejando poder unicamente acceder al elemento del tope de la pila, es decir el ultimo en ingresar.

Estos nodos, son iguales en estructura al ejercicio 1 y 2.

Los métodos son los siguientes:
crearPila (), devuelve void. Crea la pila y la inicializa en nulo.

pilaVacia (), devuelve un bool o booleano. En caso de aparecer True, la pila está vacía. Como en los ejercicios anteriores.

apilarElemento (), devuelve void. Agrega el nuevo elemento nodo a la pila. 

desapilarElemento (), devuelve un object. Devuelve el nodo del tope de la pila.

devolverTope (), devuelve un object. Devuelve el valor del elemento del nodo. 

mostrarPila (), devuelve void. Muestra el dato de cada nodo que hace a la pila, desapilando cada elemento de la pila original.

