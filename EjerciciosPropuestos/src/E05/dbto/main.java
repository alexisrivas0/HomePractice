package E05.dbto;

import E05.enums.EnumCategorias;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Logical logical = new Logical();


        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=================================");
            System.out.println("=                               =");
            System.out.println("= BIENVENIDO A LA COMPRA ALEGRE =");
            System.out.println("=   ELIJA UNA OPCION POR FAVOR  =");
            System.out.println("=                               =");
            System.out.println("=================================");
            System.out.println("");
            System.out.println("1.- DAR DE ALTA UN PRODUCTO");
            System.out.println("2.- ELIMINAR UN PRODUCTO");
            System.out.println("3.- LISTA DE PRODUCTOS EXISTENTES");
            System.out.println("4.- MOSTRAR EL STOCK DE UN PRODUCTO");
            System.out.println("5.- MOSTRAR PRODUCTORS CON UN STOCK MENOR A 5");
            System.out.println("");
            System.out.println("0.- Salir");
            System.out.println("");

            opcion = sc.nextInt();

            switch (opcion) {

                case 0:
                    break;
                case 1:
                    logical.NuevoProducto();
                    break;
                case 2:
                    logical.EliminarProducto();
                    break;
                case 3:
                    logical.ProductosDiponibles();
                    break;
                case 4:
                    logical.ConsularStock();
                    break;
                case 5:
                    logical.StockMenorA();
                    break;
                default:
                    System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                    break;

            }

        } while (opcion != 0);

    }
    }

