package Ejercicio4;

import java.util.Scanner;

public class MainEjercicio4 {

    public static void main(String[] args) {

        double ancho;
        double alto;
        double area;
        int opcion;
        Scanner scl = new Scanner(System.in);

        do {
            System.out.println("Bienvenido a tu programa de calculos trigonometricos");
            System.out.println("====================================================");
            System.out.println("¿que quieres calcular?");
            System.out.println("0.- Para salir");
            System.out.println("1.- El perimetro de un rectangulo");
            System.out.println("2.- El area de un rectangulo");
            opcion=scl.nextInt();
            switch (opcion){
                case 0:
                    break;
                case 1:
                    Perimetro();
                    break;
                case 2:
                    Area();
                    break;
                default:
                    System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                    break;
            }
        }while(opcion!=0);



    }
        public static void Perimetro(){

            double  ancho1;
            double  alto1;
            Scanner sc = new Scanner(System.in);
            double perimetro;
            System.out.print("Escribe el ancho de tu rectangulo: ");
            ancho1 = sc.nextDouble();
            System.out.print("Escribe el alto de tu rectangulo: ");
            alto1 = sc.nextDouble();
            perimetro = 2*(ancho1+alto1);
            System.out.println("El perimetro de tu rectangulo es igual a: " +perimetro);

    }

        public static void Area(){

            double ancho2;
            double alto2;

            Scanner sc = new Scanner(System.in);
            double area;
            System.out.print("Escribe el ancho de tu rectangulo: ");
            ancho2 = sc.nextDouble();
            System.out.print("Escribe el alto de tu rectangulo: ");
            alto2 = sc.nextDouble();
            area = (ancho2*alto2);
            System.out.println("El area de tu rectangulo es igual a: "+area);
        }
}
