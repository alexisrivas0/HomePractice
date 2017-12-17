package EjerciciosPOO.CuentaBancaria;

/**
 * Esta es una clase cuenta para representar un cuenta bancaria
 */

public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoDeInteres;
    private double saldo;

    //Contructor por defecto

    public Cuenta(){};

    //Contructor con parametros

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoDeInteres, double saldo){

        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoDeInteres = tipoDeInteres;
        this.saldo = saldo;

    }

    //Contructor copia

    public Cuenta(final Cuenta c){

        this.nombreCliente = c.nombreCliente;
        this.numeroCuenta = c.numeroCuenta;
        this.tipoDeInteres = c.tipoDeInteres;
        this.saldo = c.saldo;

    }

    //Getters y Setters

    public void setNombreCliente(String nombreCliente){

        this.nombreCliente = nombreCliente;
    }
    public String getNombreCliente(){

        return nombreCliente;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public String getNumeroCuenta(){

        return numeroCuenta;
    }
    public void setTipoDeInteres(double tipoDeInteres){
        this.tipoDeInteres = tipoDeInteres;
    }
    public double getTipoDeInteres(){
        return tipoDeInteres;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    //Metodo
    //Metodo ingreso
    public boolean ingreso(double n){

        boolean ingresoCorrecto = true;

        if (n<0){
            ingresoCorrecto=false;
        }else{
            saldo=saldo+n;
        }
        return ingresoCorrecto;
    }
    //Metodo reintegro
    public boolean reintegro(double n){

        boolean reintegroCorrecto = true;
        if(n<0){
            reintegroCorrecto=false;
        }else if (saldo>=n){
            saldo -= n;
        }else{
            reintegroCorrecto=false;
        }
        return reintegroCorrecto;
    }

    //Metodo transferencia
    public boolean transferencia (Cuenta c, double n){

        boolean correcto = true;
        if(n<0){
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
    }




