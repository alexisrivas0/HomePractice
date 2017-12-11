package EjercicioBuclesAnidados;


public class NumerosPerfectosDel00Al1000 {

    public static void main(String[] args) {

        int numer, i,suma;

        for (numer = 1; numer <= 1000; numer++) {
            suma=0;
            for (i = 1; i < numer; i++) {
                if (numer % i == 0) {
                    suma = suma + i;
                }
            }
            if (numer == suma) {
                System.out.println(numer);
            }
        }


    }
}