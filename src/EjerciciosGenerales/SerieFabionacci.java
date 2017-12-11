package EjerciciosGenerales;

import java.util.Scanner;

public class SerieFabionacci {

    public static void main (String[] args){

        int x;
        int resultado=0;
        int fibo1=1,fibo2=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("¿Cuantos numero de la serie de Fabionacci quieres ver?");
        x=sc.nextInt();


        System.out.println(fibo1 + "");
        for(int i=2;i<=x;i++) {

            System.out.println(fibo2+"");
            fibo2=fibo1+fibo2;
            fibo1=fibo2-fibo1;

        }
    }
}
