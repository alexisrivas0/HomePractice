package EjerciciciosIniciales;

import java.util.Scanner;


public class LetraMayuscula {

    public static void main (String[] args){

        char car, car1;
        Scanner sc = new Scanner(System.in);


        System.out.println("==========================");
        System.out.print("Introduce tu caracter: ");

        car= sc.next().charAt(0);

        if(Character.isUpperCase(car)){

            System.out.println("El caracter esta en mayuscula");
        }
        else {

            System.out.println("El caracter esta en minuscula");
        }

    }
}
