package EjerciciosPOO.ClaseContador;

import java.util.Scanner;

public class Principal {

    public static void main (String[] args){

        //Declaramos variables
        Scanner sc = new Scanner(System.in);
        int n;

        //Inicializamos el objeto Contador
        Contador contador1 = new Contador();

        //Definimos un valor para "Cont"
        System.out.print("Escribe tu contador inicial ");
        n=sc.nextInt();
        contador1.setCont(n);

        //incrementar el valor del cont
        contador1.Incrementar();

        System.out.println("Se ha incrementado el valor de cont a: "+ contador1.getCont());

        //Incrementamos dos veces el valor

        contador1.Incrementar();
        contador1.Incrementar();
        System.out.println("Se ha incrementado el valor cont dos veces a: "+ contador1.getCont());

        //Decrementamos una vez

        contador1.Decrementar();
        System.out.println("Se ha decementado el valor de con una vez a: "+ contador1.getCont());

        //Creamos un nuevo objeto inicializado en 10

        Contador contador2 =  new Contador(10);

        //Decrementamos el valor de contador 2 y lo imprimimos

        contador2.Decrementar();
        System.out.println("Se ha decrementado el valor de contador 2 a: " +contador2.getCont());


    }
}
