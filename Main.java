public class Main {
    public static void main(String[] args) {

        ListaEstudiantes lista = new ListaEstudiantes();

        lista.agregar(new Estudiante("001", "Ana", "Perez", "F", 2, true, true, 5));
        lista.agregar(new Estudiante("002", "Luis", "Gomez", "M", 1, false, false, 5));
        lista.agregar(new Estudiante("003", "Pedro", "Ruiz", "M", 3, true, false, 12));
        lista.agregar(new Estudiante("004", "Maria", "Lopez", "F", 4, true, true, 5));
        lista.agregar(new Estudiante("005", "Jose", "Diaz", "M", 2, false, true, 8));
        lista.agregar(new Estudiante("006", "Carla", "Suarez", "F", 1, true, false, 7));

        System.out.println(lista.Cumpleanos(5));
        System.out.println(lista.CantMilitantes());
        System.out.println(lista.CantBecados());

        ListaEstudiantes vacia = new ListaEstudiantes();
        System.out.println(vacia.Cumpleanos(5));
        System.out.println(vacia.CantMilitantes());
        System.out.println(vacia.CantBecados());
    }
}
