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
import vista.GUI_Menu;

/**
 *
 * @author carva
 */
public class ControladorSistema {
    //Llamar a la clase con ArrayList
    
    //LLamar a las vistas
    private GUI_Menu menu = new GUI_Menu();
    private GUI_Juego juego = new GUI_Juego();
    private GUI_Fin fin = new GUI_Fin();
    private BancoPreguntas banco = new BancoPreguntas();
    private Arreglos arreglos = new Arreglos();

    //Conexión a las vistas del proyecto.
    public ControladorSistema() {
        menu.setControlador(this);
        juego.setControlador(this);
        fin.setControlador(this);
    }//Fin del constructor.
    
    public void Iniciar(){
        menu.setLocationRelativeTo(null); //Nos permite que al ejecutar el juego se centre la ventana.
        menu.setVisible(true); //Un método que hace que se vea la ventana sí es true.
    }//Fin del método Iniciar.
    
    public void Salir(){
        System.exit(0);
    }//Fin del método Salir.
    
    public void abrirJuego(){
        menu.setVisible(false);
        juego.setLocationRelativeTo(null);
        juego.setVisible(true);
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
