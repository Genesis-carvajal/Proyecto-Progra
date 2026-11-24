/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Arreglos;
import modelo.BancoPreguntas;
import modelo.IntentoFueraDeRangoException;
import modelo.Pagina;
import modelo.PaginaNoExisteException;
import modelo.RespuestaInvalidaException;
import vista.GUI_Fin;
import vista.GUI_Juego;
import vista.VistaActividad;


    
    //LLamar a las vistas
<<<<<<< HEAD
   public class ControladorSistema {
=======
    private GUI_Menu menu = new GUI_Menu();
    private GUI_Juego juego = new GUI_Juego();
    private GUI_Fin fin = new GUI_Fin();
    private BancoPreguntas banco = new BancoPreguntas();
    private Arreglos arreglos = new Arreglos();
>>>>>>> f8e1ab6dac1b2dab9e795983cf54d8eee27bf0bf

    // Llamar a las ventanas del proyecto
    private GUI_Juego juego = new GUI_Juego();
    private VistaActividad actividad = new VistaActividad();

    // Constructor del controlador
    public ControladorSistema() {

        // Conectar la acción de jugar
        juego.setAccionJugar(() -> abrirPrimeraActividad());

    }

    // Método para iniciar el programa
    public void Iniciar() {

        juego.setLocationRelativeTo(null);
        juego.setVisible(true);
<<<<<<< HEAD

    }

    // Método para abrir la primera actividad
    public void abrirPrimeraActividad() {

        juego.setVisible(false);

        actividad.setLocationRelativeTo(null);
        actividad.setVisible(true);

    }

    // Método para salir del programa
    public void Salir() {

        System.exit(0);

    }

}
=======
    }//Fin del método abrirJuego.
    
    public void menuAnterior(){
        GUI_Juego volver = new GUI_Juego();
        
    }//Fin del método menuAnterior.
    
    public void mostrarPregunta(int capitulo, int numeroPregunta) {
    try {
        Pagina pregunta = banco.obtenerPregunta(capitulo, numeroPregunta);
        // aquí mandas pregunta.mostrarContenido() a la vista
    } catch (PaginaNoExisteException e) {
        juego.mostrarError(e.getMessage());
    }
}

public void guardarRespuesta(int pregunta, int respuesta) {
    try {
        arreglos.registrarRespuestas(pregunta, respuesta);
    } catch (RespuestaInvalidaException e) {
        juego.mostrarError(e.getMessage());
    }
}

public void finalizarIntento() {
    try {
        int correctas = arreglos.calcularCorrectas();
        arreglos.registrarIntentos();
        // aquí abres GUI_Fin y muestras "correctas"
    } catch (RespuestaInvalidaException | IntentoFueraDeRangoException e) {
        juego.mostrarError(e.getMessage());
    }
}
    
}//Fin de la clase ControladorSistema.
>>>>>>> f8e1ab6dac1b2dab9e795983cf54d8eee27bf0bf
