package E03_Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends AbstractPublicaciones{

    private String edicion;
    private String ISBN;
    private String autor;
    Scanner sc = new Scanner(System.in);
    ArrayList<Libro> listaDeLibros = new ArrayList<>();


    public Libro(){}

    public Libro(String nombre, String fecha, int unidadesTotales, int unidadesPrestadas, int unidadesDisponibles, String edicion, String ISBN, String autor) {
        super(nombre, fecha, unidadesTotales, unidadesPrestadas, unidadesDisponibles);
        this.edicion = edicion;
        this.ISBN = ISBN;
        this.autor = autor; }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void showMenu() {

        do {
            System.out.println("Bienvenido a tu Biblioteca");
            System.out.println("====================================");
            System.out.println("Elige tu opcion: ");
            System.out.println("O.- Cerrar aplicación ");
            System.out.println("1.- Crear nuevo Libro");
            System.out.println("2.- ");
            System.out.println("3.- ");
            System.out.println("4.- ");
            System.out.println();
            opcion = sc.nextInt();
            controles(opcion);
        } while (opcion != 0);
    }



    @Override
    public void controles(int opcion) {

        switch (opcion) {

            case 0:
                break;
            case 1:
                crearLibro();
                break;
            case 2:
                //mostrarEmpleado();
                break;
            case 3:
                //generarDepartamento();
                break;
            case 4:
                //mostrarDepartamento();
                break;
            case 5:
                //asignarDirector();
                break;
            case 6:
                //asignarEmpleadoDepa();
                break;
            default:
                System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                break;

        }

    }

    @Override
    public String toString() {
        return "Libro{" +
                "edicion='" + edicion + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", autor='" + autor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", unidadesTotales=" + unidadesTotales +
                ", unidadesPrestadas=" + unidadesPrestadas +
                ", unidadesDisponibles=" + unidadesDisponibles +
                '}';
    }

    public void crearLibro(){

        Libro libro = new Libro();

        System.out.println("Escribre el nombre de tu libro:");
        libro.setNombre(sc.nextLine());
        System.out.println("Escribe su fecha de publicacion: ");
        libro.setFecha(sc.nextLine());
        System.out.println("Escribe las unidades totales de tu libro: ");
        libro.setUnidadesTotales(sc.nextInt());
        System.out.println("Escribe las unidades disponibles de este libro: ");
        int aux1= sc.nextInt();
        if(aux1>libro.getUnidadesTotales()){
            System.out.println("No es posible tener mas unidades disponibles que las existentes");
        }else{libro.setUnidadesDisponibles(aux1);}
        System.out.println("Escribe las unidades prestadas: ");
        int aux2=sc.nextInt();
        if(aux2>libro.getUnidadesTotales()-aux1){
            System.out.println("Has introducido un numero erroneo ");
        }else{libro.setUnidadesPrestadas(aux2);}
        System.out.println("Escribe la edicion de tu publicacion");
        libro.setEdicion(sc.nextLine());
        System.out.println("Introduce el ISBN de tu libro ");
        libro.setISBN(sc.nextLine());
        System.out.println("Introduce el autor de tu libro");
        libro.setAutor(sc.nextLine());

        listaDeLibros.add(libro);
    }

    public void mostrarLibros(){

        for (Libro libritos: listaDeLibros) {

            System.out.println(listaDeLibros.indexOf(libritos)+".- "+libritos.toString());
        }
    }

    @Override
    public void prestamo() {

        System.out.println("Elige el libro que quieres prestar: ");
        mostrarLibros();
        int aux3 = sc.nextInt();
        if(listaDeLibros.get(aux3).getUnidadesDisponibles()<0){
            System.out.println("No podemos realizar el prestamo no hay nidades disponibles");
        }else {

            listaDeLibros.get(aux3).setUnidadesDisponibles(listaDeLibros.get(aux3).getUnidadesDisponibles() - 1);
            listaDeLibros.get(aux3).setUnidadesPrestadas(listaDeLibros.get(aux3).getUnidadesPrestadas() + 1);
            System.out.println("Se ha realizado su prestamo con exito");
        }


    }

    @Override
    public void unidadesPrestadas() {

        int aux4 = 0;
        for (Libro libr:listaDeLibros) {
            aux4 =+libr.getUnidadesPrestadas();}
        System.out.println("Tu numero de libros prestados son: " +aux4);
    }

    @Override
    public void devolucion() {
        System.out.println("Elige el libro que quieres devolver: ");
        mostrarLibros();
        int aux5= sc.nextInt();
        if(listaDeLibros.get(aux5).getUnidadesPrestadas()<0){
            System.out.println("no se puede realizar la devolucion");
        }else{
            listaDeLibros.get(aux5).setUnidadesPrestadas(listaDeLibros.get(aux5).getUnidadesPrestadas()-1);
            listaDeLibros.get(aux5).setUnidadesDisponibles(listaDeLibros.get(aux5).getUnidadesDisponibles()+1);
            System.out.println("Su devolución ha sido realizada con exito");
        }
    }

    @Override
    public void publicacionesAnterioresA() {

        System.out.println("Introduce la fecha a comparar: ");

        int aux22 = Integer.parseInt(sc.next());
        for (Libro lib:listaDeLibros) {
            int aux = Integer.parseInt(lib.getFecha());
            if(aux<aux22){
                System.out.println(lib.toString());
            }else {}
        }
    }

    @Override
    public void publicacionesYDiscos() {

    }

    @Override
    public void publicacionesYDiscosSN() {

    }
}
