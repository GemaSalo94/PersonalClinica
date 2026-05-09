package modelo;

/**
 * Agrupa al personal que realiza tareas sanitarias.
 * Es abstracta porque no existe un "sanitario genérico": solo médicos y enfermeros.
 */
public abstract class Sanitario extends Empleado {

    private String especialidad;

    public Sanitario(String nombre, String dni, String especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
