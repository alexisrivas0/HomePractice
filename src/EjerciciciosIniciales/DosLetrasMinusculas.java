package EjerciciciosIniciales;

import java.util.Scanner;

public class DosLetrasMinusculas {

    public static void main (String [] args){

        char a;
        char b;
        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.print("Escribe un caracter primero: ");
        a = sc.next().charAt(0);
        System.out.print("Ecribe un segundo caracter: ");
        b = sc.next().charAt(0);

        if(Character.isLowerCase(a)&&Character.isLowerCase(b))
        {
            System.out.println("Ambos son minusculas");

        }else if (Character.isLowerCase(a)&&Character.isUpperCase(b)){

            System.out.println("La primera es minuscula y la segunda mayuscula");
        }else if (Character.isUpperCase(a)&&Character.isLowerCase(b)){

            System.out.println("La primera es mayuscula y la segunda es minuscula");

        }else{
            System.out.println("Ambas son mayusculas");
        }

    }
}
