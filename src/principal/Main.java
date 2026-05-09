package principal;

import modelo.Contable;
import modelo.Empleado;
import modelo.Enfermero;
import modelo.Medico;
import modelo.Recepcionista;
import modelo.Recetable;

import java.util.ArrayList;
import java.util.List;

/**
 * Programa principal que demuestra el uso del modelo de personal de la clinica.
 *
 * La coleccion es de tipo List<Empleado>, lo que permite almacenar cualquier
 * subclase y recorrerla de forma uniforme (ligadura dinamica).
 */
public class Main {

    public static void main(String[] args) {

        // --- Creacion de empleados con datos de ejemplo ---
        Medico medico = new Medico("Sara Lopez", "11111111A", "Cardiologia");
        Enfermero enfermero = new Enfermero("Anibal Ruiz", "22222222B", "Urgencias");
        Recepcionista recepcionista = new Recepcionista("Anastasio Torres", "33333333C", "Atencion al paciente");
        Contable contable = new Contable("Guadalupe Perez", "44444444D", "Finanzas");

        // La lista es de tipo Empleado: cualquier subtipo cabe aqui
        List<Empleado> plantilla = new ArrayList<>();
        plantilla.add(medico);
        plantilla.add(enfermero);
        plantilla.add(recepcionista);
        plantilla.add(contable);

        // Datos fijos usados para las pruebas de receta
        String pacienteEjemplo = "Juan Gomez";
        String medicamentoEjemplo = "Ibuprofeno 600mg";

        // --- Recorrido de la plantilla ---
        for (Empleado empleado : plantilla) {

            // Comportamiento comun a todos los empleados (ligadura dinamica en ficharEntrada/Salida)
            System.out.println(empleado.ficharEntrada());

            // getDescripcion() se resuelve en tiempo de ejecucion segun el tipo real del objeto
            System.out.println(empleado.getDescripcion());

            // Cambio de contrasena (comun, definido en Empleado)
            empleado.cambiarContrasena("nueva1234");

            // Comportamientos especificos segun el tipo real del empleado
            if (empleado instanceof Medico m) {
                System.out.println(m.consultarPrueba("Ecocardiograma"));
            }

            if (empleado instanceof Enfermero e) {
                System.out.println(e.registrarPrueba("Analisis de sangre"));
            }

            // Recetable es la interfaz comun a Medico y Recepcionista.
            // Aqui ya se ha mostrado para el medico; solo lo mostramos si es Recepcionista
            // para no duplicar la salida del medico. En un sistema real podria unificarse.

            if (empleado instanceof Recetable r) {
                
                System.out.println(r.emitirReceta(pacienteEjemplo, medicamentoEjemplo));
            }

            System.out.println(empleado.ficharSalida());
            System.out.println(); // separador entre empleados
        }
    }
}
