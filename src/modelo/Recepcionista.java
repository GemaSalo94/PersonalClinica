package modelo;

/**
 * Perfil concreto de recepcionista. No puede ser extendida por otras clases (final).
 * Implementa Recetable aunque su comportamiento difiere del del médico:
 * imprime la receta en lugar de emitirla clínicamente.
 */
public final class Recepcionista extends Administrativo implements Recetable {

    public Recepcionista(String nombre, String dni, String departamento) {
        super(nombre, dni, departamento);
    }

    @Override
    public String getDescripcion() {
        return "Recepcionista " + this.getNombre() + " del departamento de " + getDepartamento();
    }

    /**
     * Implementacion distinta a la del médico: la recepcionista imprime fisicamente la receta,
     * no la emite con criterio clinico.
     */
    @Override
    public String emitirReceta(String nombrePaciente, String medicamento) {
        return "Administrativo " + getNombre() + " (recepcionista) ha impreso una receta para "
                + nombrePaciente + ": " + medicamento;
    }
}
