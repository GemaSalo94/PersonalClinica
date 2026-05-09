package modelo;

/**
 * Perfil concreto de médico. No puede ser extendida por otras clases (final).
 * Implementa Recetable porque puede emitir recetas médicas.
 */
public final class Medico extends Sanitario implements Recetable {

    public Medico(String nombre, String dni, String especialidad) {
        super(nombre, dni, especialidad);
    }

    @Override
    public String getDescripcion() {
        return "Medico " + this.getNombre() + " especializado en " + getEspecialidad();
    }

    @Override
    public String emitirReceta(String nombrePaciente, String medicamento) {
        return "Doctor "+ getNombre() + " ha emitido una receta para " + nombrePaciente + ": " + medicamento;
    }

    public String consultarPrueba(String tipoPrueba) {
        return getNombre() + " ha consultado la prueba: " + tipoPrueba;
    }
}
