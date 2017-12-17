package EjerciciosPOO.CuentaBancaria;

import java.util.Scanner;

public class Principal {

    public static void main (String [] args){


        Scanner sc =  new Scanner(System.in);
        String nombre, numero;
        double tipo, importe;

        //Se crea cuenta1 sin parametros
        //Se ejecuta el constructor pr defecto

        Cuenta cuenta1 = new Cuenta();

        System.out.print("Nombre : ");
        nombre = sc.nextLine();
        System.out.println("numero de cuenta : ");
        numero = sc.nextLine();
        System.out.println("Tipo de interes : ");
        tipo = sc.nextDouble();
        System.out.println("Saldo : ");
        importe = sc.nextDouble();

        cuenta1.setNombreCliente(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoDeInteres(tipo);
        cuenta1.setSaldo(importe);

        //Se crea el objeto cuenta2 con los valores leidos por teclado
        //Se ejecuta el constructor con parametros

        Cuenta cuenta2 = new Cuenta("Ramon","123123123",12,1500);

        //se crea la cuenta3 como copia de la cuenta cuenta1

        Cuenta cuenta3 =  new Cuenta(cuenta1);

        //mostrar los datos de cuenta 1

        System.out.println("Datos de la cuenta1");
        System.out.println("Nombre del titular: "+ cuenta1.getNombreCliente());
        System.out.println("Numero de cuenta: "+ cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interes: "+cuenta1.getTipoDeInteres());
        System.out.println("Saldo disponible:" +cuenta1.getSaldo());
        System.out.println();

        //realizar un ingreso a la cuenta

        cuenta1.ingreso(4000);

        //mostrar el saldo de la cuenta1 despues del ingreso

        System.out.println("Saldo: "+cuenta1.getSaldo());

        //mostrar los datos de la cuenta2

        System.out.println("Datos de la cuenta2");
        System.out.println("Nombre del titular: "+ cuenta2.getNombreCliente());
        System.out.println("Numero de cuenta: "+ cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interes: "+cuenta2.getTipoDeInteres());
        System.out.println("Saldo disponible:" +cuenta2.getSaldo());
        System.out.println();

        //mostrar los datos de la cuenta3

        System.out.println("Datos de la cuenta3");
        System.out.println("Nombre del titular: "+ cuenta3.getNombreCliente());
        System.out.println("Numero de cuenta: "+ cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interes: "+cuenta3.getTipoDeInteres());
        System.out.println("Saldo disponible:" +cuenta3.getSaldo());
        System.out.println();

        //realizar una transferencia de 10€ desde cuenta3 a cuenta2

        cuenta3.transferencia(cuenta2, 10);

        //mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //mostrar el saldo de cuenta3
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();
}
}
