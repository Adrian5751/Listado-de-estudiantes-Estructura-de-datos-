

Sistema de Control de Estudiantes con Lista Simplemente Enlazada

Estructura del proyecto

El proyecto está formado por cuatro archivos. El archivo Estudiante.java contiene la clase que representa a un estudiante con todos sus atributos. El archivo Nodo.java contiene la clase que representa un nodo individual de la lista enlazada. El archivo ListaEstudiantes.java contiene la clase que representa la lista enlazada con todos sus métodos y las tres operaciones solicitadas. El archivo Main.java contiene el punto de entrada del programa. Finalmente, este archivo README.md documenta el funcionamiento general del proyecto.

La clase Estudiante

La clase Estudiante representa a un alumno del departamento de Informática. Cada estudiante tiene los siguientes atributos: ci, que es el carné de identidad; nombre; apellido; sexo; ano, que es el año académico que cursa; militanteUJC, que indica si es militante de la UJC; becado, que indica si recibe beca; y mesCumpleanos, que es el número del mes en que cumple años. La clase tiene un constructor que recibe todos estos valores y los guarda en los atributos correspondientes. También tiene métodos para obtener cada atributo por separado. El método toString devuelve una cadena con el ci, el nombre completo, el sexo y el año separados por guiones, para que sea fácil de imprimir.

La clase Nodo

La clase Nodo es la pieza fundamental de la lista enlazada. Cada nodo almacena un objeto de tipo Estudiante en el atributo dato y guarda una referencia al siguiente nodo de la cadena en el atributo siguiente. Cuando un nodo no apunta a nadie, su atributo siguiente vale null, lo que indica que ese nodo es el último de la lista. La clase tiene un constructor que recibe el estudiante a guardar y coloca automáticamente el enlace en null, dejando el nodo listo para ser enlazado cuando la lista lo necesite.

La clase ListaEstudiantes

La clase ListaEstudiantes mantiene dos atributos. El atributo cabeza apunta al primer nodo de la cadena, o vale null si la lista está vacía. El atributo size lleva la cuenta de cuántos estudiantes hay en la lista. El constructor inicializa ambos atributos dejando la lista completamente vacía.

El método agregar recibe un objeto Estudiante y crea un nuevo nodo. Si la lista está vacía, ese nodo se convierte en el primero. Si no, recorre la lista con un nodo auxiliar llamado actual hasta llegar al último nodo y enlaza el nuevo nodo al final asignando el siguiente del último nodo al nuevo. Después incrementa el tamaño. Este método se usa principalmente para armar la lista en las pruebas.

Método Cumpleanos

El método Cumpleanos recibe como parámetro un número de mes y devuelve un listado con los nombres de los estudiantes que cumplen años en ese mes. El método recorre la lista con un nodo auxiliar llamado actual. En cada nodo compara el mes de cumpleaños del estudiante con el mes recibido como parámetro. Si coinciden, agrega el nombre y el apellido del estudiante a una cadena de texto con un salto de línea al final. Si al terminar el recorrido no se agregó ningún nombre, devuelve un mensaje indicando que no hay estudiantes que cumplan años en ese mes.

Método CantMilitantes

El método CantMilitantes devuelve un listado con la información de los estudiantes que son militantes de la UJC, ordenados por año de menor a mayor. Primero verifica si la lista está vacía y, en ese caso, devuelve un mensaje indicándolo. Si hay estudiantes, recorre la lista y copia a un arreglo auxiliar solo aquellos que tienen el atributo militanteUJC en verdadero. Luego aplica el algoritmo de ordenamiento burbuja sobre ese arreglo, comparando los años de cada par de estudiantes e intercambiándolos cuando el de la izquierda es mayor que el de la derecha, para que queden de menor a mayor. Después recorre el arreglo ya ordenado y arma una cadena de texto con la información de cada estudiante, agregando un salto de línea entre cada uno. Si no se encontró ningún militante, devuelve un mensaje indicándolo. Finalmente devuelve la cadena con el resultado.

Método CantBecados

El método CantBecados devuelve la cantidad de estudiantes que son becados. Para lograrlo usa un contador entero que empieza en cero. Recorre la lista con un nodo auxiliar y, por cada estudiante, verifica si el atributo becado está en verdadero. Si lo está, incrementa el contador. Al terminar el recorrido, devuelve el valor del contador.

Adrian Jesus Pelaez Rodriguez
