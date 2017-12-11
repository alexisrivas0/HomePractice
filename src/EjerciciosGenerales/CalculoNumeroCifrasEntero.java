package EjerciciosGenerales;

import java.util.Scanner;

public class CalculoNumeroCifrasEntero {

    public static void main (String [] args){

        int numero;
        int digitos=0;
        Scanner sc= new Scanner(System.in);

        System.out.print("Escribe tu numero : ");
        numero= sc.nextInt();

        while(numero!=0){

            numero=numero/10;
            digitos++;
        }
        System.out.println((digitos-1));

    }
}
