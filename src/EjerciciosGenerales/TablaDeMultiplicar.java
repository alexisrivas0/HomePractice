package EjerciciosGenerales;

import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main (String[] args){

        int numero;

        Scanner sc= new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("==Bienvenido a la tabla de multiplicar==");
        System.out.print("==        Escribe tu numero           == -> ");
        numero = sc.nextInt();

        System.out.println("==La tabla de multiplicar del" + numero+" es:    ==");

        for(int i = 1; i<=10; i++){

            System.out.println((i*numero));
        }
    }
}
