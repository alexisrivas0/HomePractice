package Ejercicio14;

import java.util.ArrayList;
import java.util.Scanner;

public class Logica {

    private int opcion;
    Scanner sc = new Scanner(System.in);
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private ArrayList<Departamento> listaDepartamentos = new ArrayList<>();

    public void showMenu() {

        do {
            System.out.println("Bienvenido a tu gestión de empleados");
            System.out.println("====================================");
            System.out.println("Elige tu opcion: ");
            System.out.println("O.- Cerrar aplicación ");
            System.out.println("1.- Crear Empleado");
            System.out.println("2.- Mostar empleado");
            System.out.println("3.- Crear Departamento ");
            System.out.println("4.- Mostrar Departamentos");

            opcion = sc.nextInt();
            controles(opcion);
        } while (opcion != 0);
    }

    private void controles(int opcion) {

        switch (opcion) {

            case 0:
                break;
            case 1:
                generarEmpleado();
                break;
            case 2:
                mostrarEmpleado();
                break;
            case 3:
                generarDepartamento();
                break;
            case 4:
                mostrarDepartamento();
                break;
            case 5:
                asignarDirector();
                break;
            case 6:
                asignarEmpleadoDepa();
                break;
            default:
                System.out.println("Has escogido una opcion incorrecta, por favor intantalo de nuevo");
                break;

        }
    }

    public void generarEmpleado() {

        Scanner lc = new Scanner(System.in);

        Empleado empleado = new Empleado();

        System.out.print("Escribe el nombre de tu empleado: ");
        empleado.setNombre(lc.nextLine());
        System.out.print("Escribe el apellido de tu empleado: ");
        empleado.setApellido(lc.nextLine());
        System.out.println("Escribe la direccion del nuevo empleado: ");
        empleado.setDireccion(lc.nextLine());
        System.out.println("Escribe el DNI de tu empleado: ");
        empleado.setDni(lc.nextLine());
        System.out.println("Escribe el email de tu empleado: ");
        empleado.setMail(lc.nextLine());

        listaEmpleados.add(empleado);

    }

    public void mostrarEmpleado() {

        System.out.println("tus empleados usados hasta el momento son los siguientes: ");

        for (Empleado emple : listaEmpleados) {

            System.out.println(listaEmpleados.indexOf(emple) + "-" + emple.toString());
        }
    }

    public void generarDepartamento() {

        Scanner tc = new Scanner(System.in);
        Departamento departamento = new Departamento();

        System.out.print("Escribe el nombre de tu departamento: ");
        departamento.setNombre(tc.nextLine());
        System.out.print("Escribe la ubicacion de tu departamento: ");
        departamento.setUbicacion(tc.nextLine());
        System.out.println("Escribe el telefono de tu departamento ");
        departamento.setTelefono(tc.nextLine());

        listaDepartamentos.add(departamento);
    }

    public void mostrarDepartamento() {

        System.out.println("tus departamentos creados hasta el momento son los siguientes: ");

        for (Departamento depa : listaDepartamentos) {

            System.out.println(listaDepartamentos.indexOf(depa) + "-" + depa.toString());
        }
    }

    public void asignarDirector(){

        int depaselec;
        int empleselec;

        System.out.println("Elige un departamento de la lista: ");
        mostrarDepartamento();
        depaselec =sc.nextInt();
        System.out.println("Elige un empleado a asignar: ");
        mostrarEmpleado();
        empleselec=sc.nextInt();

        Departamento departamentoElegido = listaDepartamentos.get(depaselec);
        Empleado empleadoElegido = listaEmpleados.get(empleselec);

        departamentoElegido.setDirector(empleadoElegido);
    }


    public void asignarEmpleadoDepa(){

        Scanner sc = new Scanner(System.in);
        int departamentoSeleccionado = 0;
        int[] empleadosSeleccionados;

        System.out.println("Departamentos disponibles:");
        mostrarDepartamento();
        System.out.print("Selecciona el departamento al que quieres asignar empleados: ");
        departamentoSeleccionado = Integer.parseInt(sc.nextLine());
        System.out.println("Empleados disponibles: ");
        mostrarEmpleado();
        System.out.print("Selecciona 1 o varios empleados (Separados por coma ej: 1,2,4): ");

    }
}