package modelo;

/**
 * Perfil concreto de enfermero. No puede ser extendida por otras clases (final).
 */
public final class Enfermero extends Sanitario {

    public Enfermero(String nombre, String dni, String especialidad) {
        super(nombre, dni, especialidad);
    }

    @Override
    public String getDescripcion() {
        return "Enfermero " + this.getNombre() + " especializado en " + getEspecialidad();
    }

    public String registrarPrueba(String tipoPrueba) {
        return getNombre() + " ha registrado la prueba: " + tipoPrueba;
    }
}
