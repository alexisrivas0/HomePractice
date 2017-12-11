package EjerciciosGenerales;

import java.util.Scanner;

public class CuentaNumerosQAcabanEn2 {

    public static void main (String [] args){

        int n;
        int contador = 0;
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("introduce tu numero: ");
            n = sc.nextInt();

            if (n%10==2){

                contador++;
            }

        } while (n>0);

        System.out.println(contador);


       }


    }

