package E05.enums;

public enum EnumCategorias {

    CARNES(001),
    FRUTAS_Y_VERDURAS(002),
    GRANOS(003),
    LICORES(004),
    MANUFACTURADOS(005),;

    private int codigoD;

    private EnumCategorias(int codigoD){
        this.codigoD = codigoD;
    }

    public int getCodigoD() {
        return codigoD;
    }
}
