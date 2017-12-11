package EjerciciosGenerales;

import java.util.Scanner;

public class DeGradosCentigradosAKelvin {

    public static void main (String [] args){

        double GradosCentigrados;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu temperatura en grados centrigrados: ");
        GradosCentigrados = sc.nextDouble();
        System.out.println("Tu temperatura en grados Kelvin es: "+ (GradosCentigrados+273));
    }
}
