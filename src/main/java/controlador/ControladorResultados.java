/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Actividad;
import vista.VistaActividad;
import vista.VistaPrincipal;
import vista.VistaResultados;


public class ControladorResultados {

    private Actividad actividad;
    private VistaResultados vista;
    private VistaActividad vistaActividad;

    public ControladorResultados(Actividad actividad,
            VistaResultados vista, VistaActividad vistaActividad) {

        this.actividad = actividad;
        this.vista = vista;
        this.vistaActividad = vistaActividad;
    }

    public void mostrarResultados() {
        vista.mostrarResultados(actividad.obtenerResultados());
    }

    public void volverActividad() {
        vistaActividad.setVisible(true);
        vista.dispose();
    }

    public void volverMenu() {
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        vistaActividad.dispose();
        vista.dispose();
    }
}
