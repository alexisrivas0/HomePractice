package EjerciciosGenerales;

import java.util.Scanner;

public class NumerosAmigos {

    public static void main (String[] args){

        int a, b, i,l,sumaA=0,sumaB=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu primer numero: ");
        a=sc.nextInt();
        System.out.print("Escribe tu segundo numero: ");
        b=sc.nextInt();

        for (i=1;i<a;i++){

            if(a%i==0){
                sumaA= sumaA+i;
            }

        }
        System.out.println(sumaA);
        for (l=1;l<b;l++){

            if(b%l==0){

                sumaB=sumaB+l;
            }
        }
        System.out.println(sumaB);
        if(sumaA==b&&sumaB==a){
            System.out.println("los numero "+ a+ " y "+b+" son numeros amigos");
        }else {

            System.out.println("los numeros" + a+ " y "+b+" no son numero amigos");
        }
    }
}
