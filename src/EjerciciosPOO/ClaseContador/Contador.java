package EjerciciosPOO.ClaseContador;

public class Contador {

    //Atributos

    private int cont;

    //Contructor por defecto

    public Contador(){}

    //Contructor con atributos

    public Contador(int cont){

        if(cont<0){
            this.cont=0;
        }else{
        this.cont=cont;}
    }

    //Constructor copia

    public Contador(final Contador c){

        this.cont = c.cont;
    }

    //Metodos Getters y Setters

    public void setCont(int cont){

        if(cont<0){
        this.cont = 0;}
        else {this.cont= cont;}
    }
    public int getCont(){

        return cont;
    }

    public void Incrementar(){

        cont ++;
    }

    public void Decrementar(){

        cont--;

        if(cont<0){cont=0;}
    }

}
