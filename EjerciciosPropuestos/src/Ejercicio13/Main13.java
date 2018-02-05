package Ejercicio13;

public class Main13 {

/*


 Por revisar con el profe por si existe una manera mas sencilla de realizarlo.


 */
    public static void main(String [] args){



        Punto punto1 = new Punto();
        Punto punto2 = new Punto();

        punto1.setCoordenadaX(7);
        punto1.setCoordenadaY(5);

        punto2.setCoordenadaX(4);
        punto2.setCoordenadaY(1);
        Operacion op = new Operacion();
        op.distanciaPuntos(punto1, punto2);

    }
}
