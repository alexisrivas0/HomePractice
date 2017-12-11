package EjerciciciosIniciales;

import java.util.Scanner;

public class DivisionPrimeroPorSegundo {

    public static void main (String [] args){

        double x;
        double y;
        double resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================");
        System.out.print("Tu primer numero es: ");
        x=sc.nextInt();
        System.out.print("Tu segundo numero es: ");
        y=sc.nextDouble();

        if(y!=0){
            System.out.println("Tu division es igual a: "+ (x/y));
        } else {
            System.out.println("Tu numero es igual a cero, estas divisiones no son viables");
        }

    }
}
