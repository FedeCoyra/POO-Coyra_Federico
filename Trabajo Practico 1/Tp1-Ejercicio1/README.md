Ejercicio 1: Lista enlazada simple

Recordando el TAD estudiado en asignaturas previas Lista enlazada simple

Implementar un equivalente orientado a objetos de la Lista enlazada simple. En particular, es necesario que la lista implemente la siguiente interfaz:

Crear lista.
Consultar si la lista está vacía.
Consultar la longitud de la lista.
Agregar elemento al final de la lista.
Eliminar elemento de la lista.
Recuperar elemento de la lista.
Insertar elemento en la lista en una posición específica.

¿Cuántos objetos están involucrados? Pensar bien los tipos de retorno de cada método.

En este ejercicio de Lista Enlazada Simple, hay dos clases (dejando de lado la Main).
Una de esas clases es "NODO", dicha clase interactua con la clase LISTA. En esta clase cada instancia contiene un Dato del tipo Object.

La otra clase mencionada anteriormente, es la clase "LISTA", esta clase hace uso de "Nodo" para implementar las listas.
Los objetos involucrados son los siguientes:

crearLista (), devuelve void. Con el nodo inicial en nulo.

listaVacia (), devuelve un bool o booleano. Para indicar si esta llena o vacia la lista, en caso de TRUE, se encuentra vacia.

listaLargo (), devuelve un entero, para saber la longitud o el largo de la lista teniendo en cuenta la cantidad de nodos.

addElemento (), devuelve void. Sirve unicamente para conectar al ultimo elemento de la lista con el siguiente nodo.

eliminarElemento (), devuelve void. Elimina el nodo de la lista por su posicion.

recuperarElemento (), devuelve un Object. Ya que retorna el dato del nodo en esa posicion.

insertarElemento (), devuelve void. Se encarga de insertar un nodo a la lista en una posicion establecida.

mostrarLista (), devuelve void. Recorre la lista con todos sus nodos y muestra que dato contiene cada nodo.
