package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase base abstracta para todo el personal de la clínica.
 * No puede instanciarse directamente: solo sirve como raíz de la jerarquía.
 */
public abstract class Empleado {

    private String nombre;
    private String dni;
    private String contrasena;

    private static final String CONTRASENA_POR_DEFECTO = "1234";
    private static final DateTimeFormatter FORMATO_FECHA =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS");

    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.contrasena = CONTRASENA_POR_DEFECTO;
    }

    // --- Métodos comunes a todos los empleados ---

    public String cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
        return nombre + " ha cambiado su contrasena correctamente.";
    }

    public String ficharEntrada() {
        String ahora = LocalDateTime.now().format(FORMATO_FECHA);
        return nombre + " ha fichado la entrada a las " + ahora;
    }

    public String ficharSalida() {
        String ahora = LocalDateTime.now().format(FORMATO_FECHA);
        return nombre + " ha fichado la salida a las " + ahora;
    }

    /**
     * Cada subclase concreta debe proporcionar su propia descripcion de funcion.
     * Se declara abstract para obligar a todas las subclases a implementarlo.
     */
    public abstract String getDescripcion();

    // --- Getters y setters ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // La contraseña no expone getter para no revelarla; solo permite cambiarla
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
