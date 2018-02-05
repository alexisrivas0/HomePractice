package Ejercicio15;


import java.util.ArrayList;
import java.util.Scanner;

public class Logica {

    private int opcion;
    Scanner sc = new Scanner(System.in);
    private ArrayList<Persona> listaPersonas = new ArrayList<>();

    public void showMenu() {

        do {
            System.out.println("Bienvenido a tu gestión de personas");
            System.out.println("====================================");
            System.out.println("Elige tu opcion: ");
            System.out.println("O.- Cerrar aplicación ");
            System.out.println("1.- Crear nueva persona");
            System.out.println("2.- Mostar persona");
            System.out.println("3.- ¿Existen dos personas igual? ");
            System.out.println("4.- ¿Cuantas personas hay creadas?");

            opcion = sc.nextInt();
            controles(opcion);
        } while (opcion != 0);
    }

    private void controles(int opcion) {

        switch (opcion) {

            case 0:
                break;
            case 1:
                nuevaPersona();
                break;
            case 2:
                mostrarPersonas();
                break;
            case 3:
                personasIguales();
                break;
            case 4:
                personasCreadas();
                break;
            default:
                System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                break;

        }


    }

    private void nuevaPersona(){

        Scanner ls = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Escribe el nombre de tu persona: ");
        persona.setNombre(ls.nextLine());
        System.out.println("Escribe el DNI de tu persona: ");
        persona.setDni(ls.nextLine());

        listaPersonas.add(persona);
    }

    private void mostrarPersonas(){

        System.out.println("las personas que has añadido son las siguientes: ");
        for (Persona personas : listaPersonas) {

            System.out.println(personas.toString());
        }
    }

    private void personasIguales(){

        Persona person = new Persona();

        for (int i = 0; i<listaPersonas.size(); i++){

            person = listaPersonas.get(i);
            String a = person.getNombre();
            String b = person.getDni();

            for (int h = i+1; h<listaPersonas.size();h++){

               String c =  listaPersonas.get(h).getNombre();
               String d = listaPersonas.get(h).getDni();
                if(a.equals(c)&&b.equals(d)){
                    System.out.println(person.toString()+" es igual a: "+ listaPersonas.get(h).toString());
                }else{
                    int sdf = 2+2;
                }
            }

        }

       }

    private void personasCreadas(){


        System.out.println("Existen "+(listaPersonas.size())+ " Personas guardadas");
    }
    }



