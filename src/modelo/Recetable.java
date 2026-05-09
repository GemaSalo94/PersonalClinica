package modelo;

/**
 * Capacidad transversal para los perfiles que pueden emitir recetas medicas.
 * Se define como interfaz porque médicos y recepcionistas pertenecen a ramas
 * distintas de la jerarquía y no pueden compartir esta funcionalidad por herencia.
 */
public interface Recetable {

    String emitirReceta(String nombrePaciente, String medicamento);
}
