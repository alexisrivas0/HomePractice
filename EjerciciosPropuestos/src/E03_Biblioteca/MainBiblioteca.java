package E03_Biblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBiblioteca {


    public static void main(String[] args) {


        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("========================");
            System.out.println("=                      =");
            System.out.println("= MENU BIBLIOTECA CICE =");
            System.out.println("=                      =");
            System.out.println("========================");
            System.out.println("");
            System.out.println("1.- Mostrar todos los prestados");
            System.out.println("2.- Publicaciones anteriores a una fecha.");
            System.out.println("3.- Imprimir el listado de publicaciones.");
            System.out.println("4.- Imprimir el listado diferenciando prestado o no");
            System.out.println("");
            System.out.println("0.- Salir");
            System.out.println("");

            opcion = sc.nextInt();

            switch (opcion) {

                case 0:
                    break;
                case 1:
                    // mostrarPrestado();
                    break;
                case 2:
                    // publicacionesAnteriores;
                    break;
                case 3:
                    //listaPublicaciones();
                    break;
                case 4:
                    //listadoPrestadosONo();
                    break;
                default:
                    System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                    break;

            }

        } while (opcion != 0);

    }
    private static List<IBiblioteca> lista;

    private static void lista() {

        lista = new ArrayList<>();

        lista.add(new Libro("AREs", "10/20/1992", "Look", "n932", "Roberto Cabello", true));
        lista.add(new Libro("ramon", "15/03/2017", "03", "n0205", "Jesus Jorge", false));
        lista.add(new Revista("Marie Claire", "10/01/1992", 1232, "Mensual", true));
        lista.add(new Revista("Men Health", "01/02/2017", 2131, "Mensual", false));
        lista.add(new Comic("Xmen", "10/02/2005", 1, "Marvel", true));
        lista.add(new Comic("Super Man", "15/03/1980", 2, "Marvel", false));
    }

    public static void mostrarPrestado() {

        for (IBiblioteca object :lista) {

            if(object.esPrestado()){
                System.out.println();
            }else{}
        }
    }
}

