package E03_Biblioteca;

import E03_Biblioteca.Enums.EnumFormato;

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
                    mostrarPrestado();
                    break;
                case 2:
                    publicacionesAnteriores();
                    break;
                case 3:
                    listadoTotal();
                    break;
                case 4:
                    prestadosONo();
                    break;
                default:
                    System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                    break;

            }

        } while (opcion != 0);

    }
    private static List<AbstractPublicaciones> lista;
    private static List<AbstractMultimedia> listaM;
    
    private static void listaM(){
        
        listaM = new ArrayList<>();
        
        listaM.add(new Disco("The Beatle", EnumFormato.DVD,45, false));
        listaM.add(new Disco("Clasicos 90's", EnumFormato.DVD, 120, true));
        listaM.add(new Disco("EE",EnumFormato.DVD, 85, true));
        
    }

    private static void lista() {

        lista = new ArrayList<>();

        lista.add(new Libro("AREs", "10/20/1992", "Look", "n932", "Roberto Cabello", true));
        lista.add(new Libro("ramon", "15/03/2017", "03", "n0205", "Jesus Jorge", false));
        lista.add(new Revista("Marie Claire", "10/01/1992", 1232, "Mensual", false));
        lista.add(new Revista("Men Health", "01/02/2017", 2131, "Mensual", false));
        lista.add(new Comic("Xmen", "10/02/2005", 1, "Marvel", false));
        lista.add(new Comic("Super Man", "15/03/1980", 2, "Marvel", false));
    }

    public static void mostrarPrestado() {

        lista();
        for (AbstractPublicaciones object :lista) {

            if(object.esPrestado()){
                System.out.println(object.named());
                  int x =+0;
            }

        }

    }

    private static int convertorFechaNumero(String s){

        String k = s.replaceAll("/","");
        String m = (k.charAt(4)+""+k.charAt(5)+""+k.charAt(6)+""+k.charAt(7)+""+k.charAt(2)+""+k.charAt(3)+""+k.charAt(0)+""+k.charAt(1));
        int l = Integer.parseInt(m);
        return l;

    }

    public static void publicacionesAnteriores(){
        lista();
        Scanner lc = new Scanner(System.in);
        System.out.println("Introduce una fecha con cla cual comparar en el formato DD/MM/AAAA: ");
        int fechaUsuario = convertorFechaNumero(lc.next());

        for (AbstractPublicaciones objecto: lista) {


            int fechaPubli = convertorFechaNumero(objecto.getFecha());

            if (fechaPubli >= fechaUsuario) {} else {
                System.out.println(objecto.getNombre());
            }
        }
    }
    
    public static void listadoTotal(){

        lista();
        listaM();
        for(AbstractMultimedia multi: listaM) {
            System.out.println(multi.named());
        }
        for(AbstractPublicaciones publi:lista){
            System.out.println(publi.named());
        }

    }

    public static void prestadosONo(){

        lista();
        listaM();

        System.out.println("Publicaciones prestadas:");
        mostrarPrestado();
        System.out.println("Publicaciones no prestadas");
        for (AbstractPublicaciones publicaciones:lista) {

            if(publicaciones.esPrestado()){}else{
                System.out.println(publicaciones.named());
            }
        }
        System.out.println("Discos prestados:" );
        for (AbstractMultimedia discos:listaM) {

            if(discos.esPrestado()){
                System.out.println(discos.named());
            }else{}
        }
        System.out.println("Discos sin prestar ");
        for (AbstractMultimedia disc:listaM) {
           if(disc.esPrestado()){}else{
               System.out.println(disc.named());
           }
        }


        }

}

