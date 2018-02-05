package Ejercicio11;

/*

 ¿ Como restringir el setter de tipoCoche y modalidadSeguro para que sean solo esas opciones ?

 */

public class Coche {

    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private String matricula;
    public enum  TipoCoche {utilitario, familiar , deportivo}
    private String tipoCoche;
    private String año;
    private String modalidadSeguro; //terceros, todoriegos
    public enum ms {terceros, TodoRiesgo}


    public Coche() {
    }

    public Coche(String modelo, String color, boolean pinturaMetalizada, String matricula, String tipoCoche, String año, String modalidadSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.año = año;
        this.modalidadSeguro = modalidadSeguro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        if(this.pinturaMetalizada = true){
            System.out.println("Si tiene pintura metalizada");
        }else{
            System.out.println("no tiene pintura metalizada");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(TipoCoche type) {
        this.tipoCoche = type.toString();
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(ms Moda) {
        this.modalidadSeguro = Moda.toString();
    }
}