public class ListaEstudiantes {

    private Nodo cabeza;
    private int size;

    public ListaEstudiantes() {
        this.cabeza = null;
        this.size = 0;
    }

    public void agregar(Estudiante e) {
        Nodo nuevo = new Nodo(e);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        size++;
    }

    public String Cumpleanos(int mes) {
        String resultado = "";
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato.getMesCumpleanos() == mes) {
                resultado += actual.dato.getNombre() + " " + actual.dato.getApellido() + "\n";
            }
            actual = actual.siguiente;
        }

        if (resultado.equals("")) {
            return "No hay estudiantes que cumplan anos en ese mes.";
        }
        return resultado;
    }

    public String CantMilitantes() {
        if (cabeza == null) {
            return "La lista esta vacia.";
        }

        Estudiante[] arreglo = new Estudiante[size];
        Nodo actual = cabeza;
        int i = 0;
        while (actual != null) {
            if (actual.dato.isMilitanteUJC()) {
                arreglo[i] = actual.dato;
                i++;
            }
            actual = actual.siguiente;
        }

        for (int a = 0; a < i - 1; a++) {
            for (int b = 0; b < i - 1 - a; b++) {
                if (arreglo[b].getAno() > arreglo[b + 1].getAno()) {
                    Estudiante temp = arreglo[b];
                    arreglo[b] = arreglo[b + 1];
                    arreglo[b + 1] = temp;
                }
            }
        }

        String resultado = "";
        for (int a = 0; a < i; a++) {
            resultado += arreglo[a].toString() + "\n";
        }

        if (resultado.equals("")) {
            return "No hay estudiantes militantes de la UJC.";
        }
        return resultado;
    }

    public int CantBecados() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.isBecado()) {
                contador++;
            }
            actual = actual.siguiente;
        }
        return contador;
    }

    public int size() { return size; }
}
