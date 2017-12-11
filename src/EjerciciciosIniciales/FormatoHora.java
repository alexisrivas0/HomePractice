package EjerciciciosIniciales;

import java.util.Scanner;

public class FormatoHora {

    public static void main (String [] args){

        int h;
        int m;
        int s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu hora: ");
        h=sc.nextInt();
        System.out.print("Introduce los minutos: ");
        m=sc.nextInt();
        System.out.println("Introduce los segundos: ");
        s=sc.nextInt();

        if(h>=0&&h<=24&&s>=0&&s<=59&&m>=0&&m<=59){
            System.out.println("Su hora es correcta");
        }else{
            System.out.println("su hora es incorrecta");
        }
    }
}
