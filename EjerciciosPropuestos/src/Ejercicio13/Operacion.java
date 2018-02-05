package Ejercicio13;

public class Operacion extends Punto{

    Punto punto1 = new Punto();
    Punto punto2 = new Punto();
    Punto punto0 = new Punto(0,0);
    private double resultado;

    public void distanciaPuntos(Punto punto1, Punto punto2){

        double restaA = punto1.getCoordenadaX()-punto2.getCoordenadaX();
        double restaB = punto1.getCoordenadaY()-punto2.getCoordenadaY();
        double cuadradoA = Math.pow(2,restaA);
        double cuadraddoB = Math.pow(2, restaB);
        double sumaF = cuadradoA+cuadraddoB;

       resultado = Math.sqrt(sumaF);

        System.out.println(resultado);

    }

    public void distanciaCentro(Punto punto, Punto punto0){

        double restaA1 = punto.getCoordenadaX()-punto0.getCoordenadaX();
        double restaB1 = punto.getCoordenadaY()-punto0.getCoordenadaY();
        double cuadradoA1 = Math.pow(2,restaA1);
        double cuadraddoB1 = Math.pow(2, restaB1);
        double sumaF = cuadradoA1+cuadraddoB1;

        resultado = Math.sqrt(sumaF);

        System.out.println(resultado);

    }

}
