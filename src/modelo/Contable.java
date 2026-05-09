package modelo;

/**
 * Perfil concreto de contable. No puede ser extendida por otras clases (final).
 */
public final class Contable extends Administrativo {

    public Contable(String nombre, String dni, String departamento) {
        super(nombre, dni, departamento);
    }

    @Override
    public String getDescripcion() {
        return "Contable " + this.getNombre() + " del departamento de " + getDepartamento();
    }

    public String emitirFactura() {
        return getNombre() + " ha emitido una factura.";
    }
}
