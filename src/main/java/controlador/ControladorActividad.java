/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Actividad;
import vista.VistaActividad;
import vista.VistaLibro;
import vista.VistaResultados;

public class ControladorActividad implements ActionListener {

    private Actividad actividad;
    private VistaActividad vista;
    private VistaLibro vistaLibro;
    private int posicionActual;

    public ControladorActividad(Actividad actividad,
            VistaActividad vista, VistaLibro vistaLibro) {

        this.actividad = actividad;
        this.vista = vista;
        this.vistaLibro = vistaLibro;

        posicionActual = 0;

        actividad.limpiarRespuestas();

        vista.getBtnAnterior().addActionListener(this);
        vista.getBtnSiguiente().addActionListener(this);

        mostrarPregunta();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.getBtnAnterior()) {
            anteriorPregunta();
        }

        if (e.getSource() == vista.getBtnSiguiente()) {
            siguientePregunta();
        }
    }

    public void mostrarPregunta() {

        vista.mostrarResiduo(
                actividad.obtenerImagen(posicionActual));

        vista.seleccionarRespuesta(
                actividad.obtenerRespuesta(posicionActual));
    }

    public void siguientePregunta() {

        if (actividad.getIntentos() >= 3) {

            JOptionPane.showMessageDialog(vista,
                    "Ya realizaste los 3 intentos.");

            verResultados();
            return;
        }

        int respuesta = vista.getRespuestaSeleccionada();

        if (respuesta == 0) {

            JOptionPane.showMessageDialog(vista,
                    "Selecciona un contenedor.");

            return;
        }

        actividad.guardarRespuesta(posicionActual, respuesta);

        if (posicionActual < actividad.cantidadPreguntas() - 1) {

            posicionActual++;
            mostrarPregunta();

        } else {

            finalizarIntento();
        }
    }

    public void anteriorPregunta() {

        if (posicionActual > 0) {

            int respuesta = vista.getRespuestaSeleccionada();

            if (respuesta != 0) {
                actividad.guardarRespuesta(
                        posicionActual, respuesta);
            }

            posicionActual--;
            mostrarPregunta();

        } else {

            volverLibro();
        }
    }

    public void finalizarIntento() {

        if (!actividad.respuestasCompletas()) {

            JOptionPane.showMessageDialog(vista,
                    "Debes responder todas las preguntas.");

            return;
        }

        int puntos = actividad.calcularPuntos();

        if (!actividad.guardarIntento()) {
            verResultados();
            return;
        }

        JOptionPane.showMessageDialog(vista,
                "Obtuviste " + puntos
                + " de 3 respuestas correctas."
                + "\nIntento: " + actividad.getIntentos()
                + " de 3");

        if (puntos == actividad.cantidadPreguntas()) {

            JOptionPane.showMessageDialog(vista,
                    "¡Felicidades! Ayudaste a LOOPI a reciclar.");

            verResultados();

        } else if (actividad.getIntentos() >= 3) {

            verResultados();

        } else {

            actividad.limpiarRespuestas();
            posicionActual = 0;
            mostrarPregunta();
        }
    }

    public void verResultados() {

        VistaResultados vistaResultados = new VistaResultados();

        ControladorResultados controladorResultados
                = new ControladorResultados(
                        actividad, vistaResultados, vista);

        vistaResultados.setControlador(controladorResultados);

        controladorResultados.mostrarResultados();

        posicionActual = 0;
        actividad.limpiarRespuestas();
        mostrarPregunta();

        vistaResultados.setVisible(true);
        vista.setVisible(false);
    }

    public void reiniciarActividad() {

        if (actividad.getIntentos() >= 3) {
            JOptionPane.showMessageDialog(vista,
                    "Ya realizaste los 3 intentos.");
            return;
        }

        posicionActual = 0;

        actividad.limpiarRespuestas();

        mostrarPregunta();

        vista.setVisible(true);
    }

    public void volverLibro() {

        vistaLibro.setVisible(true);
        vista.dispose();
    }

}
