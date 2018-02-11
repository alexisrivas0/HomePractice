package EjerciciosPOO.Libro;

import java.io.PrintStream;
import java.util.Scanner;

public class Principal {


    //Variables
    Scanner sc = new Scanner(System.in);
    String autor, titulo;
    int numeroEjemplares;

    //Nuevo objeto
    Libro libro1 = new Libro("Don quijote", "Cervantes", 1, 0);

    //Objeto 2

    Libro libro2 = new Libro();

    PrintStream ps = new PrintStream("asl-v20.txt");
    ps.println("Esto es una cadena de caracteres")
    ps.close();

}
