/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Actividad;
import modelo.Libro;
import modelo.Pagina;
import vista.VistaActividad;
import vista.VistaLibro;
import vista.VistaPrincipal;


public class ControladorLibro {

    private Libro libro;
    private VistaLibro vista;
    private int posicionActual;

    public ControladorLibro(Libro libro, VistaLibro vista) {
        this.libro = libro;
        this.vista = vista;
        posicionActual = 0;
    }

    public void mostrarPagina() {
        Pagina pagina = libro.obtenerPagina(posicionActual);

        if (pagina != null) {
            vista.mostrarContenido(
                    pagina.getTitulo(),
                    pagina.mostrarContenido()
            );
        }
    }

    public void siguientePagina() {
        if (posicionActual < libro.cantidadPaginas() - 1) {
            posicionActual++;
            mostrarPagina();
        }
    }

    public void anteriorPagina() {
        if (posicionActual > 0) {
            posicionActual--;
            mostrarPagina();
        }
    }

    public void volverMenu() {
        VistaPrincipal principal = new VistaPrincipal();
        principal.setVisible(true);
        vista.dispose();
    }

    private Actividad actividad = new Actividad();

    public void abrirActividad() {

        if (posicionActual != libro.cantidadPaginas() - 1) {

            JOptionPane.showMessageDialog(vista,
                    "Primero debes llegar a la página de actividad.");

            return;
        }

        VistaActividad vistaActividad = new VistaActividad();

        ControladorActividad controladorActividad
                = new ControladorActividad(actividad, vistaActividad, vista);

        vistaActividad.setControlador(controladorActividad);

        vistaActividad.setVisible(true);
        vista.setVisible(false);
    }

}//class
