package EjerciciosGenerales;

public class InterContenidoDosVariables {

    public static void main (String [] args){

        int a = 10;
        int b = 50;

        int aux;

        aux = a;
        a = b;
        b = aux;

        System.out.println(a);
        System.out.println(b);
    }
}
