package E01;

public class Empleado {

    private String nombre;
    private String salario;
    private String fechaNacimiento;



    public Empleado() {}

    public Empleado(String nombre, String salario, String fechaNacimiento) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario='" + salario + '\'' +
                ", fecha de Nacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
