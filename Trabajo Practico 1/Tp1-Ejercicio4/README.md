Ejercicio 4: Cola

Implemente el TAD Cola. Defina cuál debe ser la interfaz a implementar; cuantos objetos están involucrados en la solución; 
responsabilidades de cada objeto involucrado y ejemplifique el uso.

Se necesitan dos clases, NODO y COLA.

La clase COLA, posee dos referencias, una hacia al objeto nodo del frente de la cola y otra referencia hacia el final de la cola.
En un ejemplo, 1 2 3 4 5, el 1 seria el frente y el 5 el final.

La clase NODO, es igual a la implementada en los ejercicios anteriores.

Metodos de la clase COLA:
crearCola (), devuelve void. Coloca el nodo del frente y final en null.
colaVacia (), devuelve un bool o booleano. En caso de que sea True, la cola se encuentra vacia.
encolarElemento (), devuelve void. Agrega el nodo a la cola.
desencolarElemento (), devuelve un Object. Devuelve el valor del nodo que se desencoló.
recuperarFrente (), devuelve un Object. Consulta el valor del nodo del frente.
recuperarFinal (), devuelve un Object. Consulta el valor del nodo del final.
mostrarCola (),  devuelve void. Muestra el dato de cada nodo.
