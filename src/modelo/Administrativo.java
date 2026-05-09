package modelo;

/**
 * Agrupa al personal que realiza tareas administrativas.
 * Es abstracta porque no existe un "administrativo genérico": solo recepcionistas y contables.
 */
public abstract class Administrativo extends Empleado {

    private String departamento;

    public Administrativo(String nombre, String dni, String departamento) {
        super(nombre, dni);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
