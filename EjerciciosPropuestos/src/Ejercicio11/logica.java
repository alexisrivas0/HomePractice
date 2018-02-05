package Ejercicio11;

import java.util.Scanner;

public class logica {

    String aux;
    int aux2;
    int aux3;
    int opcion;
    Scanner sc = new Scanner(System.in);
    Coche coche = new Coche();

    public void showMenu() {


        System.out.println("Bienvenido");
        System.out.println("====================================");
        System.out.print("por favor rellena los siguientes campos ");
        System.out.print("1.- ¿De que modelo es tu coche? : ");
        coche.setModelo(sc.next());
        System.out.print("2.-¿De que color es tu coche? ");
        coche.setColor(sc.next());
        System.out.print("3.-¿Tiene Pintura mentalizada? ");
        aux = sc.next();
        if (aux.equals("si")) {
            coche.setPinturaMetalizada(true);}
            else if (aux.equals("no")) {
                coche.setPinturaMetalizada(false);}
        System.out.print("4.-¿Cual es la matricula de tu coche? ");
        coche.setMatricula(sc.next());
        System.out.print("5.-¿Que tipo de coche es? 1.- Utilitatio, 2.- Familia, 3.- Deportivo  ");
        aux2 = sc.nextInt();
        if(aux2==1){
            coche.setTipoCoche(Coche.TipoCoche.utilitario);
        }else if(aux2==2){coche.setTipoCoche(Coche.TipoCoche.familiar);}
        else if(aux2==3){coche.setTipoCoche(Coche.TipoCoche.deportivo);}
        else{System.out.println("Has introducido un numero incorrecto"); }

        System.out.print("5.- ¿De que año es tu coche? ");
        coche.setAño(sc.next());
        System.out.print("6.- ¿Que modelidad de seguro tiene? 1.- A terceros 2.- A todoresgisgo ");
        aux3=sc.nextInt();
        if(aux3==1){coche.setModalidadSeguro(Coche.ms.terceros);}
        else if(aux3==2){coche.setModalidadSeguro(Coche.ms.TodoRiesgo);}else{
            System.out.println("Has escogido una opcion erronea"); }
        System.out.println("Tu coche tiene las siguientes caracteristicas:");
        System.out.println(" Modelo: " + coche.getModelo());
        System.out.println("Color: " + coche.getColor());
        System.out.println("Pintura Metalizada: " );
        System.out.println("Matricula: " + coche.getMatricula());
        System.out.println("Tipo de coche: " + coche.getTipoCoche());
        System.out.println("Año: " + coche.getAño());
        System.out.println("Modalidad de Seguro: " + coche.getModalidadSeguro());

            }
        }
