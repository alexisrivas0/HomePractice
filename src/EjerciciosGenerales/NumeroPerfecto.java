package EjerciciosGenerales;

import java.util.Scanner;

public class NumeroPerfecto {

    public static void main (String [] args){

        int numero, i, suma=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu numero:");
        numero=sc.nextInt();

        for(i=1;i<numero;i++){

            if(numero%i==0){
                suma=suma+i;
            }
        }

        if(numero==suma){
            System.out.println("El numero je perfecto");
        }
    }

}
