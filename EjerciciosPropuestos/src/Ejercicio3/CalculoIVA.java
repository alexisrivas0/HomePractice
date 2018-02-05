package Ejercicio3;

import java.util.Scanner;

public class CalculoIVA {

    final double IVA = 21;
    private double precio;
    private double precioSinIva;
    private double precioConIva;
    private int opcion;
    Scanner sc = new Scanner(System.in);



    public void showMenu(){

        do{
            System.out.println("Bienvenido");
            System.out.println("====================================");
            System.out.println("Elige tu opcion: ");
            System.out.println("O.- Cerrar aplicación ");
            System.out.println("1.- Calcular el IVA a pagar de un producto sin IVA");
            System.out.println("2.- Calcular de precio + IVA ");
            System.out.println("3.- Calcular precio de un producto con IVA a sin IVA ");

            opcion=sc.nextInt();
            controles(opcion);
        } while(opcion!=0);
    }

    private void controles(int opcion){

            switch(opcion){

                case 0:
                    break;
                case 1:
                    ivaPagar();
                    break;
                case 2:
                    precioMasIva();
                    break;
                case 3:
                    precioSinIva();
                    break;
                default:
                    System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                    break;

            }
    }

public void ivaPagar(){

    double pf ;
    String respuesta;
    do {
        System.out.println("por favor introduce el precio de tu producto: ");
        Producto producto = new Producto();
        producto.precioSinIva = sc.nextDouble();
        pf = producto.precioSinIva * IVA / 100;
        System.out.println("Tu iva a pagar es igual a:  " + pf);
        System.out.print("¿Quieres calcular otro IVA? s / n");
        respuesta = sc.next();

    } while(respuesta.equals("s"));
}

public void precioMasIva(){

    double pf;
    String respu="";
    do{
        System.out.println("Por favor introduce el precio de tu producto: ");
        Producto product = new Producto();
        product.precioSinIva = sc.nextDouble();
        pf = product.precioSinIva *IVA/100;
        System.out.println("Tu precio: "+product.precioSinIva+" IVA: "+ pf+" precio final: "+(pf+product.precioSinIva) );
        System.out.print("¿Quieres calcular otro IVA? s / n");
        respu = sc.next();

    }while(respu.equals("s"));

}

public void precioSinIva(){

    double pf;
    String respu="";
    do{
        System.out.println("Por favor introduce el precio de tu producto: ");
        Producto produc = new Producto();
        produc.precioConIva = sc.nextDouble();

        pf = produc.precioConIva /(1.21);
        System.out.println("Tu precio: "+(pf*1.21)+" IVA: "+ IVA +" precio sin IVA "+ pf );
        System.out.print("¿Quieres calcular otro IVA? s / n");
        respu = sc.next();

    }while(respu.equals("s"));

}
}
